package pers.posse.tool.service.impl.persistence;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.persistence.ITeacherRepository;

import javax.persistence.EntityManager;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class TeacherRepositoryjpa implements ITeacherRepository {

    private EntityManager em;
}
