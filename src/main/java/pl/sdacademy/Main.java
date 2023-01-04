package pl.sdacademy;

import jakarta.persistence.EntityManager;

public class Main {

    private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public static void main(String[] args) {
        initData();
        HibernateUtil.shutdown();
    }

    private static void initData() {
        em.getTransaction().begin();
        Author author = new Author("Adam","Mickiewicz");
        em.persist(author);
        em.getTransaction().commit();
    }
    }

