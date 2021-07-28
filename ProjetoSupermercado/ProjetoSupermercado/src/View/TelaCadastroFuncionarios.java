package View;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import DAO.FuncionarioDAO;
import Modelo.Funcionario;

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
import javax.swing.JPasswordField;

public class TelaCadastroFuncionarios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtRua;
	private JTextField txtNum;
	private JTextField txtBairro;
	private JTextField txtCompl;
	private JTextField txtCEP;
	private JTextField txtCidade;
	private JTextField txtEmail;
	private JTextField txtLogin;
	private JTextField txtSalario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFuncionarios frame = new TelaCadastroFuncionarios();
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
	public TelaCadastroFuncionarios() throws ParseException {
		setResizable(false);
		setTitle("Cadastro Funcion\u00E1ros");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 570, 690);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelDados = new JLabel("Dados Pessoais");
		lblNewLabelDados.setBackground(Color.WHITE);
		lblNewLabelDados.setForeground(new Color(255, 153, 0));
		lblNewLabelDados.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabelDados.setBounds(10, 24, 187, 14);
		contentPane.add(lblNewLabelDados);
		
		JLabel lblNewLabelCPF = new JLabel("CPF: ");
		lblNewLabelCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCPF.setForeground(new Color(255, 255, 255));
		lblNewLabelCPF.setBounds(10, 49, 46, 14);
		contentPane.add(lblNewLabelCPF);
		
		JFormattedTextField FTxtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		FTxtCpf.setBounds(10, 67, 170, 20);
		contentPane.add(FTxtCpf);
		
		JLabel lblNewLabelNome = new JLabel("Nome: ");
		lblNewLabelNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelNome.setForeground(new Color(255, 255, 255));
		lblNewLabelNome.setBounds(10, 115, 46, 14);
		contentPane.add(lblNewLabelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 140, 339, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabelDt = new JLabel("Data de Nascimento:");
		lblNewLabelDt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelDt.setForeground(new Color(255, 255, 255));
		lblNewLabelDt.setBounds(424, 115, 139, 14);
		contentPane.add(lblNewLabelDt);
		
		JFormattedTextField FTxtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		FTxtData.setBounds(424, 140, 107, 20);
		contentPane.add(FTxtData);
		
		
		JLabel lblNewLabelCargo = new JLabel("Cargo:");
		lblNewLabelCargo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCargo.setForeground(Color.WHITE);
		lblNewLabelCargo.setBounds(10, 185, 71, 14);
		contentPane.add(lblNewLabelCargo);
		
		JComboBox comboBox_Cargo = new JComboBox();
		comboBox_Cargo.setModel(new DefaultComboBoxModel(new String[] {"Op\u00E7\u00F5es", "A\u00E7ougueiro", "Auxiliar Adm", "Conferente de Loja", "Empacotador", "Operador de Caixa", "Operador de Loja", "Padeiro e Confeiteiro", "Pexeiro", ""}));
		comboBox_Cargo.setBounds(10, 210, 100, 22);
		contentPane.add(comboBox_Cargo);
		
		JLabel lblNewLabelSalario = new JLabel("Sal\u00E1rio:");
		lblNewLabelSalario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelSalario.setForeground(Color.WHITE);
		lblNewLabelSalario.setBounds(138, 185, 46, 14);
		contentPane.add(lblNewLabelSalario);	
	
		
		JLabel lblNewLabelLogin = new JLabel("Login: ");
		lblNewLabelLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelLogin.setForeground(Color.WHITE);
		lblNewLabelLogin.setBounds(230, 186, 71, 14);
		contentPane.add(lblNewLabelLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(230, 211, 179, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabelSenha = new JLabel("Senha: ");
		lblNewLabelSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelSenha.setForeground(Color.WHITE);
		lblNewLabelSenha.setBounds(424, 185, 46, 14);
		contentPane.add(lblNewLabelSenha);
		
		
		txtSalario = new JTextField();
		txtSalario.setBounds(138, 211, 62, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(424, 211, 107, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabelEndereco = new JLabel("Endere\u00E7o");
		lblNewLabelEndereco.setForeground(new Color(255, 153, 0));
		lblNewLabelEndereco.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabelEndereco.setBounds(10, 288, 90, 14);
		contentPane.add(lblNewLabelEndereco);
		
		JLabel lblNewLabelRua = new JLabel("Rua:");
		lblNewLabelRua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelRua.setForeground(new Color(255, 255, 255));
		lblNewLabelRua.setBounds(10, 323, 46, 14);
		contentPane.add(lblNewLabelRua);
		
		txtRua = new JTextField();
		txtRua.setText("");
		txtRua.setBounds(10, 348, 270, 20);
		contentPane.add(txtRua);
		txtRua.setColumns(10);
		
		JLabel lblNewLabelNum = new JLabel("N\u00BA:");
		lblNewLabelNum.setForeground(new Color(255, 255, 255));
		lblNewLabelNum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelNum.setBounds(303, 323, 46, 14);
		contentPane.add(lblNewLabelNum);
		
		txtNum = new JTextField();
		txtNum.setBounds(303, 348, 46, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblNewLabelBairro = new JLabel("Bairro:");
		lblNewLabelBairro.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabelBairro.setForeground(new Color(255, 255, 255));
		lblNewLabelBairro.setBounds(379, 323, 100, 14);
		contentPane.add(lblNewLabelBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(379, 348, 152, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblNewLabelCompl = new JLabel("Complemento: ");
		lblNewLabelCompl.setForeground(new Color(255, 255, 255));
		lblNewLabelCompl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCompl.setBounds(10, 396, 139, 14);
		contentPane.add(lblNewLabelCompl);
		
		txtCompl = new JTextField();
		txtCompl.setBounds(10, 421, 117, 20);
		contentPane.add(txtCompl);
		txtCompl.setColumns(10);
		
		JLabel lblNewLabelCEP = new JLabel("CEP: ");
		lblNewLabelCEP.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabelCEP.setForeground(new Color(255, 255, 255));
		lblNewLabelCEP.setBounds(147, 396, 46, 14);
		contentPane.add(lblNewLabelCEP);
		
		txtCEP = new JTextField();
		txtCEP.setBounds(147, 421, 100, 20);
		contentPane.add(txtCEP);
		txtCEP.setColumns(10);
		
		JLabel lblNewLabelCidade = new JLabel("Cidade: ");
		lblNewLabelCidade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCidade.setForeground(new Color(255, 255, 255));
		lblNewLabelCidade.setBounds(271, 396, 71, 14);
		contentPane.add(lblNewLabelCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(271, 421, 195, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblNewLabelUF = new JLabel("UF: ");
		lblNewLabelUF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelUF.setForeground(new Color(255, 255, 255));
		lblNewLabelUF.setBounds(489, 396, 46, 14);
		contentPane.add(lblNewLabelUF);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF"}));
		comboBox.setBounds(489, 420, 42, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabelContato = new JLabel("Contatos");
		lblNewLabelContato.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabelContato.setForeground(new Color(255, 153, 0));
		lblNewLabelContato.setBounds(10, 473, 117, 14);
		contentPane.add(lblNewLabelContato);
		
		JLabel lblNewLabelCelular = new JLabel("Celular: ");
		lblNewLabelCelular.setForeground(new Color(255, 255, 255));
		lblNewLabelCelular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCelular.setBounds(10, 509, 90, 14);
		contentPane.add(lblNewLabelCelular);
		
		JFormattedTextField FTxtCel = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
		FTxtCel.setBounds(10, 534, 128, 20);
		contentPane.add(FTxtCel);
		
		JLabel lblNewLabelEmail = new JLabel("E-mail:");
		lblNewLabelEmail.setForeground(new Color(255, 255, 255));
		lblNewLabelEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelEmail.setBounds(230, 509, 71, 14);
		contentPane.add(lblNewLabelEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(230, 534, 301, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		
		JButton ButtonSalvar = new JButton("Salvar");
		ButtonSalvar.setEnabled(false);
		ButtonSalvar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				Funcionario f = new Funcionario();
				FuncionarioDAO dao = new FuncionarioDAO();
				
				
				f.setCpf(FTxtCpf.getText());
				f.setNome(txtNome.getText());
				f.setData_nasc(FTxtData.getText());
				
				f.setCargo(comboBox_Cargo.getSelectedItem().toString());
				f.setSalario(Float.parseFloat(txtSalario.getText()));
				f.setLogin(txtLogin.getText());
				f.setSenha(passwordField.getText());
				
				
				f.setRua(txtRua.getText());
				f.setNumero(Integer.parseInt(txtNum.getText()));
				f.setBairro(txtBairro.getText());
				f.setComplemento(txtCompl.getText());
				f.setCep(Integer.parseInt(txtCEP.getText()));
				f.setCidade(txtCidade.getText());
				f.setUf(comboBox.getSelectedItem().toString());
				
				f.setCelular(FTxtCel.getText());
				f.setEmail(txtEmail.getText());
				
				dao.Cadastrar(f);
			}
			
		});
		ButtonSalvar.setBackground(new Color(255, 255, 255));
		ButtonSalvar.setForeground(new Color(255, 153, 0));
		ButtonSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		ButtonSalvar.setBounds(230, 597, 89, 23);
		contentPane.add(ButtonSalvar);
		
		
		JButton ButtonAlterar = new JButton("Alterar");
		ButtonAlterar.setEnabled(false);
		ButtonAlterar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				Funcionario f = new Funcionario();
				FuncionarioDAO dao = new FuncionarioDAO();
				
				
				f.setCpf(FTxtCpf.getText());
				f.setNome(txtNome.getText());
				f.setData_nasc(FTxtData.getText());
				
				f.setCargo(comboBox_Cargo.getSelectedItem().toString());
				f.setSalario(Float.parseFloat(txtSalario.getText()));
				f.setLogin(txtLogin.getText());
				f.setSenha(passwordField.getText());
				
				f.setRua(txtRua.getText());
				f.setNumero(Integer.parseInt(txtNum.getText()));
				f.setBairro(txtBairro.getText());
				f.setComplemento(txtCompl.getText());
				f.setCep(Integer.parseInt(txtCEP.getText()));
				f.setCidade(txtCidade.getText());
				f.setUf(comboBox.getSelectedItem().toString());
				
				f.setCelular(FTxtCel.getText());
				f.setEmail(txtEmail.getText());
				
				dao.Atualizar(f);				
			}
		});
		ButtonAlterar.setBackground(new Color(255, 255, 255));
		ButtonAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		ButtonAlterar.setForeground(new Color(255, 153, 0));
		ButtonAlterar.setBounds(340, 597, 89, 23);
		contentPane.add(ButtonAlterar);
		
		
		
		JButton ButtonExcluir = new JButton("Excluir");
		ButtonExcluir.setEnabled(false);
		ButtonExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				FuncionarioDAO dao = new FuncionarioDAO();
				
				dao.Excluir(FTxtCpf.getText());
				
				
				FTxtCpf.setText("");
				txtNome.setText("");
				FTxtData.setText("");
				
				comboBox_Cargo.setSelectedItem("");
				txtSalario.setText("");
				txtLogin.setText("");
				passwordField.setText("");
				
				txtRua.setText("");
				txtNum.setText("");
				txtBairro.setText("");
				txtCompl.setText("");
				txtCEP.setText("");
				txtCidade.setText("");
				comboBox.setSelectedItem("");
				
				FTxtCel.setText("");
				txtEmail.setText("");				
			}
		});
		ButtonExcluir.setForeground(new Color(255, 153, 0));
		ButtonExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		ButtonExcluir.setBounds(442, 597, 89, 23);
		contentPane.add(ButtonExcluir);
		
		JButton ButtonBusca = new JButton("");
		ButtonBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Funcionario f = new Funcionario();
				FuncionarioDAO dao = new FuncionarioDAO();
				
				
				f = dao.BuscarFuncionario(FTxtCpf.getText()); // ASSIM PEGA OS DADOS DO FUNCIONÁRIO
							
				if(f.getCpf() == null) {
					
					ButtonSalvar.setEnabled(true);
					
				}
				else {
					
					FTxtCpf.setText(f.getCpf());
					txtNome.setText(f.getNome());
					FTxtData.setText(f.getData_nasc());
					
					comboBox_Cargo.setSelectedItem(f.getCargo());
					txtSalario.setText(Float.toString(f.getSalario()));
					txtLogin.setText(f.getLogin());
					passwordField.setText(f.getSenha());
					
					
					txtRua.setText(f.getRua());
					txtNum.setText(Integer.toString(f.getNumero()));
					txtBairro.setText(f.getBairro());
					txtCompl.setText(f.getComplemento());
					txtCEP.setText(Integer.toString(f.getCep()));
					txtCidade.setText(f.getCidade());
					comboBox.setSelectedItem(f.getUf());
					
					FTxtCel.setText(f.getCelular()); 
					txtEmail.setText(f.getEmail());
					
					ButtonAlterar.setEnabled(true);
					ButtonExcluir.setEnabled(true);
				}
			}
		});
		ButtonBusca.setHorizontalAlignment(SwingConstants.LEFT);
		ButtonBusca.setIcon(new ImageIcon(TelaCadastroFuncionarios.class.getResource("/Imagem/lupaLaranja.png")));
		ButtonBusca.setBounds(176, 58, 62, 37);
		contentPane.add(ButtonBusca);
	
		//sem borda
		ButtonBusca.setFocusable(false);
		ButtonBusca.setFocusPainted(false);
		ButtonBusca.setBorderPainted( false );
		
		//fundo transparente
		ButtonBusca.setOpaque(false);
		ButtonBusca.setContentAreaFilled(false);
		
		JButton ButtonListar = new JButton("Listar");
		ButtonListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaTableFuncionario telaTableFuncionario = null;
				try {
					telaTableFuncionario = new TelaTableFuncionario();
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				telaTableFuncionario.setVisible(true);
			}
		});
		ButtonListar.setFont(new Font("Tahoma", Font.BOLD, 12));
		ButtonListar.setForeground(new Color(204, 153, 0));
		ButtonListar.setBounds(11, 598, 89, 23);
		contentPane.add(ButtonListar);
		
		JLabel lblNewLabelFundo = new JLabel("");
		lblNewLabelFundo.setIcon(new ImageIcon(TelaCadastroFuncionarios.class.getResource("/Imagem/fundo--.png")));
		lblNewLabelFundo.setBounds(-188, 0, 773, 661);
		contentPane.add(lblNewLabelFundo);
		
		
						
	}
}
