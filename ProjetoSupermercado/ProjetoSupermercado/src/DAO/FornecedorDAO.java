package DAO;
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Modelo.Fornecedor;

public class FornecedorDAO {
		
	
	
	public Fornecedor BuscarFornecedor(String cnpj) { 
				
		Connection conexao = ConexaoBanco.ConexaoComBanco();

		try {
			
			//criando o comando sql
			String sql = "SELECT * FROM fornecedor WHERE cnpj = ?";	
			
			// conectando com o banco de dados
			PreparedStatement statement = conexao.prepareStatement(sql);
			
			statement.setString(1,cnpj);
			ResultSet resultset = statement.executeQuery();
		
			Fornecedor f = new Fornecedor();

			
			if(resultset.next()) {
				
				f.setCnpj(resultset.getString("cnpj")); 
				f.setRazao_social(resultset.getString("razão social"));
				
				f.setRua(resultset.getString("rua"));
				f.setNumero(resultset.getInt("numero"));
				f.setBairro(resultset.getString("bairro"));
				f.setComplemento(resultset.getString("complemento"));
				f.setCep(resultset.getInt("cep"));
				f.setCidade(resultset.getString("cidade"));
				f.setUf(resultset.getString("uf"));
				
				f.setTelefone(resultset.getString("telefone")); 
				f.setEmail(resultset.getString("email"));
			

				JOptionPane.showMessageDialog(null, "Fornecedor encontrado");

			}	
			
			else {
				
				JOptionPane.showMessageDialog(null, "Fornecedor não encontrado");
			}
			return f;
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
				
		return null;
	}
	
		
	public void Cadastrar (Fornecedor f) {
				
		Connection conexao = ConexaoBanco.ConexaoComBanco();


		try {
			
			String sql = "INSERT INTO fornecedor(cnpj, razao_social, rua, numero, bairro,"
					+ "cep, complemento,cidade, uf, telefone, email) "
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
						
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setString(1, f.getCnpj()); 
			stmt.setString(2, f.getRazao_social());

			stmt.setString(3, f.getRua());
			stmt.setInt(4, f.getNumero());
			stmt.setString(5, f.getBairro());
			stmt.setInt(6, f.getCep());
			stmt.setString(7, f.getComplemento());
			stmt.setString(8, f.getCidade());
			stmt.setString(9, f.getUf());
			
			stmt.setString(10, f.getTelefone());
			stmt.setString(11, f.getEmail());
			
			
			// executa os comandos sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);	
			erro.printStackTrace();

		}
	}
	
	
	public void Atualizar (Fornecedor f) {
		
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
				
			//ATUALIZA COM CPF
			
			String sql = "UPDATE fornecedor SET id_fornecedor = ?, razao_social = ?,rua = ?,"
					+ "numero = ?, bairro = ?, cep = ?, complemento = ?, cidade = ?,"
					+ "uf = ?, telefone = ?, email = ? WHERE cnpj = ?";
			
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setString(1, f.getRazao_social());
			
			stmt.setString(2, f.getRua());
			stmt.setInt(3, f.getNumero());
			stmt.setString(4, f.getBairro());
			stmt.setInt(5, f.getCep());
			stmt.setString(6, f.getComplemento());
			stmt.setString(7, f.getCidade());
			stmt.setString(8, f.getUf());
			
			stmt.setString(9, f.getTelefone());
			stmt.setString(10, f.getEmail());
			
			stmt.setString(11, f.getCnpj()); 

		
			// executa os comandos sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);	
		}
	}
	
	
	public void Excluir (String cnpj) {
		
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
			
			String sql = "DELETE FROM fornecedor cpf WHERE cnpj = ?";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, cnpj);
			
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Excluído");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir" + e);
		}
	}
	
		
	
	public List<Fornecedor> listarFornecedores() {
		
		List<Fornecedor> listarFornecedores = new ArrayList<Fornecedor>();
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
					
			String sql = "SELECT * FROM fornecedor";		
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			ResultSet resultset = stmt.executeQuery();
			
			while (resultset.next()) {
				
				Fornecedor f = new Fornecedor();
				
				
				f.setId_fornecedor(resultset.getInt("id_fornecedor"));
				f.setCnpj(resultset.getString("cnpj")); 
				f.setRazao_social(resultset.getString("razão social"));
				
				f.setRua(resultset.getString("rua"));
				f.setNumero(resultset.getInt("numero"));
				f.setBairro(resultset.getString("bairro"));
				f.setCep(resultset.getInt("cep"));
				f.setComplemento(resultset.getString("complemento"));
				f.setCidade(resultset.getString("cidade"));
				f.setUf(resultset.getString("uf"));
								
				f.setTelefone(resultset.getString("telefone")); 
				f.setEmail(resultset.getString("email"));
								 
				listarFornecedores.add(f);	
			}
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listarFornecedores;
	}
	
	
	
	/*public int RetornaIdEndereco () {
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();

		Endereco e = new Endereco();		

		try {
			
			PreparedStatement stmt = conexao.prepareStatement("SELECT id_endereco FROM endereco ");
			ResultSet resultset = stmt.executeQuery();

			while (resultset.next()) {				
				e.setId_endereco(resultset.getInt("id_endereco"));
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}	
		
		System.out.println(e.getId_endereco());
		return e.getId_endereco();
	
	}*/
}
