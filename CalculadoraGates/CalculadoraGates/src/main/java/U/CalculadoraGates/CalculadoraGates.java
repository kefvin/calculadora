package U.CalculadoraGates;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraGates {
	
	float num1;
	JLabel pantalla = null;
	boolean borra = false;
	
	private char simbol;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraGates window = new CalculadoraGates();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	/**
	 * Create the application.
	 */
	public CalculadoraGates() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		pantalla = new JLabel("0");
		pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		pantalla.setBackground(Color.BLACK);
		pantalla.setForeground(Color.WHITE);
		pantalla.setOpaque(true);
		pantalla.setBounds(12, 0, 322, 58);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		pantalla.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		frame.getContentPane().add(pantalla);
		
		JButton siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '7';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		siete.setBounds(12, 62, 99, 42);
		frame.getContentPane().add(siete);
		
		JButton ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '8';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		ocho.setBounds(123, 62, 99, 42);
		frame.getContentPane().add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '9';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		nueve.setBounds(234, 62, 99, 42);
		frame.getContentPane().add(nueve);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '6';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		seis.setBounds(234, 116, 99, 42);
		frame.getContentPane().add(seis);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '5';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		cinco.setBounds(123, 116, 99, 42);
		frame.getContentPane().add(cinco);
		
		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '4';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		cuatro.setBounds(12, 116, 99, 42);
		frame.getContentPane().add(cuatro);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '3';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		tres.setBounds(234, 170, 99, 42);
		frame.getContentPane().add(tres);
		
		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '2';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		dos.setBounds(123, 170, 99, 42);
		frame.getContentPane().add(dos);
		
		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '1';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		uno.setBounds(12, 170, 99, 42);
		frame.getContentPane().add(uno);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '0';
				cBorrar();
				ponerNumeros(numero);
			}
		});
		zero.setBounds(12, 221, 155, 42);
		frame.getContentPane().add(zero);
		
		JButton punto = new JButton(".");
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char numero = '.';
				ponerNumeros(numero);
			}
		});
		punto.setBounds(172, 221, 161, 42);
		frame.getContentPane().add(punto);
		
		
		
		
		
		
		
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacio();
				num1=0;
				borra = true;
			}
		});
		button_11.setBounds(337, 210, 99, 53);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String muestra = pantalla.getText();;
				simbol = '-';
				if(num1 == 0){
					
					num1 = Float.parseFloat(muestra);
				}else{
					float num = Float.parseFloat(muestra);
					num1 += num;
				}
				muestra="";
				pantalla.setText("");;
				
			}
		});
		button_12.setBounds(337, 62, 99, 50);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("+");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String muestra = pantalla.getText();;
				simbol = '+';
				if(num1 == 0){
					
					num1 = Float.parseFloat(muestra);
				}else{
					float num = Float.parseFloat(muestra);
					num1 += num;
				}
				muestra="";
				pantalla.setText("");
				
			}
		});
		button_13.setBounds(337, 116, 99, 90);
		frame.getContentPane().add(button_13);
	}
	
	
	
	
	
	
	
	
	public void ponerNumeros(char numero){
		String muestra;
		if(pantalla.getText()=="0"){muestra = Character.toString(numero);
		}else{muestra = pantalla.getText() + numero;
		}
		pantalla.setText(muestra);
		
	}
	
	public void cBorrar(){
		if(borra==true){pantalla.setText("");borra=false;}
	}
	
	public void operacio(){
		String resultat;
		String num2 = pantalla.getText();
		
			switch(simbol){
			case '+':
				num1 = num1 + Float.parseFloat(num2);
				resultat = Float.toString(num1);
				resultat = comprova(num1);
				pantalla.setText(resultat);
				num1 = 0;
				break;
			case '-':
				num1-= Float.parseFloat(num2);
				resultat = Float.toString(num1);
				resultat = comprova(num1);
				pantalla.setText(resultat);
				num1 = 0;
				break;
			}
            
	}



	private String comprova(float rebut) {
		String resultat = Float.toString(rebut);
		if(rebut >= 666.0 && rebut <= 666.9){
			return resultat = "ERROR";
		}
		return resultat;	
	}
}
