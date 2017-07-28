package pers.posse.tool.web.ws.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by posse on 17-7-19.
 */
// @XmlRootElement 告诉JAXB如何编组给定的类型 或者 直接从/给定方法返回/接受JAXBElement.
@XmlRootElement(name = "externalInsertEntityRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExternalInsertEntityRequest {

    @XmlAttribute(name = "userName", required = true)
    private String userName;
    @XmlAttribute(name = "password", required = true)
    private String password;
    @XmlAttribute(name = "version", required = true)
    private String version;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private Operation operation;

    private DomainAttribute domainAttribute;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public DomainAttribute getDomainAttribute() {
        return domainAttribute;
    }

    public void setDomainAttribute(DomainAttribute domainAttribute) {
        this.domainAttribute = domainAttribute;
    }
}
