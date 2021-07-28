package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Modelo.Cliente;
import Modelo.Produto;
import Modelo.Venda;

public class VendaDAO {
	
	public Venda BuscarVenda(Integer id_venda) {
		

		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
			
			//criando o comando sql
			String sql = "SELECT * FROM venda WHERE id_venda = ?";	

			// conectando com o banco de dados
			PreparedStatement statement = conexao.prepareStatement(sql);
		
			statement.setInt(1, id_venda);
			ResultSet resultset = statement.executeQuery();
			
			Venda v = new Venda();
			
			if(resultset.next()) {
						
			v.setId_venda(resultset.getInt("id_venda"));
			v.setQtde(resultset.getInt("qtde")); 
			v.setId_produto(resultset.getInt("id_produto"));
			v.setCliente(resultset.getString("id_cliente"));
			v.setTotal_venda(resultset.getFloat("total_venda"));
			v.setDt_venda(resultset.getDate("dt_venda"));
			
			JOptionPane.showMessageDialog(null, "Venda encontrada");
			}
			else {
				
			JOptionPane.showMessageDialog(null, "Venda não encontrada");
			}
			
		return v;
			
		} catch (Exception e) {
			
	}
	return null;

	}
	
	public void Cadastrar (Venda venda) {
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();


		try {
			
			String sql = "INSERT INTO vendas(id_venda, cliente, id_produto,"
					+ "total_venda, dt_venda)"
					+ "VALUES(?,?,?,?,?,?)";
						
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setString(1, venda.getCliente());
			stmt.setInt(2, venda.getId_produto());
			stmt.setFloat(3, venda.getQtde());
			stmt.setFloat(4, venda.getTotal_venda());
			stmt.setInt(5, venda.getId_venda());
			stmt.setDate(6, venda.getDt_venda());
			
			
			// executa os comandos sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);	
		}
	}
	
	
	public void Atualizar (Venda venda) {
		
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
						
			String sql = "UPDATE vendas SET cliente = ?, id_produto = ?,"
					+ "qtde = ?, total_venda = ? WHERE id_venda = ?";
			
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setString(1, venda.getCliente());
			stmt.setInt(2, venda.getId_produto());
			stmt.setFloat(3, venda.getQtde());
			stmt.setFloat(4, venda.getTotal_venda());
			stmt.setInt(5, venda.getId_venda());
		
			// executa os comandos sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);	
			erro.printStackTrace();
		}
	}
	
	
	public void Excluir (int id_venda) {
		
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
			
			String sql = "DELETE FROM vendas cpf WHERE  = id_venda?";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, id_venda);
			
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Excluído");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir" + e);
		}
	}
	
		
	
	public List<Venda> listarVendas() {
		
		List<Venda> listarVendas = new ArrayList<Venda>();
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
					
			String sql = "SELECT * FROM venda";		
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			ResultSet resultset = stmt.executeQuery();
			
			while (resultset.next()) {
				
				Venda v = new Venda();
				
				v.setId_venda(resultset.getInt("id_venda"));
				v.setCliente(resultset.getString("cliente")); 
				v.setQtde(resultset.getFloat("qtde"));
				v.setTotal_venda(resultset.getFloat("total_venda"));
	
				listarVendas.add(v);	
			}
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return listarVendas;
	}
	
	
	
	public double total (int id_produto) {
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		PreparedStatement statement = null;
		ResultSet resultset = null;
		
		double total = 0;
		
		ProdutoDAO dao = new ProdutoDAO ();
		VendaDAO dao2 = new VendaDAO();
		
		try {
			statement = conexao.prepareStatement("SELECT * FROM produto WHERE id_produto = ?");
			statement.setInt(1, id_produto);
			resultset = statement.executeQuery();
			
			while (resultset.next()) {
				Produto produto = new  Produto();
				Venda venda = new Venda();
				VendaDAO vendaDAO = new VendaDAO();
				
				venda.setId_venda(resultset.getInt("id_venda"));
				venda.setId_produto(produto.getId_produto());
				produto.setDescricao(resultset.getString("descricao"));
				venda.setQtde(resultset.getFloat("qtde"));
				produto.setValor(resultset.getFloat("valor"));
			
				
				total = total + (produto.getValor()*venda.getQtde());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return total;		
	
	}
	
}

