package pers.posse.tool.web.ws.xml;

import org.apache.cxf.wsdl.http.OperationType;
import pers.posse.tool.web.ws.enums.OperationDomain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by posse on 17-7-25.
 */
@XmlRootElement(name = "Operation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {

    private OperationDomain domain;
    private OperationType type;

    public OperationDomain getDomain() {
        return domain;
    }

    public void setDomain(OperationDomain domain) {
        this.domain = domain;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }
}
