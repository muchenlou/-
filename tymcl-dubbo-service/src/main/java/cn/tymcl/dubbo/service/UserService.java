package cn.tymcl.dubbo.service;

import cn.tymcl.dubbo.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有的用户
     * @return
     */
    List<User> queryAll();
}
