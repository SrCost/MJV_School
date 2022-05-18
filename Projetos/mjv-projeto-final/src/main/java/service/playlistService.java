package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.playlist;
import repository.playlistRepository;

@Service
public class playlistService {
	
	@Autowired
	private playlistRepository repository;
	
	/*public void gravar(playlist playlist) {
		playlist.setMusicas(playlist.getMusicas());
		String musicas;
		for(playlist musica: playlist.getMusicas()) {
			playlist = playlist + playlist.getMusicas();
		}
		playlist.setMusica(playlistCriada);
		repository.save(pedido); //Tentativa de acrescentar musicas na playlist criada
	}*/
}
