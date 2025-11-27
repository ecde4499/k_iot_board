package org.example.boardback.security.oauth2.user;

<<<<<<< HEAD
import lombok.RequiredArgsConstructor;

=======
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
import java.util.Map;

/**
 * 각 OAuth2 provider(구글/카카오/네이버)의 사용자 정보를
 *  공통 포맷으로 추상화하는 클래스
<<<<<<< HEAD
 * */
=======
 */
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
public abstract class OAuth2UserInfo {
    protected final Map<String, Object> attributes;

    protected OAuth2UserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    /** provider가 주는 내부 attributes 전체 */
    public Map<String, Object> getAttributes() {
        return attributes;
    }

<<<<<<< HEAD
    /* provider 별 고유 ID (sub, id 등) */
=======
    /** provider 별 고유 ID (sub, id 등) */
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
    public abstract String getId();

    // 이메일
    public abstract String getEmail();

    // 이름/닉네임
    public abstract String getName();

    // 프로필 이미지 URL (없으면 null)
    public abstract String getImageUrl();
}
