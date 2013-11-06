package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.k19.model.Produto;

@ManagedBean
@SessionScoped
public class ProdutoBean {

	private List<Produto> produtos = new ArrayList<Produto>();
	private Produto produto = new Produto();

	public void adicionaProduto() {
		this.produtos.add(this.produto);
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
