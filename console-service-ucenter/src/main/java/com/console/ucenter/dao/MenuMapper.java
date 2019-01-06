package com.console.ucenter.dao;

import com.console.framework.domain.ucenter.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator.
 */
@Mapper
public interface MenuMapper {
    //根据用户id查询用户的权限
    public List<Menu> selectPermissionByUserId(String userid);

}
