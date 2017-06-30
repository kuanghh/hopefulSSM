package com.khh.web.service.interface_;

import com.khh.web.domain.User;

/**
 * Created by Administrator on 2017/6/30.
 */
public interface UserService {

    int insertUser(User user);

    User findById(int id);
}
