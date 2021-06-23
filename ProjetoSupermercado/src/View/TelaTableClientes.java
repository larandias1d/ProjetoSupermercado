package View;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.text.ParseException;
import java.awt.Frame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.ClienteDAO;
import Modelo.Cliente;

import javax.swing.JScrollPane;

import java.util.List;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;


public class TelaTableClientes extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableClientes;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTableClientes frame = new TelaTableClientes();
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
	public TelaTableClientes() throws ParseException {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
				listar();
				
			}
		});
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setResizable(true);
		setTitle("  Dados do Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1382, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(31, 80, 1296, 483);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1254, 592);
		panel.add(scrollPane);
		
		tableClientes = new JTable();
		tableClientes.setBorder(null);
		tableClientes.setEnabled(false);
		scrollPane.setViewportView(tableClientes);
		tableClientes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "CPF ", "Rua", "N\u00BA", "Bairro", "Contato"
			}
		));
		tableClientes.getColumnModel().getColumn(0).setPreferredWidth(200);
		tableClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
		tableClientes.getColumnModel().getColumn(2).setPreferredWidth(200);
		tableClientes.getColumnModel().getColumn(3).setPreferredWidth(26);
		tableClientes.getColumnModel().getColumn(4).setPreferredWidth(150);
		tableClientes.getColumnModel().getColumn(5).setPreferredWidth(80);

		
		JLabel lblNewLabel = new JLabel("Lista de Clientes");
		lblNewLabel.setForeground(new Color(255, 153, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(0, 25, 1346, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_FUNDO = new JLabel("");
		lblNewLabel_FUNDO.setIcon(new ImageIcon(TelaTableFuncionario.class.getResource("/Imagem/fundooo.png")));
		lblNewLabel_FUNDO.setBounds(-1217, 0, 2583, 713);
		contentPane.add(lblNewLabel_FUNDO);
	}
	
	public void listar() {
		
		ClienteDAO dao = new ClienteDAO();
		
		List<Cliente> lista = dao.listarClientes();
		
		DefaultTableModel dados = (DefaultTableModel)tableClientes.getModel();
		
		dados.setNumRows(0);
		
		for(Cliente c : lista) {
			dados.addRow(new Object[] { c.getNome(), c.getCpf(), c.getRua(), c.getNumero(), c.getBairro(), c.getCelular()});
		}
	}
}

