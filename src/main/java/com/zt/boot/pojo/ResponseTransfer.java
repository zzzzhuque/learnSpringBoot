package com.zt.boot.pojo;

import javax.xml.bind.annotation.XmlRootElement;

// 若需要返回XML格式的数据，必须要有这个注解
@XmlRootElement
public class ResponseTransfer {
    private String text;

    public ResponseTransfer() {
    }

    public ResponseTransfer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
