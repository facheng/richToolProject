package pers.posse.tool.service.impl.parser;

import pers.posse.tool.service.dto.UserDto;
import pers.posse.tool.service.impl.domain.User;

/**
 * Created by posse on 17-7-31.
 */
public final class UserDtoParser {
    public UserDtoParser() {
    }

    public static UserDto fromDomain(User user){
        if (user == null) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setAge(user.getAge());
        userDto.setGender(user.getGender());
        userDto.setMobile(user.getMobile());
        userDto.setAddress(user.getAddress());
        userDto.setIdNum(user.getIdNum());
        userDto.setApiName(user.getApiName());
        userDto.setApiPassword(user.getApiPassword());
        return userDto;
    }

    public static void fromDto(User user, UserDto userDto) {
        if (userDto == null) {
            return;
        }
        user.setName(userDto.getName() == null ? null : user.getName());
        user.setAge(userDto.getAge() == null ? null : user.getAge());
        user.setGender(userDto.getGender() == null ? null : user.getGender());
        user.setMobile(userDto.getMobile() == null ? null : user.getMobile());
        user.setAddress(userDto.getAddress() == null ? null : user.getAddress());
        user.setIdNum(userDto.getIdNum() == null ? null : user.getIdNum());
        user.setApiName(userDto.getApiName() == null ? null : user.getApiName());
        user.setApiPassword(userDto.getApiPassword() == null ? null : user.getApiPassword());
    }
}
