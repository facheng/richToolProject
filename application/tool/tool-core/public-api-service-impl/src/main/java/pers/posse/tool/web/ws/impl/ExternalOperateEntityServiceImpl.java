package pers.posse.tool.web.ws.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pers.posse.tool.service.ICourseService;
import pers.posse.tool.service.IStudentService;
import pers.posse.tool.service.ITeacherService;
import pers.posse.tool.service.IUserService;
import pers.posse.tool.web.ws.ExternalOperateEntityService;
import pers.posse.tool.web.ws.xml.DomainAttribute;
import pers.posse.tool.web.ws.xml.ExternalInsertEntityRequest;
import pers.posse.tool.web.ws.xml.ExternalInsertEntityResponse;
import pers.posse.tool.web.ws.xml.Operation;

/**
 * Created by posse on 17-7-19.
 */
public class ExternalOperateEntityServiceImpl implements ExternalOperateEntityService {

    @Autowired
    private ITeacherService teacherService;

    @Autowired
    private IStudentService studentService;

    @Autowired
    private ICourseService courseService;

    @Autowired
    private IUserService userService;

    @Override
    public ExternalInsertEntityResponse service(ExternalInsertEntityRequest request) {
        long start = System.currentTimeMillis();

//        UserDto userDto = userService.authUser(request.getUserName(), request.getPassword());


        Operation operation = request.getOperation();
        DomainAttribute attribute = request.getDomainAttribute();



        return null;
    }
}
