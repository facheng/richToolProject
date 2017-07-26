package pers.posse.tool.web.ws;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import pers.posse.tool.web.ws.xml.ExternalInsertEntityRequest;
import pers.posse.tool.web.ws.xml.ExternalInsertEntityResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by posse on 17-7-19.
 */
// @ApiOperation(value = "Import external billing", response = ExternalInsertEntityResponse.class, httpMethod = "PUT", notes = "接口发布说明")
// @ApiParam(required = "是否必须参数", name = "参数名称", value = "参数具体描述")
// swagger http://blog.csdn.net/fansunion/article/details/51923720
// http://blog.csdn.net/gebitan505/article/details/51658643
/**
 * consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
 * produces: 指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；
 */
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
@Path("/insert")
@Api(value = "External insert entity service")
public interface ExternalOperateEntityService {
    @PUT
    @Path("/student")
    @ApiOperation(value = "external insert entity", response = ExternalInsertEntityResponse.class, httpMethod = "PUT", notes = "接口发布说明") ExternalInsertEntityResponse service(
            @ApiParam(required = true, name = "externalInsertEntityRequest", value = "参数具体描述") ExternalInsertEntityRequest externalInsertEntityRequest);

}
