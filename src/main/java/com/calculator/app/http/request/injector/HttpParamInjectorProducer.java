package com.calculator.app.http.request.injector;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.faces.annotation.FacesConfig;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@FacesConfig
public class HttpParamInjectorProducer {

    @Inject
    FacesContext facesContext;

    @Produces
    @HttParamInjector
    String getHttpRequestParameter(InjectionPoint injectionPoint) {
        String name = injectionPoint.getAnnotated().getAnnotation(HttParamInjector.class).value();
        if ("".equals(name)) {
            name = injectionPoint.getMember().getName();
        }
        return facesContext.getExternalContext().getRequestParameterMap().get(name);
    }
}
