package org.mybatis.example;

import java.util.HashMap;
import java.util.List;

/**
 * 人员管理DAO接口
 *
 * @author qiusheng
 * @version 2018-05-25
 */
public interface UserMapper {

////  @Select("SELECT * FROM sys_user a WHERE a.id = #{id}")
//  User getById(String id);
//
////  @Select("SELECT * FROM sys_user a WHERE a.code = #{code} AND a.sex = #{sex}")
//  HashMap<String, Object> getByMap(HashMap<String, Object> paramsMap);

//  @Select("SELECT * FROM sys_user a WHERE a.sex = #{sex} AND a.deleted_flag = #{deletedFlag}")
  List<HashMap<String, Object>> getByMapList(HashMap<String, Object> paramsMap);


////  @Select("SELECT * FROM sys_user a WHERE a.id = 1")
//  User getDefautUser();
//
//  /**
//   * 通过账号获取用户
//   */
////  @Select("SELECT * FROM sys_user a WHERE a.account = #{account} and a.deleted_flag != 1")
//  HashMap<String, Object> getByAccount(@Param("account") String account);

}
