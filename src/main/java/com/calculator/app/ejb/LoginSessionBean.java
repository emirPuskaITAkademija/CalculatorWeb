package com.calculator.app.ejb;

import com.calculator.app.entity.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class LoginSessionBean implements LoginSessionBeanLocal {

    @PersistenceContext(unitName = "hotelPU")
    private EntityManager entityManager;

    @Override
    public boolean login(String username, String password) {
        Query query = entityManager.createNamedQuery("User.findByUsername");
        query.setParameter("username", username);
        query.setParameter("password", password);
        try {
            User user = (User) query.getSingleResult();
            return user!=null;
        } catch (NoResultException exception) {
            System.err.format("Not exist user with username '%s'%n", username);
            return false;
        } catch (NonUniqueResultException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }

}
