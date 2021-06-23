package DAO;
import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Modelo.Funcionario;


public class FuncionarioDAO {
		
	
	
	public Funcionario BuscarFuncionario(String cpf) { 
				
		Connection conexao = ConexaoBanco.ConexaoComBanco();

		try {
			
			String sql = "SELECT * FROM funcionario WHERE cpf = ?";	
			
			PreparedStatement statement = conexao.prepareStatement(sql);
			
			statement.setString(1,cpf);
			ResultSet resultset = statement.executeQuery();
		
			Funcionario f = new Funcionario();
			
			if(resultset.next()) {
				
				f.setCpf(resultset.getString("cpf")); 
				f.setNome(resultset.getString("nome"));
				f.setData_nasc(resultset.getString("data_nasc"));				
				
				f.setRua(resultset.getString("rua"));
				f.setNumero(resultset.getInt("numero"));
				f.setBairro(resultset.getString("bairro"));
				f.setComplemento(resultset.getString("complemento"));
				f.setCep(resultset.getInt("cep"));
				f.setCidade(resultset.getString("cidade"));
				f.setUf(resultset.getString("uf"));
				
				f.setCelular(resultset.getString("celular")); 
				f.setEmail(resultset.getString("email"));
				
				f.setCargo(resultset.getString("cargo"));
				f.setSalario(resultset.getFloat("salario"));
				f.setLogin(resultset.getString("login"));
				f.setSenha(resultset.getString("senha"));

				JOptionPane.showMessageDialog(null, "Funcionário encontrado");

			}	
			
			else {
				
				JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
			}
			return f;
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
				
		return null;
	}
	
		
	public void Cadastrar (Funcionario f) {
				
		Connection conexao = ConexaoBanco.ConexaoComBanco();


		try {
			
			String sql = "INSERT INTO funcionario(cpf, nome, data_nasc, rua, numero, bairro,"
					+ "cep, complemento,cidade, uf, celular, email, cargo, salario, login, senha) "
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
						
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setString(1, f.getCpf()); 
			stmt.setString(2, f.getNome());
			stmt.setString(3, f.getData_nasc());

			stmt.setString(4, f.getRua());
			stmt.setInt(5, f.getNumero());
			stmt.setString(6, f.getBairro());
			stmt.setInt(7, f.getCep());
			stmt.setString(8, f.getComplemento());
			stmt.setString(9, f.getCidade());
			stmt.setString(10, f.getUf());
			
			stmt.setString(11, f.getCelular());
			stmt.setString(12, f.getEmail());
			
			stmt.setString(13,  f.getCargo());
			stmt.setDouble(14, f.getSalario());
			stmt.setString(15, f.getLogin());
			stmt.setString(16, f.getSenha());
			
			
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);	
		}
	}
	
	
	public void Atualizar (Funcionario f) {
		
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
				
			//ATUALIZA COM CPF
			
			String sql = "UPDATE funcionario SET id_funcionario = ?, nome = ?, data_nasc = ?,"
					+ "rua = ?, numero = ?, bairro = ?, cep = ?, complemento = ?, cidade = ?,"
					+ "uf = ?, celular = ?, email = ?, cargo = ?, salario = ?, "
					+ "login = ?, senha = ? WHERE cpf = ?";
			
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setString(1, f.getNome());
			stmt.setString(2, f.getData_nasc());

			stmt.setString(3, f.getRua());
			stmt.setInt(4, f.getNumero());
			stmt.setString(5, f.getBairro());
			stmt.setInt(6, f.getCep());
			stmt.setString(7, f.getComplemento());
			stmt.setString(8, f.getCidade());
			stmt.setString(9, f.getUf());
			
			stmt.setString(10, f.getCelular());
			stmt.setString(11, f.getEmail());
			
			stmt.setString(12,  f.getCargo());
			stmt.setDouble(13, f.getSalario());
			stmt.setString(14, f.getLogin());
			stmt.setString(15, f.getSenha()); 
			
			stmt.setString(16, f.getCpf()); 


		
			// executa os comandos sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);	
			erro.printStackTrace();
		}
	}
	
	
	public void Excluir (String cpf) {
		
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
			
			String sql = "DELETE FROM funcionario cpf WHERE cpf = ?";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, cpf);
			
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Excluído");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir" + e);
		}
	}
	
		
	
	public List<Funcionario> listarFuncionarios() {
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		List<Funcionario> listarFuncionarios = new ArrayList<Funcionario>();

		try {
			String sql = "SELECT * FROM funcionario";		
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			ResultSet resultset = stmt.executeQuery();
			
			while (resultset.next()) {
				
				Funcionario f = new Funcionario();
				
				f.setId_funcionario(resultset.getInt("id_funcionario"));
				f.setCpf(resultset.getString("cpf")); 
				f.setNome(resultset.getString("nome"));
				f.setData_nasc(resultset.getString("data_nasc"));
				
				f.setRua(resultset.getString("rua"));
				f.setNumero(resultset.getInt("numero"));
				f.setBairro(resultset.getString("bairro"));
				f.setCep(resultset.getInt("cep"));
				f.setComplemento(resultset.getString("complemento"));
				f.setCidade(resultset.getString("cidade"));
				f.setUf(resultset.getString("uf"));
								
				f.setCelular(resultset.getString("celular")); 
				f.setEmail(resultset.getString("email"));
								 
				f.setCargo(resultset.getString("cargo"));
				f.setSalario(resultset.getFloat("salario"));
				f.setLogin(resultset.getString("login"));
				f.setSenha(resultset.getString("senha"));
				
				listarFuncionarios.add(f);	
			}
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listarFuncionarios;
	}
}
