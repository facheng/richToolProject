package pers.posse.tool.web.ws.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by posse on 17-7-19.
 */
// @XmlRootElement 告诉JAXB如何编组给定的类型 或者 直接从/给定方法返回/接受JAXBElement.
@XmlRootElement(name = "externalInsertEntityRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExternalInsertEntityRequest {
    @XmlElement(required = true)
    private String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
