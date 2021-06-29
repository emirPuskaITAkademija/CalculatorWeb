package com.calculator.app.bean;

import com.calculator.app.http.request.injector.HttParamInjector;
//import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "navigatorBean")
@javax.enterprise.context.RequestScoped
public class NavigatorManagedBean {

    @Inject
    @HttParamInjector(value = "pageId")
    private String pageId;

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String showPage() {
        if ("1".equals(pageId)) {
            return "login";
        } else if ("2".equals(pageId)) {
            return "index";
        } else {
            return "another";
        }
    }
}
