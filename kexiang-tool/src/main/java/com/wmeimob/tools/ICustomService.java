package com.wmeimob.tools;

import java.util.List;
import java.util.Map;

/**
 * Created by Shinez on 2017/2/26.
 */
public interface ICustomService<T> {

    default void add(Map map){
        throw new RuntimeException("method not defined");
    }

    default void add(T t){
        throw new RuntimeException("method not defined");
    }

    default void addSelective(Map map){
        throw new RuntimeException("method not defined");
    }

    default void addSelective(T t){
        throw new RuntimeException("method not defined");
    }



    default int del(int id){
        throw new RuntimeException("method not defined");
    }

    default int del(Map map){
        throw new RuntimeException("method not defined");
    }

    default int delByLogic(int id){
        throw new RuntimeException("method not defined");
    }

    default int delByLogic(Map map){
        throw new RuntimeException("method not defined");
    }




    default int modifySelective(Map map){
        throw new RuntimeException("method not defined");
    }

    default int modifySelective(T t){
        throw new RuntimeException("method not defined");
    }

    default int modify(Map map){
        throw new RuntimeException("method not defined");
    }

    default int modify(T t){
        throw new RuntimeException("method not defined");
    }


    default int save(Map map){
        throw new RuntimeException("method not defined");
    }

    default int save(T t){
        throw new RuntimeException("method not defined");
    }

    default int saveSelective(Map map){
        throw new RuntimeException("method not defined");
    }

    default int saveSelective(T t){
        throw new RuntimeException("method not defined");
    }



    default List<Map<String,Object>> queryMaps(Map map){
        throw new RuntimeException("method not defined");
    }

    default List<Map<String,Object>> queryMaps(T t){
        throw new RuntimeException("method not defined");
    }

    default List<T> queryObjects(Map map){
        throw new RuntimeException("method not defined");
    }

    default List<T> queryObjects(T t){
        throw new RuntimeException("method not defined");
    }


    default T queryObject(T t){
        throw new RuntimeException("method not defined");
    }

    default T queryObject(int id){
        throw new RuntimeException("method not defined");
    }

    default T queryObject(Map map){
        throw new RuntimeException("method not defined");
    }

    default Map<String,Object> queryMap(int i){
        throw new RuntimeException("method not defined");
    }

    default Map<String,Object> queryMap(T t){
        throw new RuntimeException("method not defined");
    }

    default Map<String,Object> queryMap(Map map){
        throw new RuntimeException("method not defined");
    }


}
