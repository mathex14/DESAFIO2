package br.unipe.mt3.modelo;



public class Item implements Comparable<Item>   {
	
	private int codigo;
	private double preco;
	private String descricao;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public String toString(){
		return ("Codigo: " + codigo + "  descrição: " + descricao+" preço:  \n " +preco );		
	}
	
	
	
	public int compareTo(Item other) {
		if (this.codigo < other.codigo) {
		return -1;
		}
		if (this.codigo > other.codigo) {
		return 1;
		}
		return 0;
		
		}
	}
	

	
	
	


