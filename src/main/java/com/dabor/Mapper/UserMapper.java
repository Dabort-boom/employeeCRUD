package com.dabor.Mapper;

import com.dabor.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dabort
 * @date 2021/9/15 - 14:43
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> queryUser();

    User queryUserById(int id);

    int updateUser(User user);

    int addUser(User user);

    int deleteUser(int id);


}
