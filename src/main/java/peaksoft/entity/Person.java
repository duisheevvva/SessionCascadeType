package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "persons")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Person {
    @Id
    @GeneratedValue(generator = "person", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "person_gen", sequenceName = "person_seq",
            allocationSize = 1)
    private Long id;
    private String personName;
    private int age;
    private String email;
    @OneToMany(mappedBy = "person", cascade = {
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.REMOVE,
            CascadeType.PERSIST,
            CascadeType.DETACH},fetch = FetchType.EAGER)
    private List<SocialMedia> socialMedias;
//    @OneToOne(cascade = {
//            CascadeType.MERGE,
//            CascadeType.REFRESH,
////            CascadeType.REMOVE,
//            CascadeType.PERSIST,
//            CascadeType.DETACH
//    },fetch = FetchType.EAGER)
//    private SocialMedia socialMedia;

    public Person(String personName, int age, String email) {
        this.personName = personName;
        this.age = age;
        this.email = email;
    }
}
