package pers.posse.tool.ws;

/**
 * Created by posse on 17-7-31.
 */
public class WsAuthenticationException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private String responseCode;

    public WsAuthenticationException() {

    }

    public WsAuthenticationException(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseCode() {
        return responseCode;
    }
}
