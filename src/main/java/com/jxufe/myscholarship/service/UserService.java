package com.jxufe.myscholarship.service;

import com.jxufe.myscholarship.model.User;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface UserService {
    Integer insertSelective(User user);
    Map<String,Object> selectByPrimaryKey(Integer studentNumber);
    Double Calculate(User user);
    Integer updateByPrimaryKeySelective(User user);

}
