package com.console.ucenter.service;

import com.console.framework.domain.ucenter.CompanyUser;
import com.console.framework.domain.ucenter.Menu;
import com.console.framework.domain.ucenter.User;
import com.console.framework.domain.ucenter.ext.UserExt;
import com.console.ucenter.dao.CompanyUserRepository;
import com.console.ucenter.dao.MenuMapper;
import com.console.ucenter.dao.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 **/
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CompanyUserRepository companyUserRepository;

    @Autowired
    MenuMapper menuMapper;

    //根据账号查询user信息
    public User findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    //根据账号查询用户信息
    public UserExt getUserExt(String username){
        //根据账号查询user信息
        User user = this.findUserByUsername(username);
        if(user == null){
            return null;
        }
        //用户id
        String userId = user.getId();
        //查询用户所有权限
        List<Menu> xcMenus = menuMapper.selectPermissionByUserId(userId);

        //根据用户id查询用户所属公司id
        CompanyUser companyUser = companyUserRepository.findByUserId(userId);
        //取到用户的公司id
        String companyId = null;
        if(companyUser!=null){
            companyId = companyUser.getCompanyId();
        }
        UserExt userExt = new UserExt();
        BeanUtils.copyProperties(user,userExt);
        userExt.setCompanyId(companyId);
        //设置权限
        userExt.setPermissions(xcMenus);
        return userExt;

    }

}
