package Modelo;


public class Fornecedor {
	
	private int id_fornecedor;	
	private String cnpj;
	private String razao_social;
	
	private String rua;
	private int numero;
	private String bairro;
	private int cep;
	private String complemento;
	private String cidade;
	private String uf;	
	
	private String telefone;
	private String email;
	
	
	
	public void setId_fornecedor(int id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}
	
	public int getId_fornecedor() {
		return id_fornecedor;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
		
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	
	public String getRazao_social() {
		return razao_social;
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
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}
