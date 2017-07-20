package pers.posse.tool.web.ws.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by posse on 17-7-19.
 */
@XmlRootElement(name = "externalInsertEntityResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExternalInsertEntityResponse {
    private String response = "Insert Success.";
}
