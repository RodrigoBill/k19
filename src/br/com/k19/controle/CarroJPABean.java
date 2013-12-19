package br.com.k19.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import br.com.k19.model.CarroJPA;
import br.com.k19.model.CarroJPARepository;

@ManagedBean
public class CarroJPABean {

	private CarroJPA carro = new CarroJPA();

	public void adicionaCarro() {
		EntityManager manager = this.getEntityManager();
		CarroJPARepository repository = new CarroJPARepository(manager);
		
		repository.adiciona(this.carro);
		this.carro = new CarroJPA();
	}

	public List<CarroJPA> getCarros() {
		EntityManager manager = this.getEntityManager();
		CarroJPARepository repository = new CarroJPARepository(manager);
		return repository.buscaTodos();
	}

	private EntityManager getEntityManager() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ExternalContext ec = fc.getExternalContext();
		HttpServletRequest request = (HttpServletRequest) ec.getRequest();
		EntityManager manager = (EntityManager) request.getAttribute("EntityManager");
		
		return manager;
	}

	public CarroJPA getCarro() {
		return carro;
	}

	public void setCarro(CarroJPA carro) {
		this.carro = carro;
	}

}
