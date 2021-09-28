package org.mybatis.example;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.testcontainers.shaded.com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 人员管理Bean
 * @author qiusheng
 * @version 2018-05-25
 */
@Data
public class User implements Serializable {
	
	/**
	 * 用户编号
	 */
	private String code;
	
	/**
	 * 头像
	 */
	private String avatar;
	
	/**
	 * 账号
	 */
	private String account;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * md5密码盐
	 */
	private String salt;
	
	/**
	 * 名字
	 */
	private String name;
	
	/**
	 * 生日
	 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime birthday;   //Jdk8 时间类型

  /**
   * 创建时间
   */
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime createTime;  //需开启驼峰命名，否则获取不都值
	
	/**
	 * 性别（1：男 2：女）
	 */
	private String sex;
	
	/**
	 * 电子邮件
	 */
	private String email;
	
	/**
	 * 电话
	 */
	private String phone;
	
	/**
	 * 部门id
	 */
	private String deptId;
	
	/**
	 * 状态(1：启用  2：冻结 ）
	 */
	private Integer status;

  @Override
  public String toString() {
    return "User{" +
      "code='" + code + '\'' +
      ", avatar='" + avatar + '\'' +
      ", account='" + account + '\'' +
      ", password='" + password + '\'' +
      ", salt='" + salt + '\'' +
      ", name='" + name + '\'' +
      ", birthday=" + birthday +
      ", createTime=" + createTime +
      ", sex='" + sex + '\'' +
      ", email='" + email + '\'' +
      ", phone='" + phone + '\'' +
      ", deptId='" + deptId + '\'' +
      ", status=" + status +
      '}';
  }
}
