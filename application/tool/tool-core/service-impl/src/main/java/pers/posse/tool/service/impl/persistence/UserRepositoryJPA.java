package pers.posse.tool.service.impl.persistence;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.persistence.ICourseRepository;

import javax.persistence.EntityManager;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class UserRepositoryJPA implements ICourseRepository {

    private EntityManager em;
}
