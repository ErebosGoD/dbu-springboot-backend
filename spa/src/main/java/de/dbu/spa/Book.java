package de.dbu.spa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter private String title;
    @Getter
    @Setter
    private String subtitle;
    @Getter
    @Setter
    private String isbn;
    @Getter
    @Setter
    private String bookAbstract;
    @Getter
    @Setter
    private int numPages;
    @Getter
    @Setter
    private String author;
    @Getter
    @Setter
    private String publisher;
    @Getter
    @Setter
    private String price;
    @Getter
    @Setter
    private String cover;
}
    
    

