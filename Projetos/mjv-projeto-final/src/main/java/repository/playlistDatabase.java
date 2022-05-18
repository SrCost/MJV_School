package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import model.playlist;

@Repository
public class playlistDatabase {
	
	@PersistenceContext
	private EntityManager em;// tipo o Connection do JDBC
	
	//JPQL
	//E um SELECT sobre entidades e não tabelas
	//https://thorben-janssen.com/how-to-join-unrelated-entities/
	public List<playlist> listarPlaylistComUsuario(){
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT  NEW com.mjv.projetofinal.model.playlist ");
		sql.append("( u.id_usuario, e.email, c.nome, ) ");
		sql.append("FROM playlist p, usuario c WHERE p.id_usuario = u.id  ");
		
		//Query é tipo a classe ResultSet que retorna dados
		Query query = em.createQuery(sql.toString());
		List<playlist> lista = query.getResultList();
		return lista;
		
	}
}
