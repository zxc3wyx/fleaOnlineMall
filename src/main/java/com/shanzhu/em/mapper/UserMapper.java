package com.shanzhu.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shanzhu.em.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户持久层 （mapper）
 *
 * @author: Wyx18373256
 * @date: 2022-02-10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
