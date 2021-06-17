package View;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.text.ParseException;
import java.awt.Frame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.FuncionarioDAO;
import Modelo.Funcionario;

import javax.swing.JScrollPane;

import java.util.List;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class TelaTableFuncionario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableFuncionarios;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTableFuncionario frame = new TelaTableFuncionario();
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
	public TelaTableFuncionario() throws ParseException {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
				listar();
				
			}
		});
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setResizable(true);
		setTitle("  Dados do Funcion\u00E1rio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1382, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(31, 80, 1296, 596);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(10, 11, 1254, 574);
		panel.add(scrollPane);
		
		tableFuncionarios = new JTable();
		tableFuncionarios.setEnabled(false);
		scrollPane.setViewportView(tableFuncionarios);
		tableFuncionarios.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CPF", "Nome", "Cargo ", "Sal\u00E1rio", "Rua", "N\u00BA", "Bairro", "Contato"
			}
		));
		tableFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(139);
		tableFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(186);
		tableFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(109);
		tableFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(191);
		tableFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(26);
		tableFuncionarios.getColumnModel().getColumn(6).setPreferredWidth(132);
		tableFuncionarios.getColumnModel().getColumn(7).setPreferredWidth(130);
		
		JLabel lblNewLabel = new JLabel("Lista de Funcion\u00E1rios");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(10, 25, 1346, 32);
		contentPane.add(lblNewLabel);
	}
	
	public void listar() {
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		List<Funcionario> lista = dao.listarFuncionarios();
		
		DefaultTableModel dados = (DefaultTableModel)tableFuncionarios.getModel();
		
		dados.setNumRows(0);
		
		for(Funcionario f : lista) {
			dados.addRow(new Object[] { f.getCpf(), f.getNome(), f.getCargo(),
				f.getSalario(), f.getRua(), f.getNumero(), f.getBairro(), f.getCelular()});
		}
	}
}

