package repository;

import model.musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface musicaRepository extends JpaRepository<musica, Integer> {
}
