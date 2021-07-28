package DAO;

import javax.swing.JOptionPane;

public class TestaConexao {
	
	public TestaConexao() {
		
	}
	
	public static void main (String[] args) {
		try {
			new ConexaoBanco().ConexaoComBanco();
			JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso");
		}
		catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na conexão" + erro);
		}
	}

}
