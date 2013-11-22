package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.k19.model.CarroEscopos;

@ManagedBean
@ApplicationScoped
public class CarroEscoposBean {

	private List<CarroEscopos> carros = new ArrayList<CarroEscopos>();
	private CarroEscopos carro = new CarroEscopos();

	public void adicionaCarro() {
		this.carros.add(this.carro);
		this.carro = new CarroEscopos();
	}

	public List<CarroEscopos> getCarros() {
		return carros;
	}

	public void setCarros(List<CarroEscopos> carros) {
		this.carros = carros;
	}

	public CarroEscopos getCarro() {
		return carro;
	}

	public void setCarro(CarroEscopos carro) {
		this.carro = carro;
	}
}
