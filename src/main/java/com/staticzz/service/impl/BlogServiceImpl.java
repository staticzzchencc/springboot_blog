package com.staticzz.service.impl;

import com.staticzz.entity.Blog;
import com.staticzz.mapper.BlogMapper;
import com.staticzz.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
