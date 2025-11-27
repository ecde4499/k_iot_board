package org.example.boardback.dto.user.response;

import lombok.Builder;
import lombok.Getter;
<<<<<<< HEAD
import org.example.boardback.common.enums.user.RoleType;
=======
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f

import java.util.Set;

@Getter
@Builder
public class MeResponseDto {
    private Long id;
    private String username;
    private String email;
    private String nickname;
    private String profileImageUrl;
<<<<<<< HEAD
    private Set<RoleType> roles;
    private String provider;
}
=======
    private Set<String> roles;
    private String provider;
}
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
