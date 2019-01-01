package com.console.framework.exception;

import com.console.framework.model.response.ResultCode;

/**
 * @Author: yang
 * @Description:
 * @Date:Create In 14:27 2018/11/16
 * @Modified By:
 */
public class CustomException extends RuntimeException {

    private ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        // 异常信息为错误代码 + 异常信息
        super("错误代码：" + resultCode.code() + "错误信息：" + resultCode.message());
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return this.resultCode;
    }
}
