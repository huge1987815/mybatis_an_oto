package com.huge.mapper;

import com.huge.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Description:变量描述
 * Author:胡正林823865618@qq.com)
 * Date:2019/6/22-18:07
 */
public interface UserMapper {
   /**
     *获取用户对象
     * */
   @Select("select * from tb_user where uid=#{uid}")
   User getUser(int uid);
}
