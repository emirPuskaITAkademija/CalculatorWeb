package com.calculator.app.bean;

import com.calculator.app.ejb.LoginSessionBeanLocal;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean(name = "loginManagedBean", eager = true)
@RequestScoped
public class LoginManagedBean implements Serializable {

    private String _username;
    private String _password;
    private String _message = "Enter username and password";

    @Inject
    LoginSessionBeanLocal loginSessionBeanLocal;

    public LoginManagedBean() {
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String _username) {
        this._username = _username;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public String getMessage() {
        return _message;
    }

    public void setMessage(String _message) {
        this._message = _message;
    }

    public String login() {
        boolean logged = loginSessionBeanLocal.login(_username, _password);
        if (logged) {
            _message = "Uspješno logovan.";
            return "index";
        } else {
            _message = "Pogrešna kombinacija šifre i lozinke.";
            return "login";
        }
    }

}
