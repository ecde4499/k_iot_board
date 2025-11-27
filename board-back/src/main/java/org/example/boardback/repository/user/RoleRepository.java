package org.example.boardback.repository.user;

<<<<<<< HEAD
import org.example.boardback.common.enums.user.RoleType;
=======
import org.example.boardback.common.enums.RoleType;
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
import org.example.boardback.entity.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, RoleType> {
}
