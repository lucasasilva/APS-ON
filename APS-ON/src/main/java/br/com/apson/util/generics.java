package br.com.apson.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class generics {

    /*Método genérico para fazer select o banco
       <T> especifica um tipo "genérico" então <T> List<T> significa que é para o compilador esperar um
       retorno to tipo Objeto de seja lá qual for a classe que passarmos no input (Class<T> classeDoObjeto)

       Dessa forma, podemos usar sempre a mesma query para trazermos TODOS OS CAMPO em um objeto ou
       campos específicos (Em caso de campos específicos, requer um construtor que contenha somente ele)


       como funciona?
       - SessionFactory vai buscar, dentro do hibernate.cfg.xml os dados do nosso banco de dados; IMPORTANTE:
       Só funciona do jeito que está declarado ali se arquivo for o padrão hibernate.cfg.xml
       Se for outro nome, precisa ser declarado como new Configuration().configure(nome_arquivo.cfg.xml).buildSessionFactory();

       - session usa o objeto do tipo SessionFactory para abrir uma conexão com o banco. É a variável que usaremos para declarar
       o que exatamente estaremos realizando dentro do banco (com métodos .createQuery() .persist() .merge() .remove())

       - Transaction, como o nome sugere, usa a conexão aberta para controlar uma transação (select, insert, update, delete) que fora aberta
       pela session. Commit, rollback, iara iara, a putaria toda.

       Depois tem que fechar todo mundo, senão DREADLOCKS
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

    /* As diferenças daqui para baixo:
    Objeto genérico: Não importa a classe, funciona para todas;
    try - catch: Boa prática para evitar que a transação de errado e a gente sem saber o porquê;
    Faz rollback automático (=
    * */
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
