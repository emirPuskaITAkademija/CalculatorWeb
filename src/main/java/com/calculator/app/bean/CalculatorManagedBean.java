package com.calculator.app.bean;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "kalkulatorBean")
@RequestScoped
public class CalculatorManagedBean implements Serializable {

    private double _param1;
    private double _param2;
    private double _result;
    
  

    public CalculatorManagedBean() {
    }

    public double getParam1() {
        return _param1;
    }

    public void setParam1(double _param1) {
        this._param1 = _param1;
    }

    public double getParam2() {
        return _param2;
    }

    public void setParam2(double _param2) {
        this._param2 = _param2;
    }

    public double getResult() {
        return _result;
    }

    public void setResult(double _result) {
        this._result = _result;
    }

    /**
     * Metode za sumiranje parametara i dobijanje rezultata
     * <p>
     * _param1+_param2 = _result
     */
    public String add() {
        _result = _param1 + _param2;
        return "login";
    }

    public String subtract() {
        _result = _param1 - _param2;
        return "uslovna";
    }

    public String divide() {
        _result = _param1 / _param2;
        return "";
    }

    public String multiply() {
        _result = _param1 * _param2;
        return "";
    }
}
