package com.console.ucenter.dao;

import com.console.framework.domain.ucenter.CompanyUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator.
 */
public interface CompanyUserRepository extends JpaRepository<CompanyUser,String> {
    //根据用户id查询该用户所属的公司id
    CompanyUser findByUserId(String userId);
}
