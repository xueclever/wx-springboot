/**
 * 文件名：ExcelHelp.java
 * 版权所有： ShiNez
 * 文件版本：v1.0.0
 * 最后修改时间：2016-3-12
 */
package com.wmeimob.custom.system.tools.io;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Excel工具类
 * Created by ShiNez on 2016-3-12.
 */
public final class ExcelHelper {


    /**
     * 导出
     *
     * @param srcList
     * @param headNames
     * @param dataFieldNames
     * @param tClass
     * @param <T>
     * @return
     * @throws IOException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchFieldException
     */
    public static <T> HSSFWorkbook exportFromList(List<T> srcList, String[] headNames, String[] dataFieldNames, Class<T> tClass) throws IOException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        return exportFromList(srcList, headNames, (obj -> {
            List<String> objectFieldValues = new ArrayList<>();
            Field field;
            for (int i = 0; i < dataFieldNames.length; i++) {
                field = tClass.getDeclaredField(dataFieldNames[i]);
                field.setAccessible(true);
                String val = String.valueOf(field.get(obj) == null ? "" : field.get(obj));
                objectFieldValues.add(val);
            }
            return objectFieldValues;
        }));
    }

    /**
     * 导出Excel
     *
     * @param srcList     list集合，数据源
     * @param headNames   表头集合，定义生成的Excel的表头文字
     * @param excelExport 导出实现类
     * @return
     */
    public static <T> HSSFWorkbook exportFromList(List<T> srcList, String[] headNames, ExcelExport<T> excelExport) throws IOException, NoSuchFieldException, IllegalAccessException {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("sheet1");
        HSSFRow row0 = sheet.createRow(0);
        HSSFCellStyle cellStyle = wb.createCellStyle();
        //粗体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        cellStyle.setFont(font);
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //建立表头
        for (int i = 0; i < headNames.length; ++i) {
            HSSFCell cell = row0.createCell(i);
            cell.setCellValue(headNames[i]);
            cell.setCellStyle(cellStyle);
        }
        //填充数据
        HSSFRow row;
        HSSFCell cell;
        HSSFCellStyle dataCellStyle = wb.createCellStyle();
        for (int i = 0; i < srcList.size(); i++) {
            row = sheet.createRow(i + 1);
            T obj = srcList.get(i);
            List<String> columns = excelExport.getColumns(obj);
            for (int j = 0; j < columns.size(); ++j) {
                cell = row.createCell(j);
                cell.setCellValue(columns.get(j));
                cell.setCellStyle(dataCellStyle);
                sheet.setDefaultColumnStyle(j, cellStyle);
            }
        }
        return wb;
    }

    /**
     * 导出Excel
     *
     * @param srcList     list集合，数据源
     * @param headNames   表头集合，定义生成的Excel的表头文字
     * @param folder      目标文件夹，生成的Excel将写入此路径下
     * @param excelExport 导出实现类
     * @return
     */
    public static <T> void outputExcelFromList(List<T> srcList, List<String> headNames, String folder, ExcelExport<T> excelExport, OutputStream out) throws NoSuchFieldException, IllegalAccessException, IOException {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("sheet1");
        HSSFRow row0 = sheet.createRow(0);
        HSSFCellStyle cellStyle = wb.createCellStyle();
        //粗体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        cellStyle.setFont(font);
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //建立表头
        for (int i = 0; i < headNames.size(); ++i) {
            HSSFCell cell = row0.createCell(i);
            cell.setCellValue(headNames.get(i));
            cell.setCellStyle(cellStyle);
        }

        //填充数据
        HSSFRow row;
        HSSFCell cell;
        HSSFCellStyle dataCellStyle = wb.createCellStyle();
        for (int i = 0; i < srcList.size(); i++) {
            row = sheet.createRow(i + 1);
            T obj = srcList.get(i);
            List<String> columns = excelExport.getColumns(obj);
            for (int j = 0; j < columns.size(); ++j) {
                cell = row.createCell(j);
                cell.setCellValue(columns.get(j));
                cell.setCellStyle(dataCellStyle);
                sheet.setDefaultColumnStyle(j, cellStyle);
            }
        }
        wb.write(out);
        out.close();
    }


    /**
     * 解析Excel导入
     *
     * @param <T>
     * @param file      文件块 该参数依赖于spring framework
     * @param tClass    类型
     * @param fieldsArr 字段名称数组
     * @return 返回对象的List集合
     */
    public static <T> List<T> importFromFile(MultipartFile file, Class<T> tClass, String... fieldsArr) throws Exception {
        return importFromFile(file, columns -> {
            T t = tClass.newInstance();
            List<T> list = new ArrayList<>();
            Field field;
            for (int i = 0; i < fieldsArr.length; i++) {
                field = tClass.getDeclaredField(fieldsArr[i]);
                field.setAccessible(true);
                Object value = DataTypeConverter.parse(field.getType(),columns.get(i));
                field.set(t, value);
            }

            list.add(t);
            return list;
        });
    }


    /**
     * 解析Excel导入
     *
     * @param file        文件块 该参数依赖于spring framework
     * @param excelImport 导入接口实现
     * @return 返回对象的List集合
     * @throws IOException
     */
    public static <T> List<T> importFromFile(MultipartFile file, ExcelImport<T> excelImport) throws Exception {
        Workbook wb;
        Sheet sheet;
        try {
            wb = new XSSFWorkbook(file.getInputStream());
        } catch (Exception e) {
            wb = new HSSFWorkbook(file.getInputStream());
        }
        sheet = wb.getSheetAt(0);
        List<T> list = new ArrayList<>();
        Row row;
        Cell cell;
        List<String> columns;
        for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            columns = new ArrayList<>();
            boolean allFieldValidFlag = false;
            for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                String val = "";
                if (cell != null) {
                    cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                    val = cell.getStringCellValue();
                }
                if (val != null && !"".equals(val) && !"".equals(val.trim())) {
                    allFieldValidFlag = true;
                }
                columns.add(val);
            }
            if (!allFieldValidFlag) continue;
            List<T> t = excelImport.getObjList(columns);
            list.addAll(t);
        }
        return list;
    }

    /**
     * 导出到文件
     *
     * @param list
     * @param heads
     * @param fieldStr
     * @param tClass
     * @param fileName
     * @param response
     * @param <T>
     * @throws NoSuchFieldException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IOException
     */
    public static <T> void exportFromListToStream(List<T> list, String[] heads, String[] fieldStr, Class<T> tClass, String fileName, HttpServletResponse response) throws NoSuchFieldException, InstantiationException, IllegalAccessException, IOException {
        HSSFWorkbook wb = exportFromList(list, heads, fieldStr, tClass);
        OutputStream out = response.getOutputStream();
        response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(fileName + ".xlsx", "UTF-8"));
        wb.write(out);
        out.close();
    }
}
