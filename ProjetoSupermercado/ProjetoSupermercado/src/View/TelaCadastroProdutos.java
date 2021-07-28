package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import DAO.ProdutoDAO;
import Modelo.Produto;

public class TelaCadastroProdutos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField txtUni;
	private JTextField txtIDP;
	private JTextField txtDescricao;
	private JTextField txtValor;
	private JTextField txtQtde;
	private JTextField txtIDFornecedor;
	private JLabel lblNewLabelLista;
	//private AbstractButton tableProdutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProdutos frame = new TelaCadastroProdutos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 *  @throws ParseException 
	 */
	public TelaCadastroProdutos() {
		setResizable(false);
		setTitle("Cadastro Produtos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 580, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelDados = new JLabel("Dados do Produto");
		lblNewLabelDados.setBackground(Color.WHITE);
		lblNewLabelDados.setForeground(new Color(255, 153, 0));
		lblNewLabelDados.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabelDados.setBounds(10, 24, 228, 14);
		contentPane.add(lblNewLabelDados);
		
		JLabel lblNewLabelID = new JLabel("C\u00F3digo do Produto: ");
		lblNewLabelID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelID.setForeground(new Color(255, 255, 255));
		lblNewLabelID.setBounds(10, 49, 162, 14);
		contentPane.add(lblNewLabelID);
		
		txtIDP = new JTextField();
		txtIDP.setBounds(10, 74, 162, 20);
		contentPane.add(txtIDP);
		txtIDP.setColumns(10);
		
		JLabel lblNewLabel;
		lblNewLabelLista = new JLabel("Listagem de Produtos");
		lblNewLabelLista.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabelLista.setForeground(new Color(255, 153, 0));
		lblNewLabelLista.setBounds(10, 123, 162, 24);
		contentPane.add(lblNewLabelLista);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 158, 541, 137);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Descri\u00E7\u00E3o", "Valor", "Qtde.", "Fornecedor"
			}
		));
		
		
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		
		
		JLabel lblNewLabelDescricao = new JLabel("Descri\u00E7\u00E3o: ");
		lblNewLabelDescricao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelDescricao.setForeground(new Color(255, 255, 255));
		lblNewLabelDescricao.setBounds(10, 306, 90, 14);
		contentPane.add(lblNewLabelDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(10, 331, 339, 20);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblNewLabelCategoria = new JLabel("Categoria: ");
		lblNewLabelCategoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCategoria.setForeground(new Color(255, 255, 255));
		lblNewLabelCategoria.setBounds(398, 306, 139, 14);
		contentPane.add(lblNewLabelCategoria);
				
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setModel(new DefaultComboBoxModel(new String[] {"Op\u00E7\u00F5es", "Bebidas", "Carnes", "Frios e Latic\u00EDnios", "Higiene", "Hortifruti", "Limpeza", "Matinais", "Mercearia", "Padaria", "Pet Shop", "Utilidades Dom\u00E9sticas", "", "", "", "", ""}));
		comboBoxCategoria.setBounds(398, 330, 139, 22);
		contentPane.add(comboBoxCategoria);
		
		
		JLabel lblNewLabelUni = new JLabel("Unidade de Medida:");
		lblNewLabelUni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelUni.setForeground(new Color(255, 255, 255));
		lblNewLabelUni.setBounds(10, 400, 152, 14);
		contentPane.add(lblNewLabelUni);
		
		txtUni = new JTextField();
		txtUni.setText("");
		txtUni.setBounds(10, 425, 117, 20);
		contentPane.add(txtUni);
		txtUni.setColumns(10);
		
		JLabel lblNewLabelValor = new JLabel("Valor:");
		lblNewLabelValor.setForeground(new Color(255, 255, 255));
		lblNewLabelValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelValor.setBounds(172, 400, 46, 14);
		contentPane.add(lblNewLabelValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(172, 425, 50, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblNewLabelQtdeEstoque = new JLabel("Qtde em Estoque:");
		lblNewLabelQtdeEstoque.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabelQtdeEstoque.setForeground(new Color(255, 255, 255));
		lblNewLabelQtdeEstoque.setBounds(263, 400, 127, 14);
		contentPane.add(lblNewLabelQtdeEstoque);
		
		txtQtde = new JTextField();
		txtQtde.setBounds(263, 425, 100, 20);
		contentPane.add(txtQtde);
		txtQtde.setColumns(10);
		
		JLabel lblNewLabelFornecedor = new JLabel("ID Fornecedor:");
		lblNewLabelFornecedor.setForeground(new Color(255, 255, 255));
		lblNewLabelFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelFornecedor.setBounds(398, 400, 139, 14);
		contentPane.add(lblNewLabelFornecedor);
		
		txtIDFornecedor = new JTextField();
		txtIDFornecedor.setBounds(398, 425, 139, 20);
		contentPane.add(txtIDFornecedor);
		txtIDFornecedor.setColumns(10);
			
		
		JButton ButtonSalvar = new JButton("Salvar");
		ButtonSalvar.setEnabled(false);
		ButtonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produto produto = new Produto();
				ProdutoDAO dao = new ProdutoDAO();
								
				produto.setDescricao(txtDescricao.getText());
				produto.setCategoria(comboBoxCategoria.getSelectedItem().toString());
				produto.setUnidade_medida(txtUni.getText());
				produto.setValor(Float.parseFloat(txtValor.getText()));
				produto.setQtde_estoque(Integer.parseInt(txtQtde.getText()));
				produto.setFornecedor(Integer.parseInt(txtIDFornecedor.getText()));
				
				
				dao.Cadastrar(produto);
			}
			
		});
		ButtonSalvar.setBackground(new Color(255, 255, 255));
		ButtonSalvar.setForeground(new Color(255, 153, 0));
		ButtonSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		ButtonSalvar.setBounds(230, 491, 89, 23);
		contentPane.add(ButtonSalvar);
		
		
		JButton ButtonAlterar = new JButton("Alterar");
		ButtonAlterar.setEnabled(false);
		ButtonAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produto produto = new Produto();
				ProdutoDAO dao = new ProdutoDAO();				
				
				produto.setDescricao(txtDescricao.getText());
				produto.setCategoria(comboBoxCategoria.getSelectedItem().toString());
				produto.setUnidade_medida(txtUni.getText());
				produto.setValor(Float.parseFloat(txtValor.getText()));
				produto.setQtde_estoque(Integer.parseInt(txtQtde.getText()));
				produto.setFornecedor(Integer.parseInt(txtIDFornecedor.getText()));
				
				dao.Atualizar(produto);				
			}
		});
		ButtonAlterar.setBackground(new Color(255, 255, 255));
		ButtonAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		ButtonAlterar.setForeground(new Color(255, 153, 0));
		ButtonAlterar.setBounds(342, 491, 89, 23);
		contentPane.add(ButtonAlterar);
		
		
		
		JButton ButtonExcluir = new JButton("Excluir");
		ButtonExcluir.setEnabled(false);
		ButtonExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ProdutoDAO dao = new ProdutoDAO();
								
				dao.Excluir(Integer.parseInt(txtIDP.getText()));
				
				
				txtIDP.setText("");
				txtDescricao.setText("");
				comboBoxCategoria.setSelectedItem("");
				txtUni.setText("");
				txtValor.setText("");
				txtQtde.setText("");
				txtIDFornecedor.setText("");
									
			}
		});
		ButtonExcluir.setForeground(new Color(255, 153, 0));
		ButtonExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		ButtonExcluir.setBounds(442, 491, 89, 23);
		contentPane.add(ButtonExcluir);
		
		JButton ButtonBusca = new JButton("");
		ButtonBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produto produto = new Produto();
				ProdutoDAO dao = new ProdutoDAO();
				
				try {
					
					produto = dao.BuscarProduto(Integer.parseInt(txtIDP.getText())); // não consegui achar o erro
							
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, erro);
				}	
				
				if(produto.getId_produto() == null) {
					
					txtIDP.setText("");
					txtIDP.setText("gerado automaticamente");
					txtIDP.setEnabled(false);
					ButtonSalvar.setEnabled(true);
					
				}
				else {
					
					txtIDP.setText(Integer.toString(produto.getId_produto()));
					txtDescricao.setText(produto.getDescricao());
					comboBoxCategoria.setSelectedItem(produto.getCategoria());
					txtUni.setText(produto.getUnidade_medida());
					txtValor.setText(Double.toString(produto.getValor()));
					txtQtde.setText(Integer.toString(produto.getQtde_estoque()));
					txtIDFornecedor.setText(Integer.toString(produto.getFornecedor()));
										
					ButtonAlterar.setEnabled(true);
					ButtonExcluir.setEnabled(true);
				}
			}
		});
		ButtonBusca.setHorizontalAlignment(SwingConstants.LEFT);
		ButtonBusca.setIcon(new ImageIcon(TelaCadastroProdutos.class.getResource("/Imagem/lupaLaranja.png")));
		ButtonBusca.setBounds(176, 63, 62, 37);
		contentPane.add(ButtonBusca);
	
		//sem borda
		ButtonBusca.setFocusable(false);
		ButtonBusca.setFocusPainted(false);
		ButtonBusca.setBorderPainted( false );
		
		//fundo transparente
		ButtonBusca.setOpaque(false);
		ButtonBusca.setContentAreaFilled(false);
		
		txtIDP = new JTextField();
		txtIDP.setBounds(10, 74, 162, 20);
		contentPane.add(txtIDP);
		txtIDP.setColumns(10);		
			
		JButton button = new JButton("Listar");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				ProdutoDAO dao = new ProdutoDAO();
				
				List<Produto> lista = dao.listarProdutos();
				
				DefaultTableModel dados = (DefaultTableModel)table.getModel();
				
				dados.setNumRows(0);
				
				for(Produto p : lista) {
					dados.addRow(new Object[] { p.getId_produto(), p.getDescricao(), p.getCategoria(),
							p.getValor(),p.getQtde_estoque(), p.getFornecedor()});
				}
			}
		});
		button.setForeground(new Color(204, 153, 0));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(10, 491, 89, 23);
		contentPane.add(button);
		
		
		JLabel lblNewLabelFundo = new JLabel("");
		lblNewLabelFundo.setIcon(new ImageIcon(TelaCadastroProdutos.class.getResource("/Imagem/fundo--.png")));
		lblNewLabelFundo.setBounds(-198, 0, 772, 574);
		contentPane.add(lblNewLabelFundo);
				
	}
	public void listar() {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> lista = dao.listarProdutos();
		
		DefaultTableModel dados = (DefaultTableModel)table.getModel();
		
		dados.setNumRows(0);
		
		for(Produto p : lista) {
			dados.addRow(new Object[] { p.getId_produto(), p.getDescricao(),
				p.getCategoria(), p.getValor(), p.getFornecedor()});
		}
		
		
	}
}
