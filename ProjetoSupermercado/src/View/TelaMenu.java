package View;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.text.ParseException;
import java.awt.Font;

import javax.swing.JButton;


public class TelaMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabelBemVindo;
	private JButton ButtonCaixa;
	private JLabel lblNewLabelVenda;
	private JButton ButtonFuncionario;
	private JLabel lblNewLabelFuncionario;
	private JButton ButtonClientes;
	private JLabel lblNewLabelClientes;
	private JButton ButtonFornecedores;
	private JLabel lblNewLabelFornecedores;
	private JButton ButtonProdutos;
	private JLabel lblNewLabelProdutos;
	private JButton ButtonRelatorio;
	private JLabel lblNewLabelRelatorios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	@SuppressWarnings({ })
	public TelaMenu() throws ParseException {
		setResizable(false);
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 389);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabelBemVindo = new JLabel("Seja Bem-Vindo");
		lblNewLabelBemVindo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 34));
		lblNewLabelBemVindo.setForeground(new Color(255, 255, 255));
		lblNewLabelBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelBemVindo.setBounds(0, 11, 522, 48);
		contentPane.add(lblNewLabelBemVindo);
		
		ButtonCaixa = new JButton("");
		ButtonCaixa.setIcon(new ImageIcon(TelaMenu.class.getResource("/Imagem/caixa (2).png")));
		ButtonCaixa.setBounds(10, 82, 111, 103);
		contentPane.add(ButtonCaixa);
		
		//sem borda
		ButtonCaixa.setFocusable(false);
		ButtonCaixa.setFocusPainted(false);
		ButtonCaixa.setBorderPainted( false );
		
		//fundo transparente
		ButtonCaixa.setOpaque(false);
		ButtonCaixa.setContentAreaFilled(false);
		
		lblNewLabelVenda = new JLabel("Realizar Venda");
		lblNewLabelVenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelVenda.setForeground(new Color(255, 255, 255));
		lblNewLabelVenda.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelVenda.setBounds(10, 173, 111, 14);
		contentPane.add(lblNewLabelVenda);
		
		ButtonFuncionario = new JButton("");
		ButtonFuncionario.setIcon(new ImageIcon(TelaMenu.class.getResource("/Imagem/funcionario.png")));
		ButtonFuncionario.setBounds(210, 82, 111, 103);
		contentPane.add(ButtonFuncionario);
		
		
		//sem borda
		ButtonFuncionario.setFocusable(false);
		ButtonFuncionario.setFocusPainted(false);
		ButtonFuncionario.setBorderPainted( false );
			
		//fundo transparente
		ButtonFuncionario.setOpaque(false);
		ButtonFuncionario.setContentAreaFilled(false);
		
		lblNewLabelFuncionario = new JLabel("Funcion\u00E1rios");
		lblNewLabelFuncionario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelFuncionario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelFuncionario.setForeground(new Color(255, 255, 255));
		lblNewLabelFuncionario.setBounds(220, 171, 101, 14);
		contentPane.add(lblNewLabelFuncionario);
		
		ButtonClientes = new JButton("");
		ButtonClientes.setIcon(new ImageIcon(TelaMenu.class.getResource("/Imagem/cliente.png")));
		ButtonClientes.setBounds(370, 82, 111, 103);
		contentPane.add(ButtonClientes);
		
		//sem borda
		ButtonClientes.setFocusable(false);
		ButtonClientes.setFocusPainted(false);
		ButtonClientes.setBorderPainted( false );
				
		//fundo transparente
		ButtonClientes.setOpaque(false);
		ButtonClientes.setContentAreaFilled(false);
		
		lblNewLabelClientes = new JLabel("Clientes");
		lblNewLabelClientes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelClientes.setForeground(new Color(255, 255, 255));
		lblNewLabelClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelClientes.setBounds(370, 171, 111, 14);
		contentPane.add(lblNewLabelClientes);
		
		ButtonFornecedores = new JButton("");
		ButtonFornecedores.setIcon(new ImageIcon(TelaMenu.class.getResource("/Imagem/fornecedorr.png")));
		ButtonFornecedores.setBounds(10, 213, 111, 103);
		contentPane.add(ButtonFornecedores);
		
		
		//sem borda
		ButtonFornecedores.setFocusable(false);
		ButtonFornecedores.setFocusPainted(false);
		ButtonFornecedores.setBorderPainted( false );
				
		//fundo transparente
		ButtonFornecedores.setOpaque(false);
		ButtonFornecedores.setContentAreaFilled(false);
		
		lblNewLabelFornecedores = new JLabel("Fornecedores");
		lblNewLabelFornecedores.setForeground(new Color(255, 255, 255));
		lblNewLabelFornecedores.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelFornecedores.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelFornecedores.setBounds(10, 304, 111, 14);
		contentPane.add(lblNewLabelFornecedores);
		
		ButtonProdutos = new JButton("");
		ButtonProdutos.setIcon(new ImageIcon(TelaMenu.class.getResource("/Imagem/produtos.png")));
		ButtonProdutos.setBounds(210, 213, 111, 103);
		contentPane.add(ButtonProdutos);
		
		//sem borda
		ButtonProdutos.setFocusable(false);
		ButtonProdutos.setFocusPainted(false);
		ButtonProdutos.setBorderPainted( false );
			
		//fundo transparente
		ButtonProdutos.setOpaque(false);
		ButtonProdutos.setContentAreaFilled(false);
		
		lblNewLabelProdutos = new JLabel("Produtos");
		lblNewLabelProdutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelProdutos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelProdutos.setForeground(new Color(255, 255, 255));
		lblNewLabelProdutos.setBounds(210, 302, 111, 14);
		contentPane.add(lblNewLabelProdutos);
		
		ButtonRelatorio = new JButton("");
		ButtonRelatorio.setIcon(new ImageIcon(TelaMenu.class.getResource("/Imagem/relatorio.png")));
		ButtonRelatorio.setBounds(370, 213, 111, 103);
		contentPane.add(ButtonRelatorio);
		
		//sem borda
		ButtonRelatorio.setFocusable(false);
		ButtonRelatorio.setFocusPainted(false);
		ButtonRelatorio.setBorderPainted( false );
				
		//fundo transparente
		ButtonRelatorio.setOpaque(false);
		ButtonRelatorio.setContentAreaFilled(false);
		
		lblNewLabelRelatorios = new JLabel("Relat\u00F3rios");
		lblNewLabelRelatorios.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelRelatorios.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelRelatorios.setForeground(new Color(255, 255, 255));
		lblNewLabelRelatorios.setBounds(370, 302, 111, 14);
		contentPane.add(lblNewLabelRelatorios);
		
		JLabel lblNewLabelFundo = new JLabel("");
		lblNewLabelFundo.setIcon(new ImageIcon(TelaMenu.class.getResource("/Imagem/fundo--.png")));
		lblNewLabelFundo.setBounds(-223, -94, 836, 574);
		contentPane.add(lblNewLabelFundo);
				
	}
}
