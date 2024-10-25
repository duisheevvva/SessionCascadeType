package peaksoft.service;

import peaksoft.entity.Person;

public interface PersonService {
    void savePerson(Person person);
    void deletePerson(Long personId);
    Person getById(Long personId);
}
