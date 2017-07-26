package pers.posse.tool.service.impl.infrastructure.persistence.finder;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.infrastructure.persistence.finder.IStudentFinder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class StudentFinderJPA implements IStudentFinder {

    @PersistenceContext(unitName = "persistenceUnitRead")
    private EntityManager emRead;
}