package br.com.magna.esporte.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.magna.esporte.util.JPAUtil;

public class HorarioDao {
	
	private final  EntityManager em;

	public HorarioDao() {
		this.em = JPAUtil.getEntityManager();
	}

	public void cadastrar(Horario horario) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		this.em.persist(horario);
		et.commit();
	}
	
	public void atualizar(Horario horario) {
		this.em.merge(horario);
	}

	public void remover(Horario horario) {
		horario = em.merge(horario);
		this.em.remove(horario);
	}
	
	   public List<Horario> listar() {
	        return em.createQuery("SELECT h FROM Horario h", Horario.class)
	                .getResultList();
	    }
	
//	public  List<Horario> buscarPorNome(String nome) {
//		String jpql = "SELECT h FROM Horario h WHERE h.nome = :nome2";
//		return em.createQuery(jpql, Horario.class).setParameter("nome2", nome) .getResultList();
//	}
//	
//	public  List<Horario> buscarPorNomeDaCategoria(String nome) {
//		String jpql = "SELECT h FROM Horario h WHERE h.categoria.nome = :nome2";
//		return em.createQuery(jpql, Horario.class).setParameter("nome2", nome) .getResultList();
//	}
//	
//	public  Integer buscarNumeroDeSets(String nome) {
//		String jpql = "SELECT h.numero_de_sets FROM Horario h WHERE h.categoria.nome = :nome2";
//		return em.createQuery(jpql, Integer.class).setParameter("nome2", nome) .getSingleResult();
//	}
	
}
