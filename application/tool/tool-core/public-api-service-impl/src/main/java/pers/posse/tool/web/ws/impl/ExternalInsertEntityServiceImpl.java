package pers.posse.tool.web.ws.impl;

import pers.posse.tool.web.ws.ExternalInsertEntityService;
import pers.posse.tool.web.ws.xml.ExternalInsertEntityRequest;
import pers.posse.tool.web.ws.xml.ExternalInsertEntityResponse;

/**
 * Created by posse on 17-7-19.
 */
public class ExternalInsertEntityServiceImpl implements ExternalInsertEntityService {
    @Override
    public ExternalInsertEntityResponse insertStudent(ExternalInsertEntityRequest externalInsertEntityRequest) {
        System.out.println("insert a student");
        return new ExternalInsertEntityResponse();
    }
}
