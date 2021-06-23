package Modelo;

public class Cliente extends Pessoa {
	
	private int id_cliente;
	
	public Cliente() {
		super();
	}
	
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_cliente() {
		return id_cliente;
	}	
}
