package com.console.ucenter.controller;

import com.console.api.ucenter.UcenterControllerApi;
import com.console.framework.domain.ucenter.ext.UserExt;
import com.console.ucenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 **/
@RestController
@RequestMapping("/ucenter")
public class UcenterController implements UcenterControllerApi {

    @Autowired
    UserService userService;

    @Override
    @GetMapping("/getuserext")
    public UserExt getUserext(@RequestParam("username") String username) {
        return userService.getUserExt(username);
    }
}
