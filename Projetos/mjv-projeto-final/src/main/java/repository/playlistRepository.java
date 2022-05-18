package repository;

import model.playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface playlistRepository extends JpaRepository<playlist,Integer> {
}
