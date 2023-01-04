package pl.sdacademy;

import jakarta.persistence.EntityManager;

public class Main {

    private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public static void main(String[] args) {


        InterfaceBook a1 = new Bookmethods();
        a1.addBook();


    }
}


