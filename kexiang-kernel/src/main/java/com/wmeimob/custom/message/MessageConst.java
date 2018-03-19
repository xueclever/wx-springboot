package com.wmeimob.custom.message;


import java.util.Map;

/**
 *  Created by Shinez
 * 提示类目
 */
public final class MessageConst extends EnumMapBuild {


    public static boolean showInfo = true;

    private final static Map<Integer, String> map = initEnumMap(new MessageConst());

    protected Enum[] callbackGetValues() {
        return Msg.values();
    }

    protected Integer callbackGetID(Enum enum_obj) {
        return ((Msg) enum_obj).id;
    }

    protected String callbackGetName(Enum enum_obj) {
        return ((Msg) enum_obj).info;
    }


    public enum Msg {
        HANDLE_FAIL(-1, "fail"),//通用失败
        SUCCESS(0, "success"),//成功

        ILLEGAL_PARAM(4001, "非法参数");



        public final Integer id;
        public final String info;

        Msg(int i, String info) {
            this.id = i;
            this.info = info;
        }
    }

    public static String info(Integer id) {
        String info = map.get(id);
        if (info == null || info.trim().equals("")) {
            info = "未声明的响应标识";
        }
        return info;
    }

    public static String info(Msg msg) {

        return info(msg.id);
    }

}


