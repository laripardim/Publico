package model;

public class Orcamento {
	private int id;
	private String data;
	private String fornecedor;
	private String produto;
	private int quantidade;
	private double preco;
	
	Orcamento(){
		
	}
	
	public Orcamento(int id, String data, String fornecedor, String produto, int quantidade, double preco) {
		this.id = id;
		this.data = data;
		this.fornecedor = fornecedor;
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return id + " " + data + " " + fornecedor +" " + produto
				+ " " + quantidade + " " + preco;
	}

	public String toCsv() {
		return id + ";" + data + ";" + fornecedor + ";" + produto
				+ ";" + quantidade + ";" + preco;
	}
	
}
