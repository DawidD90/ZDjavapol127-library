package pl.sdacademy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Scanner;

public class AuthorMethods {
    private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
    public static final Scanner scanner = new Scanner(System.in);


    public void Autorzy() {
        TypedQuery<Author> abc = em.createQuery("from Author", Author.class);
        List<Author> authors = abc.getResultList();
        for (Author autor1 : authors) {
            System.out.println(autor1);
        }
    }
}
