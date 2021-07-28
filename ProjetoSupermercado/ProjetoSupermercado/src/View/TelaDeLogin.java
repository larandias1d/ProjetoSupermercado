package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import DAO.ConexaoBanco;
import DAO.FuncionarioDAO;
import Modelo.Funcionario;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class TelaDeLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeLogin frame = new TelaDeLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public TelaDeLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaDeLogin.class.getResource("/Imagem/oie_281358o6YJ1ROg.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 51));
			panel.setBounds(10, 11, 324, 255);
			contentPane.add(panel);
			panel.setLayout(null);
			
	
			JLabel lblNewLabelNome = new JLabel("Login:");
			lblNewLabelNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			lblNewLabelNome.setForeground(new Color(255, 153, 0));
			lblNewLabelNome.setBounds(23, 104, 56, 20);
			panel.add(lblNewLabelNome);
			
			txtLogin = new JTextField();
			txtLogin.setBounds(23, 126, 279, 20);
			panel.add(txtLogin);
			txtLogin.setColumns(10);
			
			JLabel lblNewLabelSenha = new JLabel("Senha:");
			lblNewLabelSenha.setForeground(new Color(255, 153, 0));
			lblNewLabelSenha.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
			lblNewLabelSenha.setBounds(23, 169, 46, 14);
			panel.add(lblNewLabelSenha);
			
			txtSenha = new JPasswordField();
			txtSenha.setBounds(23, 190, 279, 20);
			panel.add(txtSenha);
			
			JButton ButtonLogar = new JButton("Logar");
			ButtonLogar.setBackground(new Color(255, 255, 255));
			ButtonLogar.setFont(new Font("Tahoma", Font.BOLD, 12));
			ButtonLogar.setForeground(new Color(255, 153, 0));
			ButtonLogar.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {
					
					Funcionario f = new Funcionario();
					FuncionarioDAO dao = new FuncionarioDAO();
					
					try {
						f.setLogin(txtLogin.getText());
						f.setSenha(txtSenha.getText());
					
						if(dao.Logar(txtLogin.getText(), txtSenha.getText()) == true) {

							TelaMenu telaMenu = null;
							try {
								telaMenu = new TelaMenu();
								telaMenu.setVisible(true);
							} catch (ParseException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
						}
						
					} catch (Exception erro) {
						JOptionPane.showMessageDialog(null,erro);
					}
				}
				});
			ButtonLogar.setBounds(213, 221, 89, 23);
			panel.add(ButtonLogar);
			
			JLabel fundo2 = new JLabel("");
			fundo2.setIcon(new ImageIcon(TelaDeLogin.class.getResource("/Imagem/login.jpg")));
			fundo2.setBounds(0, 0, 324, 255);
			panel.add(fundo2);
			
			JLabel fundo1 = new JLabel("");
			fundo1.setIcon(new ImageIcon(TelaDeLogin.class.getResource("/Imagem/fundo--.png")));
			fundo1.setBounds(0, 0, 344, 291);
			contentPane.add(fundo1);
		}
}