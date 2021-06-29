package com.calculator.app.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.inject.Named;

@ManagedBean
@NoneScoped
public class FirstManagedBean implements Serializable {

    private String message = "Poruka iz prvog beana";

    public FirstManagedBean() {
    }

    public String getMessage() {
        return message;
    }

}
