package DAO;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Modelo.Cliente;

public class ClienteDAO {
		
	
	
	public Cliente BuscarCliente(String cpf) { 
				
		Connection conexao = ConexaoBanco.ConexaoComBanco();

		try {
			
			//criando o comando sql
			String sql = "SELECT * FROM cliente WHERE cpf = ?";	
			
			// conectando com o banco de dados
			PreparedStatement statement = conexao.prepareStatement(sql);
			
			statement.setString(1,cpf);
			ResultSet resultset = statement.executeQuery();
		
			Cliente cliente = new Cliente();

			
			if(resultset.next()) {
				
				cliente.setCpf(resultset.getString("cpf")); 
				cliente.setNome(resultset.getString("nome"));
				cliente.setData_nasc(resultset.getString("data_nasc"));				
				
				cliente.setRua(resultset.getString("rua"));
				cliente.setNumero(resultset.getInt("numero"));
				cliente.setBairro(resultset.getString("bairro"));
				cliente.setComplemento(resultset.getString("complemento"));
				cliente.setCep(resultset.getInt("cep"));
				cliente.setCidade(resultset.getString("cidade"));
				cliente.setUf(resultset.getString("uf"));
				
				cliente.setCelular(resultset.getString("celular")); 
				cliente.setEmail(resultset.getString("email"));
			

				JOptionPane.showMessageDialog(null, "CPF encontrado");

			}	
			
			else {
				
				JOptionPane.showMessageDialog(null, "CPF não encontrado");
			}
			return cliente;
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
				
		return null;
	}
	
		
	public void Cadastrar (Cliente cliente) {
				
		Connection conexao = ConexaoBanco.ConexaoComBanco();


		try {
			
			String sql = "INSERT INTO cliente(cpf, nome, data_nasc, rua, numero, bairro,"
					+ "cep, complemento,cidade, uf, celular, email) "
					+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
						
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setString(1, cliente.getCpf()); 
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getData_nasc());

			stmt.setString(4, cliente.getRua());
			stmt.setInt(5, cliente.getNumero());
			stmt.setString(6, cliente.getBairro());
			stmt.setInt(7, cliente.getCep());
			stmt.setString(8, cliente.getComplemento());
			stmt.setString(9, cliente.getCidade());
			stmt.setString(10, cliente.getUf());
			
			stmt.setString(11, cliente.getCelular());
			stmt.setString(12, cliente.getEmail());
			
			
			// executa os comandos sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);	
		}
	}
	
	
	public void Atualizar (Cliente cliente) {
		
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
				
			//ATUALIZA COM CPF
			
			String sql = "UPDATE cliente SET id_cliente = ?, nome = ?, data_nasc = ?,"
					+ "rua = ?, numero = ?, bairro = ?, cep = ?, complemento = ?, cidade = ?,"
					+ "uf = ?, celular = ?, email = ? WHERE cpf = ?";
			
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setInt(1, cliente.getId_cliente());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getData_nasc());

			stmt.setString(4, cliente.getRua());
			stmt.setInt(5, cliente.getNumero());
			stmt.setString(6, cliente.getBairro());
			stmt.setInt(7, cliente.getCep());
			stmt.setString(8, cliente.getComplemento());
			stmt.setString(9, cliente.getCidade());
			stmt.setString(10, cliente.getUf());
			
			stmt.setString(11, cliente.getCelular());
			stmt.setString(12, cliente.getEmail());
			
			stmt.setString(13, cliente.getCpf()); 

		
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
			
			String sql = "DELETE FROM cliente cpf WHERE cpf = ?";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, cpf);
			
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Excluído");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir" + e);
		}
	}
	
		
	
	public List<Cliente> listarClientes() {
		
		List<Cliente> listarClientes = new ArrayList<Cliente>();
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
					
			String sql = "SELECT * FROM cliente";		
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			ResultSet resultset = stmt.executeQuery();
			
			while (resultset.next()) {
				
				Cliente c = new Cliente();
				
				c.setId_cliente(resultset.getInt("id_cliente"));
				c.setCpf(resultset.getString("cpf")); 
				c.setNome(resultset.getString("nome"));
				c.setData_nasc(resultset.getString("data_nasc"));
				
				c.setRua(resultset.getString("rua"));
				c.setNumero(resultset.getInt("numero"));
				c.setBairro(resultset.getString("bairro"));
				c.setCep(resultset.getInt("cep"));
				c.setComplemento(resultset.getString("complemento"));
				c.setCidade(resultset.getString("cidade"));
				c.setUf(resultset.getString("uf"));
								
				c.setCelular(resultset.getString("celular")); 
				c.setEmail(resultset.getString("email"));
								 
				listarClientes.add(c);	
			}
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listarClientes;
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
