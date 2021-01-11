package com.staticzz.service.impl;

import com.staticzz.entity.User;
import com.staticzz.mapper.UserMapper;
import com.staticzz.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author:chencc
 * @since 2021-01-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
