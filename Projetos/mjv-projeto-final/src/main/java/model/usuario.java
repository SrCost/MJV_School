package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	
	@Column(length = 20)
	private String nome;
		
	private String email;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_playlist")
    private playlist playlist;
	
	public playlist getPlaylist() {
		return playlist;
	}
	public void setPlaylist(playlist playlist) {
		this.playlist = playlist;
	}
	public Integer getId() {
		return id_usuario;
	}
	public void setId(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
