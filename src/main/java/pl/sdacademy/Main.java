package pl.sdacademy;

import jakarta.persistence.EntityManager;

import java.time.LocalDate;

public class Main {
    private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public static void main(String[] args) {
        initData();
        HibernateUtil.shutdown();
    }

    private static void initData() {
        em.getTransaction().begin();
        Author author = new Author(1, "asd", "asd", null);

        em.getTransaction().commit();
    }
}