package Modelo;

public class Pagamento {
	
	private int id_pagamento;
	private String forma_pagamento;
	private Venda venda;
	private int parcelas;
	private double valor_rcebido;
	private double troco;
	
	
	public void setId_pagamento(int id_pagamento) {
		this.id_pagamento = id_pagamento;
	}
	
	public int getId_pagamento() {
		return id_pagamento;
	}
		
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	
	public String getForma_pagamento() {
		return forma_pagamento;
	}
		
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	public Venda getVenda() {
		return venda;
	}
			
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	public int getParcelas() {
		return parcelas;
	}
	
	public void setValor_rcebido(double valor_rcebido) {
		this.valor_rcebido = valor_rcebido;
	}
	
	public double getValor_rcebido() {
		return valor_rcebido;
	}
	
	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	public double getTroco() {
		return troco;
	}
	
	
}
