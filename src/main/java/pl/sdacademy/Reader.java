package pl.sdacademy;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Reader {

    public Reader(String firstName, String lastName, String phoneNumber, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReader;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String mail;
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "reader")
    private List<Copy> copy;

    public int getIdReader() {
        return idReader;
    }

    public void setIdReader(int idReader) {
        this.idReader = idReader;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Copy> getCopy() {
        return copy;
    }

    public void setCopy(List<Copy> copy) {
        this.copy = copy;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "idReader=" + idReader +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mail='" + mail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cpoy=" + cpoy +
                '}';
    }
}
