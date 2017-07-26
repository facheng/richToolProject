package pers.posse.tool.service.impl;

import org.springframework.stereotype.Service;
import pers.posse.tool.service.IUserService;
import pers.posse.tool.service.dto.UserDto;

/**
 * Created by posse on 17-7-25.
 */
@Service
public class UserService implements IUserService {

    @Override public UserDto authUser(String userName, String password) {
        return null;
    }
}
