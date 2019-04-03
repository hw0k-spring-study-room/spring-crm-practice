package kr.hs.dgsw.springcrmpractice.repository;

import kr.hs.dgsw.springcrmpractice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
