package graficos.ProyectoUtil;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Panel extends JPanel implements ActionListener {
	public Image fondo;
	JButton convertir;
	JTextField casilla1;
	private JComboBox<String> cajaMonedas;
	private JComboBox<String> cajaMonedas2;

	public Panel() {
		setLayout(null);
		//Boton de convertir
		convertir = new JButton("convertir");
		convertir.setBounds(280, 220, 100, 30);
		convertir.addActionListener(this);
		add(convertir);

		//Casilla para escribir
		casilla1 = new JTextField();
		casilla1.setBounds(200, 200, 100, 20);
		add(casilla1);
		
		//Casilla para elegir la moneda
		String[] monedas = {"ARS (Peso Argentino)","USD (Dolar Estadounidense)","EUR (Euros)","JPY (Yen Japonés)","GBP(Libra Esterlina)","KRW (Won Surcoreano)","MXN (Peso Mexicano)","RUB (Rublo Ruso)"};
		cajaMonedas = new JComboBox<>(monedas);
		cajaMonedas.setBounds(0, 0, 165, 30);
		add(cajaMonedas);
		String[] monedas2 = {"ARS (Peso Argentino)","USD (Dolar Estadounidense)","EUR (Euros)","JPY (Yen Japonés)","GBP(Libra Esterlina)","KRW (Won Surcoreano)","MXN (Peso Mexicano)","RUB (Rublo Ruso)"};
		cajaMonedas2 = new JComboBox<>(monedas2);
		cajaMonedas2.setBounds(0, 40, 165, 30);
		add(cajaMonedas2);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			fondo = ImageIO.read(new File("src/graficos/fondo1.jpg"));
		} catch (IOException e) {
			System.out.println("No se encontró la imagen.");
		}
		g.drawImage(fondo, 0, 0, null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == convertir) {
			calcular();
		}
	}

	private void calcular() {
		String valorTexto = casilla1.getText(); //obtiene el valor de casilla1 en un String
        double valor = Double.parseDouble(valorTexto); //pasa el valor obtenido de casilla1 de String a Double
        
        double resultado = valor * 2;
        JOptionPane.showMessageDialog(this, "El resultado es: " + resultado);
	}
}
