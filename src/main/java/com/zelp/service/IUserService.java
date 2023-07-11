package com.zelp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zelp.dto.LoginFormDTO;
import com.zelp.dto.Result;
import com.zelp.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
