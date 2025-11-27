package org.example.boardback.security.oauth2.user;

import java.util.Map;

<<<<<<< HEAD
public class NaverOAuth2UserInfo extends OAuth2UserInfo {

=======
public class NaverOAuth2UserInfo extends OAuth2UserInfo{
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
    public NaverOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    private Map<String, Object> getResponse() {
        return (Map<String, Object>) attributes.get("response");
    }

    @Override
    public String getId() {
        return (String) getResponse().get("sub");
    }

    @Override
    public String getEmail() {
        return (String) getResponse().get("email");
    }

    @Override
    public String getName() {
<<<<<<< HEAD
        return (String) getResponse().get("nickname");
=======
        return (String) getResponse().get("name");
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
    }

    @Override
    public String getImageUrl() {
        return (String) getResponse().get("profile_image");
    }
}
