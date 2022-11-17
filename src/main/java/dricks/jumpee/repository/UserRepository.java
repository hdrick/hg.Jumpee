package dricks.jumpee.repository;

import dricks.jumpee.model.User;
import dricks.jumpee.web.dto.UserRegistrationDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User save(UserRegistrationDto registrationDto);
}
