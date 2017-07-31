package pers.posse.tool.service.persistence;

import pers.posse.tool.service.dto.UserDto;

/**
 * Created by posse on 17-7-20.
 */
public interface IUserRepository {
    Long createUser(UserDto userDto);

    void updateUser(UserDto userDto);

    void deleteUser(Long id);
}
