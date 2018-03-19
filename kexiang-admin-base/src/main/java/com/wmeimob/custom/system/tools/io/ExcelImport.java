package com.wmeimob.custom.system.tools.io;

import java.util.List;

/**
 * Created by Shinez on 2017/10/19.
 */
public interface ExcelImport<T> {

    /**
     * 通过columns参数（即Excel的每一行中单元格的数据转换成字符串后的集合），解析为具体的一个对象。
     *
     * @param columns 单元格的数据转换成字符串后的集合
     * @return 该类的泛型的一个实例
     */
    List<T>  getObjList(List<String> columns) throws Exception;

}
