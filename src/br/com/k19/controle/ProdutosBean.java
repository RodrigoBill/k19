package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.k19.model.Produto;

@ManagedBean
@SessionScoped
public class ProdutosBean {

	private List<Produto> produtos = new ArrayList<Produto>();
	private Produto produto = new Produto();

	public void adicionaProdutos() {

		this.produtos.add(this.produto);

		if (produto.isExibir() == false) {
			FacesMessage mensagem = new FacesMessage("Teste !");
			FacesContext.getCurrentInstance().addMessage(null, mensagem);
		}

		this.produto = new Produto();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
