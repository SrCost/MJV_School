package model;

import javax.persistence.*;

@Entity
@Table(name = "tb_musica")
public class musica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_musica;
	
	@Column(name = "Artistas")
	private String artista;
	
	@Column(name = "Nome_Musica")
	private String nomeMusica;
	
	@Column(name = "Album")
	private String album;
	
	@Column(name = "Gravadora")
	private String gravadora;
	
	@ManyToOne
	@Enumerated(EnumType.STRING) //salvando o proprio valor literal, se o genero Musical for HIPHOP, vai criar uma coluna com o mesmo nome e salvar nela.
	private generoMusica GeneroMusical;
	
	
	public generoMusica getGeneroMusical() {
		return GeneroMusical;
	}
	public void setGeneroMusical(generoMusica generoMusical) {
		GeneroMusical = generoMusical;
	}
	private Double valor;
	
	public Integer getId() {
		return id_musica;
	}
	public void setId(Integer id_musica) {
		this.id_musica = id_musica;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getNomeMusica() {
		return nomeMusica;
	}
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
