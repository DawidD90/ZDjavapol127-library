package pl.sdacademy;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;

    @ManyToMany(mappedBy ="books",fetch= FetchType.EAGER)
    private Set<Books> book;





}
