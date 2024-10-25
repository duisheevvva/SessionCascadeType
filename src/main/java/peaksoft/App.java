package peaksoft;

import peaksoft.config.HibernateConfig;
import peaksoft.entity.Person;
import peaksoft.entity.SocialMedia;
import peaksoft.service.PersonService;
import peaksoft.service.SocialMediaService;
import peaksoft.service.serviceImpl.PersonServiceImpl;
import peaksoft.service.serviceImpl.SocialMediaServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        HibernateConfig.getEntityManager();

        PersonService personService = new PersonServiceImpl();
//        SocialMedia socialMedia1 = new SocialMedia("Instagram");
        SocialMedia socialMedia2 = new SocialMedia("Telegram");
//        List<SocialMedia> socialMediaList = new ArrayList<>();
//        socialMediaList.add(socialMedia1);
//        socialMediaList.add(socialMedia2);
//        Person person =  new Person("Baktulan",20,"a@gamil.com");
//        personService.savePerson(person);

//        personService.deletePerson(2L);
        SocialMediaService socialMediaService= new SocialMediaServiceImpl();
//        socialMediaService.deleteSocialMedia(102L);

        System.out.println(personService.getById(1L));

//        socialMediaService.assignSocialMediaToPerson(1L,2L);

    }
}
