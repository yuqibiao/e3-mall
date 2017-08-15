package com.yyyu.manager.bean;


public class BaseJsonRequest<T> {

    public BaseJsonRequest() {
    }

    public T getRequestData() {
        return requestData;
    }

    public void setRequestData(T requestData) {
        this.requestData = requestData;
    }

    private T requestData;
}
