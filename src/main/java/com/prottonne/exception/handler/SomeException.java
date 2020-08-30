package com.prottonne.exception.handler;

public class SomeException extends RuntimeException {

    //TODO: make immutable
    private Integer guid;
    private String code;

    public SomeException() {
        super();
    }

    public SomeException(String message) {
        super(message);
    }

    public SomeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SomeException(Throwable cause) {
        super(cause);
    }

    public Integer getGuid() {
        return guid;
    }

    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
