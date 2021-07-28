package DAO;
import java.sql.Connection;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

//import Connection.ConnectionFactory;
//import Modelo.Fornecedor;
import Modelo.Produto;

public class ProdutoDAO {

	
	public Produto BuscarProduto(Integer id_produto) {      //OBS: não tá pegando o id
		

		Connection conexao = ConexaoBanco.ConexaoComBanco();
		try {
			
			//criando o comando sql
			String sql = "SELECT * FROM produto WHERE id_produto = ?";	

			// conectando com o banco de dados
			PreparedStatement statement = conexao.prepareStatement(sql);
		
			statement.setInt(1, id_produto);
			ResultSet resultset = statement.executeQuery();
			
			Produto p = new Produto();	
					
			if(resultset.next()) {
						
			p.setId_produto(resultset.getInt("id_produto"));
			p.setDescricao(resultset.getString("descricao")); 
			
			p.setCategoria(resultset.getString("categoria"));
			p.setUnidade_medida(resultset.getString("unidade_medida"));
			p.setValor(resultset.getFloat("valor")); 
			p.setQtde_estoque(resultset.getInt("qtde_estoque"));
			p.setFornecedor(resultset.getInt("fornecedor"));
			
			JOptionPane.showMessageDialog(null, "Produto encontrado");
			}
			else {
				
			JOptionPane.showMessageDialog(null, "Produto não encontrado");
			}
			
		return p;
			
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Erro" + e);
			return null;
		}
		
	}
	
		
	public void Cadastrar (Produto p) {
				
		Connection conexao = ConexaoBanco.ConexaoComBanco();


		try {
			
			String sql = "INSERT INTO produto(descricao, categoria, unidade_medida,"
					+ "valor, qtde_estoque, fornecedor) VALUES(?,?,?,?,?,?)";
						
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setString(1, p.getDescricao()); 
			stmt.setString(2, p.getCategoria());
			stmt.setString(3, p.getUnidade_medida());
			stmt.setDouble(4, p.getValor());
			stmt.setInt(5, p.getQtde_estoque());
			stmt.setInt(6, p.getFornecedor());
				
			
			// executa os comandos sql
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);	
		}
	}
	
	
	public void Atualizar (Produto produto) {
		
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
				
			
			String sql = "UPDATE produto SET descricao = ?, categoria = ?, unidade_medida = ?,"
					+ "valor = ?, qtde_estoque = ?, fornecedor = ? WHERE id_produto = ?";
			
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			
			stmt.setString(1, produto.getDescricao());
			stmt.setString(2, produto.getCategoria());
			stmt.setString(3, produto.getUnidade_medida());
			stmt.setDouble(4, produto.getValor());
			stmt.setInt(5, produto.getQtde_estoque());
			stmt.setInt(6, produto.getFornecedor());
			stmt.setInt(7, produto.getId_produto());
		
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro" + erro);	
			erro.printStackTrace();
		}
	}
	
	
	public void Excluir (int id_produto) {
		
		
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
			
			String sql = "DELETE FROM produto id_produto WHERE id_produto = ?";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, id_produto);
			
			stmt.execute();
			stmt.close();
			
			JOptionPane.showMessageDialog(null, "Excluído");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir" + e);
		}
	}
	
		
	
	public List<Produto> listarProdutos() {
		
		List<Produto> listarProdutos = new ArrayList<Produto>();
		Connection conexao = ConexaoBanco.ConexaoComBanco();
		
		try {
					
			String sql = "SELECT * FROM produto";		
			
			PreparedStatement stmt = conexao.prepareCall(sql);
			ResultSet resultset = stmt.executeQuery();
			
			while (resultset.next()) {
				
				Produto p = new Produto();
				
				p.setId_produto(resultset.getInt("id_produto"));
				p.setDescricao(resultset.getString("descricao"));
				p.setCategoria(resultset.getString("categoria"));
				p.setValor(resultset.getFloat("valor"));
				p.setQtde_estoque(resultset.getInt("qtde_estoque"));
				p.setFornecedor(resultset.getInt("fornecedor"));
								 
				listarProdutos.add(p);	
			}
			conexao.close();
			
		} catch (Exception e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro" + e);
		}
		
		return listarProdutos;
	}
	
}
