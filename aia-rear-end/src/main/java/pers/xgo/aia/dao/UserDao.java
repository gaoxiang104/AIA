package pers.xgo.aia.dao;

import org.apache.ibatis.annotations.Mapper;
import pers.xgo.aia.po.UserPo;

@Mapper
public interface UserDao {
   UserPo getOne(Long id);
}
