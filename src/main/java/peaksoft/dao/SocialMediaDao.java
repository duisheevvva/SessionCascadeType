package peaksoft.dao;

import peaksoft.entity.SocialMedia;

public interface SocialMediaDao {
    void saveSocialMedia(SocialMedia socialMedia);
    void deleteSocialMedia(Long id);
    void assignSocialMediaToPerson(Long personId,Long socialMediaId);
}
