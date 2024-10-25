package peaksoft.dao.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.SocialMediaDao;
import peaksoft.entity.Person;
import peaksoft.entity.SocialMedia;

import java.util.List;

public class SocialMediaDaoImpl implements SocialMediaDao {
    private final EntityManagerFactory entityManager = HibernateConfig.getEntityManager();

    public void saveSocialMedia(SocialMedia socialMedia) {

    }

    public void deleteSocialMedia(Long id) {
//        EntityManager entityManager1 = entityManager.createEntityManager();
//        entityManager1.getTransaction().begin();
//        SocialMedia socialMedia = entityManager1.find(SocialMedia.class, id);
//        socialMedia.getPerson().setSocialMedia(null);
////        entityManager1.detach(socialMedia.getPerson());
//        entityManager1.remove(socialMedia);
//        entityManager1.getTransaction().commit();
//        entityManager1.close();
    }

    @Override
    public void assignSocialMediaToPerson(Long personId, Long socialMediaId) {
        EntityManager entityManager1 = entityManager.createEntityManager();
        entityManager1.getTransaction().begin();
        Person person = entityManager1.find(Person.class, personId);
        SocialMedia socialMedia = entityManager1.find(SocialMedia.class, socialMediaId);
        person.setSocialMedias(List.of(socialMedia));
        socialMedia.setPerson(person);
        entityManager1.getTransaction().commit();
        entityManager1.close();
    }
}
