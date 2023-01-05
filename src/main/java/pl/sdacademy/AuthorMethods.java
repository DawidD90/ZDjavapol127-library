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

    public void dodajAutora() {
        em.getTransaction().begin();

        System.out.println("podaj imie autora");
        String imie = scanner.nextLine();

        System.out.println("podaj nazwisko autora");
        String nazwisko = scanner.nextLine();


        TypedQuery<Author> abc = em.createQuery("Select first_name from Author", Author.class);
        List<Author> lista = abc.getResultList();

        TypedQuery<Author> abc2 = em.createQuery("Select last_name from Author", Author.class);
        List<Author> lista2 = abc2.getResultList();

        System.out.println(lista);
        System.out.println(lista2);

        if (lista.contains(imie) && lista2.contains(nazwisko)) {
            System.out.println("error");
        } else {

            Author autor = Author.builder()
                    .first_name(imie)
                    .last_name(nazwisko)
                    .build();
            em.persist(autor);

        }
        em.getTransaction().commit();
    }
}


