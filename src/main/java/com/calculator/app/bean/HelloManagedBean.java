package com.calculator.app.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloManagedBean", eager = true)
@RequestScoped
public class HelloManagedBean implements Serializable{
    private String message;

    public HelloManagedBean() {
    }

    public String getMessage() {
        message = "Kaže vozdra bean VOZDRA RAJA:.";
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
