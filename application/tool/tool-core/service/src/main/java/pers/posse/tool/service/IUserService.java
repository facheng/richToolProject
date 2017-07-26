package pers.posse.tool.service;

import pers.posse.tool.service.dto.UserDto;

/**
 * Created by posse on 17-7-20.
 */
public interface IUserService {
    UserDto authUser(String userName, String password);
}
