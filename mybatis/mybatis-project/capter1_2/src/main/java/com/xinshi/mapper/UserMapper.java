package com.xinshi.mapper;

import com.xinshi.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public User getUserByUserId(int id);

    public List<User> getUser2(String username, String password);
    public List<User> getUser3(String username,
                               String password);
    public List<User> getUser4(@Param("userName") String username,
                               @Param("gender") String gender);
    public List<User> getUser5(@Param("firstUser") User firstUser,
                               @Param("secondUser") User secondUser);
    public List<User> getUser6(@Param("userName1") String userName1,
                               @Param("userName2") String userName2 );
    @MapKey("id")
    public Map<String,Object> getUser7(@Param("userName1") String userName1,
                                       @Param("userName2") String userName2 );
    //返回值，数据库受影响的行数
    public int insertUser(@Param("user") User user);
    public int updateUser(@Param("id") int id,
                          @Param("userName") String userName,
                          @Param("gender") String gender);
    public int deleteUser(@Param("id") int id);


}
