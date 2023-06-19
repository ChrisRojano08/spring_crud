package mx.softitlan.demo.repository;

import mx.softitlan.demo.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Integer> {
}
