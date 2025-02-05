package com.shanzhu.em.exception;

/**
 * 业务异常
 * 在业务运行中，抛出的异常错误
 *
 * @author: Wyx18373256
 * @date: 2022-02-10
 */
public class BizException extends RuntimeException {

    /**
     * 错误码
     */
    private String code;

    public BizException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
