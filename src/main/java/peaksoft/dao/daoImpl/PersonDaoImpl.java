package peaksoft.dao.daoImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import peaksoft.config.HibernateConfig;
import peaksoft.dao.PersonDao;
import peaksoft.entity.Person;

public class PersonDaoImpl implements PersonDao {
    private final EntityManagerFactory entityManager = HibernateConfig.getEntityManager();
    public void savePerson(Person person) {
        EntityManager entityManagerFactory = entityManager.createEntityManager();
        entityManagerFactory.getTransaction().begin();
        entityManagerFactory.persist(person);
        entityManagerFactory.getTransaction().commit();
        entityManagerFactory.close();
    }

    public void deletePerson(Long personId) {
        EntityManager entityManagerFactory = entityManager.createEntityManager();
        entityManagerFactory.getTransaction().begin();
        Person person = entityManagerFactory.find(Person.class, personId);
        entityManagerFactory.remove(person);
        entityManagerFactory.getTransaction().commit();
        entityManagerFactory.close();
    }

    @Override
    public Person getById(Long personId) {
        EntityManager entityManagerFactory = entityManager.createEntityManager();
        entityManagerFactory.getTransaction().begin();
        Person person = entityManagerFactory.find(Person.class, personId);
        entityManagerFactory.getTransaction().commit();
        entityManagerFactory.close();
        return person;
    }
}
