package peaksoft.service.serviceImpl;

import peaksoft.dao.SocialMediaDao;
import peaksoft.dao.daoImpl.SocialMediaDaoImpl;
import peaksoft.entity.SocialMedia;
import peaksoft.service.SocialMediaService;

public class SocialMediaServiceImpl implements SocialMediaService {
    private final SocialMediaDao socialMediaDao = new SocialMediaDaoImpl();

    public void saveSocialMedia(SocialMedia socialMedia) {

    }

    public void deleteSocialMedia(Long id) {
        socialMediaDao.deleteSocialMedia(id);
    }

    @Override
    public void assignSocialMediaToPerson(Long personId, Long socialMediaId) {
        socialMediaDao.assignSocialMediaToPerson(personId, socialMediaId);
    }
}
