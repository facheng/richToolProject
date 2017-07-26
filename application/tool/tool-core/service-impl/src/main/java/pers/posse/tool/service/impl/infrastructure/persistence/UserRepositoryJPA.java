package pers.posse.tool.service.impl.infrastructure.persistence;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.infrastructure.persistence.ICourseRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class UserRepositoryJPA implements ICourseRepository {

    @PersistenceContext(unitName = "persistenceUnitWrite")
    private EntityManager em;
}
