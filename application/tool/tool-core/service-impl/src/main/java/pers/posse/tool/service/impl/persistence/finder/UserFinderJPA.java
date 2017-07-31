package pers.posse.tool.service.impl.persistence.finder;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Repository;
import pers.posse.tool.service.dto.UserDto;
import pers.posse.tool.service.impl.domain.User;
import pers.posse.tool.service.impl.parser.UserDtoParser;
import pers.posse.tool.service.persistence.finder.IUserFinder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class UserFinderJPA implements IUserFinder {

    @PersistenceContext(unitName = "persistenceUnitRead")
    private EntityManager emRead;

    @Override
    public UserDto findUserByUserNameAndPassword(String apiName, String apiPassword) {
        CriteriaBuilder builder = emRead.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);

        Root<User> root = query.from(User.class);
        query.where(builder.and(builder.equal(root.get("apiName"), apiName)),
                builder.equal(root.get("apiPassword"), apiPassword));
        List<User> users = emRead.createQuery(query).getResultList();
        return CollectionUtils.isEmpty(users) ? null : UserDtoParser.fromDomain(users.get(0));
    }

    private User findUser(Long id) {
        CriteriaBuilder builder = emRead.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);

        Root<User> root = query.from(User.class);
        query.where(builder.and(builder.equal(root.get("id"), id)));
        List<User> users = emRead.createQuery(query).getResultList();
        return CollectionUtils.isEmpty(users) ? null : users.get(0);
    }

    @Override
    public UserDto findUserDto(Long id) {
        User user = findUser(id);
        return user == null ? null : UserDtoParser.fromDomain(user);
    }
}
