package com.console.framework.model.response;


import com.console.framework.exception.CustomException;

/**
 * @Author: yang
 * @Description:
 * @Date:Create In 14:29 2018/11/16
 * @Modified By:
 */
public class ExceptionCast {

    // 使用此静态方法抛出自定义异常
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
