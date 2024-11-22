package dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entidade.Cliente;
import entidade.Conta;
import entidade.Movimentacao;

public class ContaDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoPU");

	public Conta inserir(Conta conta) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
		return conta;
	}
}
