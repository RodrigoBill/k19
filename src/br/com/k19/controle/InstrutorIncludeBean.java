package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import br.com.k19.model.InstrutorInclude;

public class InstrutorIncludeBean {

	private List<InstrutorInclude> instrutores = new ArrayList<InstrutorInclude>();

	public InstrutorIncludeBean() {

		InstrutorInclude rafael = new InstrutorInclude();
		rafael.setNome("Rafael Cosentino");
		rafael.setDataNascimento("30/10/1984");

		InstrutorInclude marcelo = new InstrutorInclude();
		marcelo.setNome("Marcelo Martins");
		marcelo.setDataNascimento("02/04/1985");

		this.instrutores.add(rafael);
		this.instrutores.add(marcelo);

	}

	public List<InstrutorInclude> getInstrutores(){
		return instrutores;
	}
	
	public void setInstrutores(List<InstrutorInclude> instrutores){
		this.instrutores = instrutores;
	}
	
}
