package pers.posse.tool.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.posse.tool.service.IUserService;
import pers.posse.tool.service.dto.UserDto;
import pers.posse.tool.service.persistence.IUserRepository;
import pers.posse.tool.service.persistence.finder.IUserFinder;
import pers.posse.tool.web.ws.xml.DomainAttribute;
import pers.posse.tool.ws.ExternalException;

/**
 * Created by posse on 17-7-25.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserFinder userFinder;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDto authUser(String apiName, String apiPassword) throws ExternalException {
        if (StringUtils.isBlank(apiName) || StringUtils.isBlank(apiPassword)) {
            throw new ExternalException("auth failed");
        }
        return userFinder.findUserByUserNameAndPassword(apiName, apiPassword);
    }

    @Override
    @Transactional
    public void createUser(DomainAttribute attribute) {
        UserDto userDto = new UserDto();
        userDto.setName(attribute.getName());
        userDto.setAge(attribute.getAge());
        userDto.setGender(attribute.getGender());
        userDto.setMobile(attribute.getMobile());
        userDto.setIdNum(attribute.getIdNum());
        userDto.setAddress(attribute.getAddress());
        userDto.setApiName(attribute.getApiName());
        userDto.setApiPassword(attribute.getApiPassword());
        userRepository.createUser(userDto);
    }

    @Override
    public UserDto retrieve(Long id) throws ExternalException {
        if (id == null) {
            throw new ExternalException("id can not null");
        }
        return userFinder.findUserDto(id);
    }

    @Override
    public void updateUser(DomainAttribute attribute) throws ExternalException {

        if (retrieve(attribute.getId()) == null) {
            throw new ExternalException("user not exists");
        }

        UserDto userDto = new UserDto();
        userDto.setId(attribute.getId());
        userDto.setName(attribute.getName());
        userDto.setAge(attribute.getAge());
        userDto.setGender(attribute.getGender());
        userDto.setMobile(attribute.getMobile());
        userDto.setIdNum(attribute.getIdNum());
        userDto.setAddress(attribute.getAddress());
        userDto.setApiName(attribute.getApiName());
        userDto.setApiPassword(attribute.getApiPassword());
        userRepository.updateUser(userDto);
    }

    @Override
    public void deleteUser(Long id) throws ExternalException {
        if (id == null) {
            throw new ExternalException("id can not null");
        }
        userRepository.deleteUser(id);
    }
}
