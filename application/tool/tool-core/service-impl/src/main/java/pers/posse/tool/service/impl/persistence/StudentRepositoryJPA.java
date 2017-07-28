package pers.posse.tool.service.impl.persistence;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.persistence.IStudentRepository;

import javax.persistence.EntityManager;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class StudentRepositoryJPA implements IStudentRepository {

    private EntityManager em;
}
