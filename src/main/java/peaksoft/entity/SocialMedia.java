package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "social_medias")
@Getter
@Setter
@NoArgsConstructor
@ToString()
public class SocialMedia {
    @Id
    @GeneratedValue(generator = "social_media", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "social_media_gen", sequenceName = "social_media_seq",
            allocationSize = 1)
    private Long id;
    private String socialMediaName;
    @ToString.Exclude
    @ManyToOne(cascade = {
            CascadeType.MERGE,
            CascadeType.REFRESH})
    private Person person;

    public SocialMedia(String socialMediaName) {
        this.socialMediaName = socialMediaName;
    }
}
