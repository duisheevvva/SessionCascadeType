package peaksoft.dao;

import peaksoft.entity.Person;

public interface PersonDao {
    void savePerson(Person person);
    void deletePerson(Long personId);
    Person getById(Long personId);
}
