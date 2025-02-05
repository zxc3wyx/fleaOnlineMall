package com.shanzhu.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shanzhu.em.entity.Address;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户地址 持久层（mapper）
 *
 * @author: Wyx18373256
 * @date: 2022-02-10
 */
@Mapper
public interface AddressMapper extends BaseMapper<Address> {

}
