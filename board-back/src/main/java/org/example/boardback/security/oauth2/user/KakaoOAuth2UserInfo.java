package org.example.boardback.security.oauth2.user;

import java.util.Map;

<<<<<<< HEAD
public class KakaoOAuth2UserInfo extends OAuth2UserInfo {
    public KakaoOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

=======
public class KakaoOAuth2UserInfo extends OAuth2UserInfo{
    public KakaoOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
    @Override
    public String getId() {
        return String.valueOf(attributes.get("id"));
    }

    @Override
    public String getEmail() {
        Map<String, Object> kakaoAccount = (Map<String, Object>) attributes.get("kakao_account");
        if (kakaoAccount == null) return null;
        return (String) kakaoAccount.get("email");
    }

    @Override
    public String getName() {
        Map<String, Object> kakaoAccount = (Map<String, Object>) attributes.get("kakao_account");
        if (kakaoAccount == null) return null;
<<<<<<< HEAD
        Map<String, Object> profile = (Map<String, Object>) kakaoAccount.get("profile");
        if (profile == null) return null;

        return (String) profile.get("nickname");
=======
        Map<String, Object> profile = (Map<String, Object>) attributes.get("profile");
        if (profile == null) return null;

        return (String) kakaoAccount.get("nickname");
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
    }

    @Override
    public String getImageUrl() {
        Map<String, Object> kakaoAccount = (Map<String, Object>) attributes.get("kakao_account");
        if (kakaoAccount == null) return null;
<<<<<<< HEAD
        Map<String, Object> profile = (Map<String, Object>) kakaoAccount.get("profile");
=======
        Map<String, Object> profile = (Map<String, Object>) attributes.get("profile");
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
        if (profile == null) return null;

        return (String) profile.get("profile_image_url");
    }
}
