package graficos.ProyectoUtil;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.text.DecimalFormat;

public class Panel extends JPanel implements ActionListener {

	JButton convertir;
	JTextField casilla1;
	JComboBox<String> cajaMonedas;
	JButton convertir2;
	JTextField casilla2;
	JComboBox<String> cajaMonedas2;
	DecimalFormat redondeoDecimal = new DecimalFormat("#.####");

	public Panel() {
		setLayout(null);

		// DE ARS A OTROS
			
			// Texto
		Font fuente = new Font("Arial", Font.BOLD, 13);
		Color colorFuente = Color.WHITE;

		JLabel ubicacionARS = new JLabel("Quiero convertir");
		JLabel enMonedaExtranjera = new JLabel("En");
		JLabel pesosArgentinos = new JLabel("ARS.");
		ubicacionARS.setForeground(colorFuente);
		ubicacionARS.setFont(fuente);
		ubicacionARS.setBounds(10, 15, 103, 13);
		add(ubicacionARS);
		enMonedaExtranjera.setForeground(colorFuente);
		enMonedaExtranjera.setFont(fuente);
		enMonedaExtranjera.setBounds(30, 50, 20, 20);
		add(enMonedaExtranjera);
		pesosArgentinos.setForeground(colorFuente);
		pesosArgentinos.setFont(fuente);
		pesosArgentinos.setBounds(327, 15, 130, 13);
		add(pesosArgentinos);

			// Botón
		convertir = new JButton("Convertir");
		convertir.setBounds(450, 25, 100, 30);
		convertir.addActionListener(this);
		add(convertir);

			// Casilla para ingresar el monto
		casilla1 = new JTextField();
		casilla1.setBounds(135, 10, 170, 20);
		add(casilla1);

			// Caja de selección de monedas
		cajaMonedas = new JComboBox<>();
		cajaMonedas.setBounds(135, 50, 170, 20);
		Monedas arraysMonedas = new Monedas();
		HashMap<String, Double> listaDeMonedas = arraysMonedas.getMonedas();
		for (String moneda : listaDeMonedas.keySet()) { 
			cajaMonedas.addItem(moneda);
			}						// Crea un String llamado "moneda" que almacena cómo valor de sí
									// mismo los elementos de listaDeMonedas; luego al JComboBox
									// elegirMonedas le añade cada String moneda creado. El keySet()
									// es necesario para que se ordene y elija cada una de las
									// claves para poder también asociarla con el valor
		add(cajaMonedas);

		
		// DE OTROS A ARS

			// Texto
			/* Utiliza los mismo parámetros de texto */
		JLabel ubicacionEXTR = new JLabel("Quiero convertir");
		JLabel aPesosArgentinos = new JLabel("en ARS.");
		ubicacionEXTR.setForeground(colorFuente);
		ubicacionEXTR.setFont(fuente);
		ubicacionEXTR.setBounds(10, 215, 103, 13);
		add(ubicacionEXTR);
		aPesosArgentinos.setForeground(colorFuente);
		aPesosArgentinos.setFont(fuente);
		aPesosArgentinos.setBounds(327, 215, 130, 13);
		add(aPesosArgentinos);

			//Botón
		convertir2 = new JButton("Convertir");
		convertir2.setBounds(450, 225, 100, 30);
		convertir2.addActionListener(this);
		add(convertir2);

			//Casilla para ingresar el monto

		casilla2 = new JTextField();
		casilla2.setBounds(135, 210, 170, 20);
		add(casilla2);

			//Caja de selección de monedas
		cajaMonedas2 = new JComboBox<>();
		cajaMonedas2.setBounds(135, 250, 170, 20);
		for (String moneda : listaDeMonedas.keySet()) {
			cajaMonedas2.addItem(moneda);
		}
		add(cajaMonedas2);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image fondo = null;
		try {
			fondo = ImageIO.read(new File("src/graficos/fondo2.jpg"));
		} catch (IOException e) {
			System.out.println("No se encontró la imagen.");
		}
		g.drawImage(fondo, 0, 0, null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == convertir) {
			calcular1();
		}
		if (e.getSource() == convertir2) {
			calcular2();
		}
	}

	private void calcular1() {
		String valorTexto = casilla1.getText();
		double valor = Double.parseDouble(valorTexto);

		String monedaSeleccionada = (String) cajaMonedas.getSelectedItem();
		Monedas arraysMonedas = new Monedas();
		HashMap<String, Double> monedas = arraysMonedas.getMonedas();
		double valorMoneda = monedas.get(monedaSeleccionada);
		double resultado = valor * valorMoneda;
		String resultadoRedondeado = redondeoDecimal.format(resultado);
		JOptionPane.showMessageDialog(this, "El resultado es: " + resultadoRedondeado + " " + monedaSeleccionada);
	}

	private void calcular2() {
		String valorTexto = casilla2.getText();
		double valor = Double.parseDouble(valorTexto);

		String monedaSeleccionada = (String) cajaMonedas2.getSelectedItem();
		Monedas arraysMonedas = new Monedas();
		HashMap<String, Double> monedas = arraysMonedas.getMonedas();
		double valorMoneda = monedas.get(monedaSeleccionada);
		double resultado = valor / valorMoneda;
		String resultadoRedondeado = redondeoDecimal.format(resultado);
		JOptionPane.showMessageDialog(this, "El resultado es: " + resultadoRedondeado + "ARS(Pesos Argentinos)");
	}
}