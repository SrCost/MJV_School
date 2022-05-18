package model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_playlist")
public class playlist {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_playlist;
	
	@Column(name = "Nome_Playlist")
	private String nome_playlist;
	
	@OneToMany(cascade = CascadeType.ALL) //Relacionamento Um para Muitos (PlayList X Musicas)
    @JoinColumn(name = "Id_playlist")
    private List<musica> musicas;
    
    @Column(name = "id_usuario")
	private Integer id_usuario;
    
    @Enumerated(EnumType.STRING)
	private generoMusica generoMusical;
    
	public Integer getId_playlist() {
		return id_playlist;
	}

	public void setId_playlist(Integer id_playlist) {
		this.id_playlist = id_playlist;
	}

	public String getNome_playlist() {
		return nome_playlist;
	}

	public void setNome_playlist(String nome_playlist) {
		this.nome_playlist = nome_playlist;
	}

	public List<musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<musica> musicas) {
		this.musicas = musicas;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id_playlist);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		playlist other = (playlist) obj;
		return Objects.equals(id_playlist, other.id_playlist);
	}
	
}