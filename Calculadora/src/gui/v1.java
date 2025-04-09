package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import calculadora.calculadora;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.classfile.constantpool.IntegerEntry;
import java.awt.event.ActionEvent;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JButton btnSumar3enteros;
	private JButton btnSumar2reales;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Numero1");
			lblNewLabel.setBounds(10, 11, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Numero2");
			lblNewLabel_1.setBounds(10, 36, 46, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Numero3");
			lblNewLabel_2.setBounds(10, 61, 46, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtNum1 = new JTextField();
			txtNum1.setBounds(85, 8, 86, 20);
			contentPane.add(txtNum1);
			txtNum1.setColumns(10);
		}
		{
			txtNum2 = new JTextField();
			txtNum2.setBounds(85, 33, 86, 20);
			contentPane.add(txtNum2);
			txtNum2.setColumns(10);
		}
		{
			txtNum3 = new JTextField();
			txtNum3.setBounds(85, 58, 86, 20);
			contentPane.add(txtNum3);
			txtNum3.setColumns(10);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 91, 394, 159);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Sumar 2 enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(287, 7, 117, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnSumar3enteros = new JButton("Sumar 3 enteros");
			btnSumar3enteros.addActionListener(this);
			btnSumar3enteros.setBounds(287, 32, 117, 23);
			contentPane.add(btnSumar3enteros);
		}
		{
			btnSumar2reales = new JButton("Sumar 2 reales");
			btnSumar2reales.addActionListener(this);
			btnSumar2reales.setBounds(287, 57, 117, 23);
			contentPane.add(btnSumar2reales);
		}
		{
			btnNewButton_1 = new JButton("New button");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(181, 7, 89, 23);
			contentPane.add(btnNewButton_1);
		}
	}
	

	
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
	try {
		int n1 = Integer.parseInt(txtNum1.getText());
		int n2 =Integer.parseInt(txtNum2.getText());
		calculadora c = new calculadora(n1,n2);
		txtS.append("La suma es : "+c.Sumar(n1, n2));
	}catch(Exception e2)
	{
		JOptionPane.showMessageDialog(this, "Ingrese numero(s) validos(s)");
	}
	
	}
	private void MostrarError()
	{
		JOptionPane.showMessageDialog(this, "Ingrese numero (s) validos(s)");
	}
	


	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnSumar2reales) {
			do_btnSumar2reales_actionPerformed(e);
		}
		if (e.getSource() == btnSumar3enteros) {
			do_btnSumar3enteros_actionPerformed(e);
		}
	}
	protected void do_btnSumar3enteros_actionPerformed(ActionEvent e) {
		try {
		int n1 = Integer.parseInt(txtNum1.getText());
		int n2 =Integer.parseInt(txtNum2.getText());
		int n3 =Integer.parseInt(txtNum3.getText());
		calculadora c1 = new calculadora(n1,n2, n3);
		txtS.append("La suma es : " +c1.Sumar(n1,n2,n3));
		}catch(Exception e2)
		{
			JOptionPane.showMessageDialog(this, "Ingrese numero(s) validos(s)");
		}
		
		}
		
	private void MostrarError1()
	{
		JOptionPane.showMessageDialog(this, "Ingrese numero (s) validos(s)");
	}
	protected void do_btnSumar2reales_actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(txtNum1.getText());
		double num2 = Double.parseDouble(txtNum2.getText());
		calculadora c2 = new calculadora(num1,num2);
		txtS.append("La suma es : " +c2.Sumar(num1, num2));
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		
	}
}

