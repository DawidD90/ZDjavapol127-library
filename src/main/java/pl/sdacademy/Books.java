package pl.sdacademy;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;
    @Column
    private String title;
    @Column
    private String publisher; //ewentualnie enum
    @Column
    private String isbn;


    @ManyToMany
    @JoinTable(
            name = "Books_Authors",
            joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id")}
    )
    private List<Author> authors;


    @OneToMany(mappedBy = "books")
    private List<Copy> copies;
}
