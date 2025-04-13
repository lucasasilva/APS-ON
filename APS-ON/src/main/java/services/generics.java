package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.List;

public class generics {

    /*Método genérico para fazer select o banco
       <T> especifica um tipo "genérico" então <T> List<T> significa que é para o compilador esperar um
       retorno to tipo Objeto de seja lá qual for a classe que passarmos no input (Class<T> classeDoObjeto)

       Dessa forma, podemos usar sempre a mesma query para trazermos TODOS OS CAMPO em um objeto ou
       campos específicos (Em caso de campos específicos, requer um construtor que contenha somente ele)
    */
    public static <T> List<T> selectBanco(String query, Class<T> classeDoObjeto){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<T> resultList = session
                .createQuery(query, classeDoObjeto)
                .getResultList();
        transaction.commit();
        session.close();
        sessionFactory.close();

        return resultList;
    }


    public static <T> void insertBanco(Object objetoGenerico){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.persist(objetoGenerico);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            sessionFactory.close();
            session.close();
        }
    }

    public static <T> void updateBanco(Object objetoGenerico){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.merge(objetoGenerico);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
    public static <T> void deleteBanco(Object objetoGenerico){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.remove(objetoGenerico);
            transaction.commit();
        }catch (Exception e){
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }finally {
            sessionFactory.close();
            session.close();
        }
    }
}
