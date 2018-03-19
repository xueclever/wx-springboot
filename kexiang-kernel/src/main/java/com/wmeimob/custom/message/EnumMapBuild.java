package com.wmeimob.custom.message;

import java.util.HashMap;
import java.util.Map;

/**
 *  Created by Shinez
 * 自定义枚举初始化器
 */
abstract class EnumMapBuild {

    abstract Enum[] callbackGetValues();
    abstract Integer callbackGetID(Enum enum_obj);
    abstract String callbackGetName(Enum enum_obj);

    /**
     * Integer-String 枚举类型Map初始化器
     * @returni
     */
    static Map<Integer,String> initEnumMap(EnumMapBuild enumMapBuild){
        Map<Integer,String> map = new HashMap<>();
        Enum[] enums = enumMapBuild.callbackGetValues();
        int i=0;
        while (i<enums.length)
        {
            map.put(enumMapBuild.callbackGetID(enums[i]),enumMapBuild.callbackGetName(enums[i]));
            ++i;
        }
        return map;
    }
}
