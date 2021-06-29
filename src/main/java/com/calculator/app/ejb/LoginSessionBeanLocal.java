package com.calculator.app.ejb;

import javax.ejb.Local;

@Local
public interface LoginSessionBeanLocal {
    public boolean login(String username, String password);
}
