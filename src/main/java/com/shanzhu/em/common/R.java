package com.shanzhu.em.common;

import com.shanzhu.em.constants.Status;
import lombok.Data;

/**
 * 接口返回对象封装 - Result
 *
 * @author: Wyx18373256
 * @date: 2022-02-10
 */
@Data
public class R<T> {

    /**
     * 状态码
     */
    private String code;

    /**
     * 状态消息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    public static R<Void> success() {
        return new R<>(Status.CODE_200, "操作成功", null);
    }

    public static <T> R<T> success(T data) {
        return new R<>(Status.CODE_200, "操作成功", data);
    }

    public static R<Void> error() {
        return new R<>(Status.CODE_500, null, null);
    }

    public static R<Void> error(String code, String msg) {
        return new R<>(code, msg, null);
    }

    public R<T> code(String code) {
        this.code = code;
        return this;
    }

    public R() {
    }

    public R(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
