package br.com.k19.controle;

import javax.faces.bean.ManagedBean;

import br.com.k19.model.FuncionarioConversaoValidacao;

@ManagedBean
public class FuncionarioConversaoValidacaoBean {

	private FuncionarioConversaoValidacao funcionario = new FuncionarioConversaoValidacao();

	public FuncionarioConversaoValidacao getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioConversaoValidacao funcionario) {
		this.funcionario = funcionario;
	}
	
}
