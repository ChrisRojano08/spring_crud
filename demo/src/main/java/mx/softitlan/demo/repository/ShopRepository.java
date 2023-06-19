package mx.softitlan.demo.repository;

import mx.softitlan.demo.model.ShopVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<ShopVO, Integer> {

}
