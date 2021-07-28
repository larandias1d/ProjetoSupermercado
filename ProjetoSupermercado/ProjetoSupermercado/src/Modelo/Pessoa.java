package Modelo;


public abstract class Pessoa {
	

	
	protected String cpf; 
	private String nome;
	private String data_nasc;

	private String rua;
	private int numero;
	private String bairro;
	private int cep;
	private String complemento;
	private String cidade;
	private String uf;

	
	private String celular; 
	private String email;
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
		
	public void setData_nasc(String string) {
		this.data_nasc = string;
	}
	
	public String getData_nasc() {
		return data_nasc;
	}
	
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getCep() {
		return cep;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}

	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getUf() {
		return uf;
	}
	
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}
