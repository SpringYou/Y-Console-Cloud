package com.console.ucenter;

import com.console.framework.domain.ucenter.Menu;
import com.console.ucenter.dao.MenuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDemo {

    @Autowired
    MenuMapper menuMapper;

    @Test
    public void test1() {
        List<Menu> menus = menuMapper.selectPermissionByUserId("49");
        System.out.println(menus);
    }


}
