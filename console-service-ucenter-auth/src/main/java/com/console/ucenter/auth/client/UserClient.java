package com.console.ucenter.auth.client;

import com.console.framework.client.ConsoleServiceList;
import com.console.framework.domain.ucenter.ext.UserExt;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator.
 */
@FeignClient(value = ConsoleServiceList.CONSOLE_SERVICE_UCENTER)
public interface UserClient {
    //根据账号查询用户信息
    @GetMapping("/ucenter/getuserext")
    public UserExt getUserext(@RequestParam("username") String username);
}
