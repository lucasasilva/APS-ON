package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class generics {
    public static List<Object[]> queryGenerica(String query){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Object[]> resultList = session
                .createQuery(query, Object[].class)
                .getResultList();
        transaction.commit();
        session.close();
        sessionFactory.close();

        return resultList;
    }
}
