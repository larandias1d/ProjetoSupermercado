package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class TelaCaixa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private final JLabel lblNewLabelFundo = new JLabel("");
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCaixa frame = new TelaCaixa();
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
	public TelaCaixa() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCaixa.class.getResource("/Imagem/oie_281358o6YJ1ROg.png")));
		setTitle("Caixa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1392, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabelIDP = new JLabel("C\u00F3digo do produto");
		lblNewLabelIDP.setForeground(new Color(255, 153, 0));
		lblNewLabelIDP.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelIDP.setBounds(41, 25, 176, 25);
		contentPane.add(lblNewLabelIDP);
		
		textField = new JTextField();
		textField.setBounds(41, 52, 366, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(31, 100, 1296, 483);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1254, 461);
		panel.add(scrollPane);
		
		JTable tableCaixa = new JTable();
		tableCaixa.setBorder(null);
		tableCaixa.setEnabled(false);
		scrollPane.setViewportView(tableCaixa);
		tableCaixa.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID produdo", "Descricao ", "Quant", "Valor", "Subtotal"
			}
		));
		
		lblNewLabel_1 = new JLabel("Data:");
		lblNewLabel_1.setForeground(new Color(255, 153, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(1192, 11, 106, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setBounds(1192, 29, 106, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("TOTAL:");
		lblNewLabel_2.setForeground(new Color(255, 153, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(1057, 588, 97, 45);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(1153, 588, 145, 41);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("PAGAMENTO");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(255, 153, 0));
		btnNewButton.setBounds(1153, 640, 145, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabelQtde = new JLabel("Qtde:");
		lblNewLabelQtde.setForeground(new Color(255, 153, 0));
		lblNewLabelQtde.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabelQtde.setBounds(519, 32, 46, 14);
		contentPane.add(lblNewLabelQtde);
		
		textField_3 = new JTextField();
		textField_3.setBounds(519, 52, 125, 37);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		lblNewLabelFundo.setIcon(new ImageIcon(TelaCaixa.class.getResource("/Imagem/fundo2.png")));
		lblNewLabelFundo.setBounds(0, 0, 1370, 705);
		contentPane.add(lblNewLabelFundo);
	}
}
