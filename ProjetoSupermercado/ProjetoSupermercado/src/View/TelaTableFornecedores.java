package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import DAO.FornecedorDAO;
import Modelo.Fornecedor;
import java.awt.Toolkit;

public class TelaTableFornecedores extends JFrame {

	private JPanel contentPane;
	private JTable tableFornecedores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTableFornecedores frame = new TelaTableFornecedores();
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
	public TelaTableFornecedores() throws ParseException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaTableFornecedores.class.getResource("/Imagem/fornecedorr.png")));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
				listar();
				
			}
		});
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setResizable(true);
		setTitle("  Dados do Fornecedores");
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1254, 592);
		panel.add(scrollPane);
		
		JTable tableFornecedores = new JTable();
		tableFornecedores.setBorder(null);
		tableFornecedores.setEnabled(false);
		scrollPane.setViewportView(tableFornecedores);
		tableFornecedores.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CNPJ", "Razão Social", "Rua", "N\u00BA", "Bairro", "Contato"
			}
		));
		
		JLabel lblNewLabel = new JLabel("Lista de Fornecedores");
		lblNewLabel.setForeground(new Color(255, 153, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(0, 25, 1346, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_FUNDO = new JLabel("");
		lblNewLabel_FUNDO.setIcon(new ImageIcon(TelaTableFornecedores.class.getResource("/Imagem/fundo2.png")));
		lblNewLabel_FUNDO.setBounds(0, 0, 1366, 713);
		contentPane.add(lblNewLabel_FUNDO);
	}
	
	public void listar() {
		
		FornecedorDAO dao = new FornecedorDAO();
		
		List<Fornecedor> lista = dao.listarFornecedores();
		
		DefaultTableModel dados = (DefaultTableModel)tableFornecedores.getModel();
		
		dados.setNumRows(0);
		
		for(Fornecedor f : lista) {
			dados.addRow(new Object[] { f.getCnpj(), f.getRazao_social(),
					f.getRua(), f.getNumero(), f.getBairro(), f.getTelefone()});
		}
	}
}