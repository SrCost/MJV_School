package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.playlist;
import repository.playlistRepository;
import service.playlistService;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/playlist")
public class playlistController {
	
	 	@Autowired
	    private playlistRepository repository;
	 	
	 	@Autowired
	 	private playlistService service;

	    @PostMapping
	    public void gravar(@RequestBody playlist playlist) {
	        repository.save(playlist);
	    }

	    @GetMapping
	    public List<playlist> listar() {
	        return repository.findAll();
	    }

	    @DeleteMapping
	    public void removerPlaylist(Integer id_playlist) {
	        repository.deleteById(id_playlist);
	    }
	
}
