package com.fuzamei.bonuspoint.dao.common.mapper;

import com.fuzamei.bonuspoint.entity.po.user.ContactPO;
import com.fuzamei.common.mapper.TkMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ContactMapper extends TkMapper<ContactPO>{
}
