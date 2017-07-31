package pers.posse.tool.service.persistence.finder;

import pers.posse.tool.service.dto.UserDto;

/**
 * Created by posse on 17-7-20.
 */
public interface IUserFinder {
    UserDto findUserByUserNameAndPassword(String apiName, String apiPassword);

    UserDto findUserDto(Long id);
}
