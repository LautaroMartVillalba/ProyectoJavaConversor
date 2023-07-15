package graficos.ProyectoUtil;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Panel extends JPanel implements ActionListener {

	JButton convertir;
	JTextField casilla1;
	JComboBox<String> convertirDe;

	public Panel() {
		setLayout(null);
		
		// Botón de convertir
		convertir = new JButton("convertir");
		convertir.setBounds(280, 220, 100, 30);
		convertir.addActionListener(this);
		add(convertir);

		// Casilla para escribir
		casilla1 = new JTextField();
		casilla1.setBounds(200, 200, 100, 20);
		add(casilla1);
		
		// Casilla para elegir la moneda
		convertirDe = new JComboBox<>();
		convertirDe.setBounds(0, 0, 170, 20);
		ArraysMonedas arraysMonedas = new ArraysMonedas(); //Crea "arraysMonedas" a partir del constructor de la clase
		HashMap<String, Double> listaDeMonedas = arraysMonedas.getMonedas(); //Crea un HashMap con los datos obtenidos de arraysMonedas
		for (String moneda : listaDeMonedas.keySet()) { //Crea un String llamado moneda que almacena cómo valor de sí mismo los elementos de listaDeMonedas, luego al JComboBox elegirMonedas le añade cada String moneda creado. El keySet() es necesario para que se ordene y elija cada una de las claves para poder también asociarla con el valor
			convertirDe.addItem(moneda); //Añade todos los elementos que son almacenados en HashMap
		}
		add(convertirDe);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image fondo = null;
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
		String valorTexto = casilla1.getText(); //Absorve el String de la casilla de texto
		double valor = Double.parseDouble(valorTexto); //Pasa el String de la casilla de texto a Double

		String monedaSeleccionada = (String) convertirDe.getSelectedItem(); //Detecta el item seleccionado, utilzando String para que se especifique cual es la clave y así identificarla
		ArraysMonedas arraysMonedas = new ArraysMonedas();
		HashMap<String, Double> monedas = arraysMonedas.getMonedas(); //Hace que el HashMap obtenga el valor de las monedas de la lista de la linea anterior
		double valorMoneda = monedas.get(monedaSeleccionada); //Utiliza el método get de HashMap para recibir la clave del arraysMOnedas(utiliza el String obtenido de monedaSeleccionada, pudiendo así identificar la clave, y por ende el valor Double
		double resultado = valor * valorMoneda; //multiplica el valor del JTextField por el de la moneda seleccionada
		JOptionPane.showMessageDialog(this, "El resultado es: " + resultado);
	}
}
