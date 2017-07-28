package pers.posse.tool.service.impl.infrastructure.persistence;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.infrastructure.persistence.ICourseRepository;

import javax.persistence.EntityManager;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class CourseRepositoryJPA implements ICourseRepository {

    private EntityManager em;
}
