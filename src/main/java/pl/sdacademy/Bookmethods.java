package pl.sdacademy;

import jakarta.persistence.EntityManager;

import java.util.Scanner;

public class Bookmethods implements InterfaceBook{
    private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();
    public static final Scanner scanner=new Scanner(System.in);



    @Override
    public void addBook() {
        em.getTransaction().begin();
        System.out.println("Wpisz tytuł");
        String tytul= scanner.nextLine();

        System.out.println(" wydawnictwo");
        String publisher= scanner.nextLine();

        System.out.println(" isbn");
        String isbn= scanner.nextLine();

        Books books=Books.builder()
                .title(tytul)
                .publisher(publisher)
                .isbn(isbn)
                .build();


        em.persist(books);
        em.getTransaction().commit();

    }

    @Override
    public void removeBook() {

    }

    @Override
    public void ViewBook() {

    }
}
