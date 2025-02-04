package com.shanzhu.em.utils;



/**
 * 对象 {@link R} 数据处理工具
 *
 * @author: Wyx18373256
 * @date: 2022-02-20
 */
public class ApiResultHandler {

    public static R success(Object object) {
        R r = new R();
        r.setData(object);
        r.setCode(200);
        r.setMessage("请求成功");
        return r;
    }

    public static R success() {
        return success(null);
    }

    public static <T> R buildApiResult(Integer code, String message, T data) {
        R r = new R();
        r.setCode(code);
        r.setMessage(message);
        r.setData(data);
        return r;
    }

}
