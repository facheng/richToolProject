package pers.posse.tool.service.impl.persistence;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.dto.UserDto;
import pers.posse.tool.service.impl.domain.User;
import pers.posse.tool.service.impl.parser.UserDtoParser;
import pers.posse.tool.service.persistence.IUserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class UserRepositoryJPA implements IUserRepository {

    private static String FIND_USER_BY_ID = "find.user.by.id";

    @PersistenceContext(unitName = "persistenceUnitWrite")
    private EntityManager emWrite;

    @Override
    public Long createUser(UserDto userDto) {
        User user = new User(null, userDto.getName(), userDto.getAge(), userDto.getGender(), userDto.getIdNum(),
                userDto.getAddress(), userDto.getMobile(), userDto.getApiName(), userDto.getApiPassword());
        emWrite.persist(user);
        return user.getId();
    }

    @Override
    public void updateUser(UserDto userDto) {
        User user = emWrite.find(User.class, userDto.getId());
        UserDtoParser.fromDto(user, userDto);
    }

    @Override
    public void deleteUser(Long id) {
        emWrite.remove(this.emWrite.find(User.class, id));
    }
}
