package org.example.boardback.entity.user;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
<<<<<<< HEAD
import org.example.boardback.common.enums.user.RoleType;
=======
import org.example.boardback.common.enums.RoleType;
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f

@Entity
@Table(name = "roles")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Role {
    @Id @Enumerated(EnumType.STRING)
    @Column(name = "role_name", length = 30, nullable = false)
    private RoleType name;

    public Role(RoleType name) {
        this.name = name;
    }
}
