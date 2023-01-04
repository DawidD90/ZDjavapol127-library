package pl.sdacademy;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int author_id;
    private String first_name;
    private String last_name;

    @ManyToMany(mappedBy ="bookId")
    private List<Books> books;





}
