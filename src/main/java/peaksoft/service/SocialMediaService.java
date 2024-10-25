package peaksoft.service;

import peaksoft.entity.SocialMedia;

public interface SocialMediaService {
    void saveSocialMedia(SocialMedia socialMedia);
    void deleteSocialMedia(Long id);
    void assignSocialMediaToPerson(Long personId,Long socialMediaId);
}
