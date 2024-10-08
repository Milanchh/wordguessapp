package lab11.example.spring_game_guess;



import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
