package pers.posse.tool.service.impl.persistence.finder;

import org.springframework.stereotype.Repository;
import pers.posse.tool.service.persistence.finder.ICourseFinder;

import javax.persistence.EntityManager;

/**
 * Created by posse on 17-7-20.
 */
@Repository
public class UserFinderJPA implements ICourseFinder {

    private EntityManager emRead;
}
