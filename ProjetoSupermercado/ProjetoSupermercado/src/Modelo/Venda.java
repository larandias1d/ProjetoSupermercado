package Modelo;

import java.sql.Date;

public class Venda {

	private Integer id_venda;
	private Integer id_produto;
	private float qtde;
	public String cliente;
	private float total_venda;
	private Date dt_venda;
	
	
	public void setId_venda(Integer id_venda) {
		this.id_venda = id_venda;
	}
		
	public Integer getId_venda() {
		return id_venda;
	}
	

	public void setId_produto(Integer id_produto) {
		this.id_produto = id_produto;
	}
	
	public Integer getId_produto() {
		return id_produto;
	}

	public void setQtde(float qtde) {
		this.qtde = qtde;
	}
	
	public float getQtde() {
		return qtde;
	}
	
	

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setTotal_venda(float total_venda) {
		this.total_venda = total_venda;
	}
	
	public float getTotal_venda() {
		return total_venda;
	}
	
	public void setDt_venda(Date dt_venda) {
		this.dt_venda = dt_venda;
	}
	
	public Date getDt_venda() {
		return dt_venda;
	}
}
