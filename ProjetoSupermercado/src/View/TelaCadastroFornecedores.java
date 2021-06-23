package View;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import DAO.FornecedorDAO;
import Modelo.Fornecedor;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.text.ParseException;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroFornecedores extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRazaoSocial;
	private JTextField txtRua;
	private JTextField txtNum;
	private JTextField txtBairro;
	private JTextField txtCompl;
	private JTextField txtCEP;
	private JTextField txtCidade;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFornecedores frame = new TelaCadastroFornecedores();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public TelaCadastroFornecedores() throws ParseException {
		setResizable(false);
		setTitle("Cadastro Fornecedor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 580, 577);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelDados = new JLabel("Dados ");
		lblNewLabelDados.setBackground(Color.WHITE);
		lblNewLabelDados.setForeground(new Color(255, 153, 0));
		lblNewLabelDados.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabelDados.setBounds(10, 24, 187, 14);
		contentPane.add(lblNewLabelDados);
		
		JLabel lblNewLabelCNPJ = new JLabel("CNPJ: ");
		lblNewLabelCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCNPJ.setForeground(new Color(255, 255, 255));
		lblNewLabelCNPJ.setBounds(10, 49, 46, 14);
		contentPane.add(lblNewLabelCNPJ);
		
		JFormattedTextField FTxtCnpj = new JFormattedTextField(new MaskFormatter("##.###.###/####-##"));
		FTxtCnpj.setBounds(10, 67, 170, 20);
		contentPane.add(FTxtCnpj);
		
		JLabel lblNewLabelRazaoSocial = new JLabel("Nome: ");
		lblNewLabelRazaoSocial.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelRazaoSocial.setForeground(new Color(255, 255, 255));
		lblNewLabelRazaoSocial.setBounds(10, 115, 46, 14);
		contentPane.add(lblNewLabelRazaoSocial);
		
		txtRazaoSocial = new JTextField();
		txtRazaoSocial.setBounds(10, 140, 339, 20);
		contentPane.add(txtRazaoSocial);
		txtRazaoSocial.setColumns(10);
		
		JLabel lblNewLabelEndereco = new JLabel("Endere\u00E7o");
		lblNewLabelEndereco.setForeground(new Color(255, 153, 0));
		lblNewLabelEndereco.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabelEndereco.setBounds(10, 192, 90, 14);
		contentPane.add(lblNewLabelEndereco);
		
		JLabel lblNewLabelRua = new JLabel("Rua:");
		lblNewLabelRua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelRua.setForeground(new Color(255, 255, 255));
		lblNewLabelRua.setBounds(10, 227, 46, 14);
		contentPane.add(lblNewLabelRua);
		
		txtRua = new JTextField();
		txtRua.setText("");
		txtRua.setBounds(10, 252, 270, 20);
		contentPane.add(txtRua);
		txtRua.setColumns(10);
		
		JLabel lblNewLabelNum = new JLabel("N\u00BA:");
		lblNewLabelNum.setForeground(new Color(255, 255, 255));
		lblNewLabelNum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelNum.setBounds(303, 228, 46, 14);
		contentPane.add(lblNewLabelNum);
		
		txtNum = new JTextField();
		txtNum.setBounds(303, 252, 46, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblNewLabelBairro = new JLabel("Bairro:");
		lblNewLabelBairro.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabelBairro.setForeground(new Color(255, 255, 255));
		lblNewLabelBairro.setBounds(379, 227, 100, 14);
		contentPane.add(lblNewLabelBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(379, 252, 152, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblNewLabelCompl = new JLabel("Complemento: ");
		lblNewLabelCompl.setForeground(new Color(255, 255, 255));
		lblNewLabelCompl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCompl.setBounds(10, 297, 139, 14);
		contentPane.add(lblNewLabelCompl);
		
		txtCompl = new JTextField();
		txtCompl.setBounds(10, 322, 117, 20);
		contentPane.add(txtCompl);
		txtCompl.setColumns(10);
		
		JLabel lblNewLabelCEP = new JLabel("CEP: ");
		lblNewLabelCEP.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabelCEP.setForeground(new Color(255, 255, 255));
		lblNewLabelCEP.setBounds(147, 297, 46, 14);
		contentPane.add(lblNewLabelCEP);
		
		txtCEP = new JTextField();
		txtCEP.setBounds(147, 322, 100, 20);
		contentPane.add(txtCEP);
		txtCEP.setColumns(10);
		
		JLabel lblNewLabelCidade = new JLabel("Cidade: ");
		lblNewLabelCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCidade.setForeground(new Color(255, 255, 255));
		lblNewLabelCidade.setBounds(271, 297, 71, 14);
		contentPane.add(lblNewLabelCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(271, 322, 195, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblNewLabelUF = new JLabel("UF: ");
		lblNewLabelUF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelUF.setForeground(new Color(255, 255, 255));
		lblNewLabelUF.setBounds(485, 298, 46, 14);
		contentPane.add(lblNewLabelUF);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF"}));
		comboBox.setBounds(489, 321, 42, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabelContato = new JLabel("Contatos");
		lblNewLabelContato.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabelContato.setForeground(new Color(255, 153, 0));
		lblNewLabelContato.setBounds(10, 383, 117, 14);
		contentPane.add(lblNewLabelContato);
		
		JLabel lblNewLabelTelefone = new JLabel("Telefone: ");
		lblNewLabelTelefone.setForeground(new Color(255, 255, 255));
		lblNewLabelTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelTelefone.setBounds(10, 415, 90, 14);
		contentPane.add(lblNewLabelTelefone);
		
		JFormattedTextField FTxtTel = new JFormattedTextField(new MaskFormatter("(##)####-####"));
		FTxtTel.setBounds(10, 440, 128, 20);
		contentPane.add(FTxtTel);
		
		JLabel lblNewLabelEmail = new JLabel("E-mail:");
		lblNewLabelEmail.setForeground(new Color(255, 255, 255));
		lblNewLabelEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelEmail.setBounds(230, 415, 71, 14);
		contentPane.add(lblNewLabelEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(230, 440, 301, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		
		JButton ButtonSalvar = new JButton("Salvar");
		ButtonSalvar.setEnabled(false);
		ButtonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fornecedor f = new Fornecedor();
				FornecedorDAO dao = new FornecedorDAO();
				
				
				f.setCnpj(FTxtCnpj.getText());
				f.setRazao_social(txtRazaoSocial.getText());
				
				f.setRua(txtRua.getText());
				f.setNumero(Integer.parseInt(txtNum.getText()));
				f.setBairro(txtBairro.getText());
				f.setComplemento(txtCompl.getText());
				f.setCep(Integer.parseInt(txtCEP.getText()));
				f.setCidade(txtCidade.getText());
				f.setUf(comboBox.getSelectedItem().toString());
				
				f.setTelefone(FTxtTel.getText());
				f.setEmail(txtEmail.getText());
				
				dao.Cadastrar(f);
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
				
				Fornecedor f = new Fornecedor();
				FornecedorDAO dao = new FornecedorDAO();
				
				
				f.setCnpj(FTxtCnpj.getText());
				f.setRazao_social(txtRazaoSocial.getText());
				
				f.setRua(txtRua.getText());
				f.setNumero(Integer.parseInt(txtNum.getText()));
				f.setBairro(txtBairro.getText());
				f.setComplemento(txtCompl.getText());
				f.setCep(Integer.parseInt(txtCEP.getText()));
				f.setCidade(txtCidade.getText());
				f.setUf(comboBox.getSelectedItem().toString());
				
				f.setTelefone(FTxtTel.getText());
				f.setEmail(txtEmail.getText());
				
				dao.Atualizar(f);				
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

				FornecedorDAO dao = new FornecedorDAO();
								
				dao.Excluir(FTxtCnpj.getText());
				
				
				FTxtCnpj.setText("");
				txtRazaoSocial.setText("");
				
				txtRua.setText("");
				txtNum.setText("");
				txtBairro.setText("");
				txtCompl.setText("");
				txtCEP.setText("");
				txtCidade.setText("");
				comboBox.setSelectedItem("");
				
				FTxtTel.setText("");
				txtEmail.setText("");				
			}
		});
		ButtonExcluir.setForeground(new Color(255, 153, 0));
		ButtonExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		ButtonExcluir.setBounds(442, 491, 89, 23);
		contentPane.add(ButtonExcluir);
		
		JButton ButtonBusca = new JButton("");
		ButtonBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fornecedor f = new Fornecedor();
				FornecedorDAO dao = new FornecedorDAO();
				
				
				f = dao.BuscarFornecedor(FTxtCnpj.getText()); // ASSIM PEGA OS DADOS CLIENTE
							
				if(f.getCnpj() == null) {
					
					ButtonSalvar.setEnabled(true);
					
				}
				else {
					
					FTxtCnpj.setText(f.getCnpj());
					txtRazaoSocial.setText(f.getRazao_social());
					
					txtRua.setText(f.getRua());
					txtNum.setText(Integer.toString(f.getNumero()));
					txtBairro.setText(f.getBairro());
					txtCompl.setText(f.getComplemento());
					txtCEP.setText(Integer.toString(f.getCep()));
					txtCidade.setText(f.getCidade());
					comboBox.setSelectedItem(f.getUf());
					
					FTxtTel.setText(f.getTelefone()); 
					txtEmail.setText(f.getEmail());
					
					ButtonAlterar.setEnabled(true);
					ButtonExcluir.setEnabled(true);
				}
			}
		});
		ButtonBusca.setHorizontalAlignment(SwingConstants.LEFT);
		ButtonBusca.setIcon(new ImageIcon(TelaCadastroFornecedores.class.getResource("/Imagem/lupaLaranja.png")));
		ButtonBusca.setBounds(176, 58, 62, 37);
		contentPane.add(ButtonBusca);
	
		//sem borda
		ButtonBusca.setFocusable(false);
		ButtonBusca.setFocusPainted(false);
		ButtonBusca.setBorderPainted( false );
		
		//fundo transparente
		ButtonBusca.setOpaque(false);
		ButtonBusca.setContentAreaFilled(false);
		
		
		JLabel lblNewLabelFundo = new JLabel("");
		lblNewLabelFundo.setIcon(new ImageIcon(TelaCadastroFornecedores.class.getResource("/Imagem/fundo--.png")));
		lblNewLabelFundo.setBounds(-208, 0, 782, 560);
		contentPane.add(lblNewLabelFundo);
				
	}
}
