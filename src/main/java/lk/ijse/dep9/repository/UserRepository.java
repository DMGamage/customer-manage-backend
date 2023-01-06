package lk.ijse.dep9.repository;

import lk.ijse.dep9.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
