package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

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
			v.setSubtotal(resultset.getFloat("subtotal"));
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
	
	public void Cadastrar(Venda v) {
		
	}

}
