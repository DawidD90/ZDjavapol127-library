package pl.sdacademy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;
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
        em.getTransaction().begin();
       System.out.println("wpisz numer Id książki którą chcesz usunąć");
       String skan= scanner.nextLine();
        em.createQuery("DELETE FROM Books WHERE bookId="+skan)
                        .executeUpdate();


        em.getTransaction().commit();
    }


    @Override
    public void ViewBook() {
        TypedQuery<Books> abc=em.createQuery("from Books",Books.class);
        List<Books> lista=abc.getResultList();
        for(Books book:lista){
            System.out.println(book);
        }

    }

    public void removeBook2() {
        em.getTransaction().begin();
        System.out.println("wpisz tytuł książki którą chcesz usunąć");
        String skan= scanner.nextLine();
        Query query = em.createQuery("DELETE FROM Books WHERE title = :title");
        query.setParameter("title", skan)
                .executeUpdate();
        int rowsDeleted=query.executeUpdate();

        em.getTransaction().commit();
    }
}
