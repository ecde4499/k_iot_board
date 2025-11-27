package org.example.boardback.security.oauth2.user;

<<<<<<< HEAD
import java.util.Map;

=======
import java.lang.Object;
import java.util.Map;


>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
public class GoogleOAuth2UserInfo extends OAuth2UserInfo {
    public GoogleOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return (String) attributes.get("sub");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }

    @Override
    public String getImageUrl() {
        return (String) attributes.get("picture");
    }
}
