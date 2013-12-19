package br.com.k19.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CarroJPARepository {

	private EntityManager manager;

	public CarroJPARepository(EntityManager manager) {
		this.manager = manager;
	}

	public void adiciona(CarroJPA carro) {
		this.manager.persist(carro);
	}

	public List<CarroJPA> buscaTodos() {
		Query query = this.manager.createQuery("select x from CarroJPA x");
		return query.getResultList();
	}

}
