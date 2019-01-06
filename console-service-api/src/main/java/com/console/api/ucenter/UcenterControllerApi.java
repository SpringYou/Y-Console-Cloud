package com.console.api.ucenter;

import com.console.framework.domain.ucenter.ext.UserExt;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by Eason.
 */
@Api(value = "用户中心",description = "用户中心管理")
public interface UcenterControllerApi {
    @ApiOperation("根据用户账号查询用户信息")
    public UserExt getUserext(String username);
}
