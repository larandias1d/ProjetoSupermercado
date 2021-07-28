package Modelo;

public class Funcionario extends Pessoa {

	private int id_funcionario;
	private String cargo;
	private float salario;
	protected String login;
	protected String senha;
	
	public Funcionario() {
		super ();
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
}
