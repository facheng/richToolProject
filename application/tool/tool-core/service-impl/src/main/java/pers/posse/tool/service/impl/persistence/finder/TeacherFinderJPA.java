package pers.posse.tool.service.impl.persistence.finder;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.persistence.finder.ITeacherFinder;

import javax.persistence.EntityManager;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class TeacherFinderJPA implements ITeacherFinder {

    private EntityManager emRead;
}
