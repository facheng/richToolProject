package pers.posse.tool.web.ws.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pers.posse.tool.service.InsertEntityService;
import pers.posse.tool.web.ws.ExternalInsertEntityService;
import pers.posse.tool.web.ws.xml.ExternalInsertEntityRequest;
import pers.posse.tool.web.ws.xml.ExternalInsertEntityResponse;

/**
 * Created by posse on 17-7-19.
 */
public class ExternalInsertEntityServiceImpl implements ExternalInsertEntityService {

    @Autowired
    private InsertEntityService insertEntityService;

    @Override
    public ExternalInsertEntityResponse insertStudent(ExternalInsertEntityRequest externalInsertEntityRequest) {
        System.out.println(externalInsertEntityRequest.getOperation());
        return new ExternalInsertEntityResponse();
    }
}
