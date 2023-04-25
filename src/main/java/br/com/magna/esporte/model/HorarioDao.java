package br.com.magna.esporte.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.magna.esporte.util.JPAUtil;

public class HorarioDao {

	private final EntityManager em;

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
		EntityTransaction et = em.getTransaction();
		et.begin();
		this.em.merge(horario);
		et.commit();
	}

	public void remover(Horario horario) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		horario = em.merge(horario);
		this.em.remove(horario);
		et.commit();
	}

	public List<Horario> listar() {
		return em.createQuery("SELECT h FROM Horario h", Horario.class).getResultList();
	}

	public Horario buscarPorId(Integer idHorario) {
		return em.find(Horario.class, idHorario);
	}

}