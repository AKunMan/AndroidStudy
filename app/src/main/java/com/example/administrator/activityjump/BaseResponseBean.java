package com.example.administrator.activityjump;

import java.io.Serializable;

public class BaseResponseBean<E> implements Serializable {
    private static final long serialVersionUID = -2438925321574242988L;
    public int status;// Integer 否 状态码：-1-系统错误 0-成功 1-参数错误 2-业务错误 3-权限错误
    public String msg;// String 否 状态对应消息
    public E data;// Object 否 接口返回数据
}