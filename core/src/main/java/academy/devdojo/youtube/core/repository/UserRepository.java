package academy.devdojo.youtube.core.repository;

import academy.devdojo.youtube.core.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository<User,Long> {
    Optional<User> findByName(String name);
}
