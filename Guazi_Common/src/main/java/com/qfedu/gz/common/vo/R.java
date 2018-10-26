package com.qfedu.gz.common.vo;

import java.io.Serializable;

/**
 * 描述:
 * 通用返回
 *
 * @author szp
 * @create 2018-10-23 14:33
 */
public class R implements Serializable {

    private String msg;
    private Object data;
    private Integer code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public R() {
    }

    public R(Integer code,String msg,Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;

    }
}
