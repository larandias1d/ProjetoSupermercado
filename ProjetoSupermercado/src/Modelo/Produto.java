package Modelo;

public class Produto {
	
	private Integer id_produto;
	private String descricao;
	private String categoria;
	private String unidade_medida;
	private float valor; 
	private  int qtde_estoque;
	public int fornecedor; // MUDEI DE PRIVATE PARA PUBLIC
	
	
	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}
	
	public Integer getId_produto() {
		return id_produto;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
		
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
			
	public void setUnidade_medida(String unidade_medida) {
		this.unidade_medida = unidade_medida;
	}
	
	public String getUnidade_medida() {
		return unidade_medida;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return valor;
	}


	public void setQtde_estoque(int qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}
	
	public int getQtde_estoque() {
		return qtde_estoque;
	}

	
	public void setFornecedor(int fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public int getFornecedor() {
		return fornecedor;
	}

	
	
	
}
