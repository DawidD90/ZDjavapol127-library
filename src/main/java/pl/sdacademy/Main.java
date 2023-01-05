package pl.sdacademy;

import jakarta.persistence.EntityManager;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner=new Scanner(System.in);
    private static EntityManager em = HibernateUtil.getSessionFactory().createEntityManager();

    public static void main(String[] args) {
//        Reader czyt1=new Reader("Dawid","Durka","484848484","4dadawda@onet.pl",true);
//        System.out.println("witamy w bibliotece,aby się zalogować proszę wpisać swoja imie i nazwisko");
       String account= scanner.nextLine();

//       if (account.equalsIgnoreCase(czyt1.getFirstName())&&account.equalsIgnoreCase(czyt1.getLastName())){
//            System.out.println("test");
//        }
//        else
//        {
//            System.out.println("test2");
//
//        }
//        if (czyt1.getIsAdmin().equals(true)){
//            System.out.println("jesteś adminem");
//
//
//        }
//        else{
//            System.out.println("nie jesteś adminem");
//        }


        InterfaceBook a1 = new Bookmethods();
//        Bookmethods a2=new Bookmethods();
        //a1.addBook();
//a1.removeBook();
       a1.addBook();
//        a2.removeBook2();

    }
}


