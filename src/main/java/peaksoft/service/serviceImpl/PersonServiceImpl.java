package peaksoft.service.serviceImpl;

import peaksoft.dao.PersonDao;
import peaksoft.dao.daoImpl.PersonDaoImpl;
import peaksoft.entity.Person;
import peaksoft.service.PersonService;

public class PersonServiceImpl implements PersonService {
    PersonDao personDao = new PersonDaoImpl();
    public void savePerson(Person person) {
        personDao.savePerson(person);
    }

    public void deletePerson(Long personId) {
        personDao.deletePerson(personId);

    }

    @Override
    public Person getById(Long personId) {
       return personDao.getById(personId);
    }
}
