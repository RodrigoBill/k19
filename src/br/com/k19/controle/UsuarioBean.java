package br.com.k19.controle;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioBean {

	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
