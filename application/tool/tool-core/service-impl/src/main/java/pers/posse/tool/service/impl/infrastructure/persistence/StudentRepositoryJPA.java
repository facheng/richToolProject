package pers.posse.tool.service.impl.infrastructure.persistence;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.infrastructure.persistence.IStudentRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class StudentRepositoryJPA implements IStudentRepository {

    @PersistenceContext(unitName = "persistenceUnitWrite")
    private EntityManager em;
}
