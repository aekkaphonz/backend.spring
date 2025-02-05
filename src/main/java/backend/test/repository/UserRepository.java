package backend.test.repository;

import backend.test.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import java.sql.Timestamp;


@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<UserEntity, Timestamp> {
}
