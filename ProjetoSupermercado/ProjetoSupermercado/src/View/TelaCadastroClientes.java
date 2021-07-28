package View;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import DAO.ClienteDAO;
import Modelo.Cliente;

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

public class TelaCadastroClientes extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroClientes frame = new TelaCadastroClientes();
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
	public TelaCadastroClientes() throws ParseException {
		setResizable(false);
		setTitle("Cadastro Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 580, 577);
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
		lblNewLabelDt.setBounds(414, 115, 139, 14);
		contentPane.add(lblNewLabelDt);
		
		JFormattedTextField FTxtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		FTxtData.setBounds(414, 140, 117, 20);
		contentPane.add(FTxtData);
		
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
		
		JLabel lblNewLabelCelular = new JLabel("Celular: ");
		lblNewLabelCelular.setForeground(new Color(255, 255, 255));
		lblNewLabelCelular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabelCelular.setBounds(10, 415, 90, 14);
		contentPane.add(lblNewLabelCelular);
		
		JFormattedTextField FTxtCel = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
		FTxtCel.setBounds(10, 440, 128, 20);
		contentPane.add(FTxtCel);
		
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
				
				Cliente c = new Cliente();
				ClienteDAO dao = new ClienteDAO();
				
				
				c.setCpf(FTxtCpf.getText());
				c.setNome(txtNome.getText());
				c.setData_nasc(FTxtData.getText());
				
				c.setRua(txtRua.getText());
				c.setNumero(Integer.parseInt(txtNum.getText()));
				c.setBairro(txtBairro.getText());
				c.setComplemento(txtCompl.getText());
				c.setCep(Integer.parseInt(txtCEP.getText()));
				c.setCidade(txtCidade.getText());
				c.setUf(comboBox.getSelectedItem().toString());
				
				c.setCelular(FTxtCel.getText());
				c.setEmail(txtEmail.getText());
				
				dao.Cadastrar(c);
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
				
				Cliente c = new Cliente();
				ClienteDAO dao = new ClienteDAO();
				
				
				c.setCpf(FTxtCpf.getText());
				c.setNome(txtNome.getText());
				c.setData_nasc(FTxtData.getText());
				
				c.setRua(txtRua.getText());
				c.setNumero(Integer.parseInt(txtNum.getText()));
				c.setBairro(txtBairro.getText());
				c.setComplemento(txtCompl.getText());
				c.setCep(Integer.parseInt(txtCEP.getText()));
				c.setCidade(txtCidade.getText());
				c.setUf(comboBox.getSelectedItem().toString());
				
				c.setCelular(FTxtCel.getText());
				c.setEmail(txtEmail.getText());
				
				dao.Atualizar(c);				
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

				ClienteDAO dao = new ClienteDAO();
								
				dao.Excluir(FTxtCpf.getText());
				
				
				FTxtCpf.setText("");
				txtNome.setText("");
				FTxtData.setText("");
				
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
		ButtonExcluir.setBounds(442, 491, 89, 23);
		contentPane.add(ButtonExcluir);
		
		JButton ButtonBusca = new JButton("");
		ButtonBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				ClienteDAO dao = new ClienteDAO();
				
				
				cliente = dao.BuscarCliente(FTxtCpf.getText()); // ASSIM PEGA OS DADOS CLIENTE
							
				if(cliente.getCpf() == null) {
					
					ButtonSalvar.setEnabled(true);
					
				}
				else {
					
					FTxtCpf.setText(cliente.getCpf());
					txtNome.setText(cliente.getNome());
					FTxtData.setText(cliente.getData_nasc());
					
					txtRua.setText(cliente.getRua());
					txtNum.setText(Integer.toString(cliente.getNumero()));
					txtBairro.setText(cliente.getBairro());
					txtCompl.setText(cliente.getComplemento());
					txtCEP.setText(Integer.toString(cliente.getCep()));
					txtCidade.setText(cliente.getCidade());
					comboBox.setSelectedItem(cliente.getUf());
					
					FTxtCel.setText(cliente.getCelular()); 
					txtEmail.setText(cliente.getEmail());
					
					ButtonAlterar.setEnabled(true);
					ButtonExcluir.setEnabled(true);
				}
			}
		});
		ButtonBusca.setHorizontalAlignment(SwingConstants.LEFT);
		ButtonBusca.setIcon(new ImageIcon(TelaCadastroClientes.class.getResource("/Imagem/lupaLaranja.png")));
		ButtonBusca.setBounds(176, 58, 62, 37);
		contentPane.add(ButtonBusca);
	
		//sem borda
		ButtonBusca.setFocusable(false);
		ButtonBusca.setFocusPainted(false);
		ButtonBusca.setBorderPainted( false );
		
		//fundo transparente
		ButtonBusca.setOpaque(false);
		ButtonBusca.setContentAreaFilled(false);
		
		JButton button = new JButton("Listar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaTableClientes telaTableClientes = null;
				try {
					telaTableClientes = new TelaTableClientes();
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				telaTableClientes.setVisible(true);
			}
		});
		button.setForeground(new Color(204, 153, 0));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(10, 492, 89, 23);
		contentPane.add(button);
		
		
		JLabel lblNewLabelFundo = new JLabel("");
		lblNewLabelFundo.setIcon(new ImageIcon(TelaCadastroClientes.class.getResource("/Imagem/fundo--.png")));
		lblNewLabelFundo.setBounds(-198, 0, 772, 574);
		contentPane.add(lblNewLabelFundo);
				
	}
}
