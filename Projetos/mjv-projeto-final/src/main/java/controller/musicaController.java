package controller;

import java.util.List;

import repository.musicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import model.musica;

@RestController
@RequestMapping("/musicas")
public class musicaController {
	
	@Autowired
	private musicaRepository repository;
		
	@PostMapping
	public void salvar(@RequestBody musica musica) {
		repository.save(musica);
	}
	@PutMapping
	public void alterar(@RequestBody musica musica) {
		repository.save(musica);
	}
	@DeleteMapping ("/{id_musica}")
	public void deletarMusica(Integer id_musica) {
		repository.deleteById(id_musica);
	}
	@GetMapping
	public List<musica> listar(){
		return repository.findAll();
	}
	
}
