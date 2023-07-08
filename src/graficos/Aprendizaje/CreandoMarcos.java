package graficos.Aprendizaje;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import javax.imageio.*;
import java.io.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		MiMarco conversor = new MiMarco();
		
		conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		conversor.setTitle("Conversor");
		
	}
}


class MiMarco extends JFrame{
	
	public MiMarco() {
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamanhoPantalla = mipantalla.getScreenSize();
		setResizable(false);
		int altura = tamanhoPantalla.height;
		int anchura = tamanhoPantalla.width;
		setSize(anchura / 2, altura / 2);
		setVisible(true);
		setLocation(anchura/4, altura / 4);
		Image icono = mipantalla.getImage("src/graficos/icono.jpg");
		setIconImage(icono);
		Panels miPanel = new Panels();
		add(miPanel);
	}
}



class Panels extends JPanel{ 
	
	public void paintComponent(Graphics g) { 
		super.paintComponent(g);
		try {
			imagen = ImageIO.read(new File("src/graficos/logochikito.png"))/*Esto busca la imagen*/;
		} catch (IOException e) {
			System.out.println("No está la imagen, pibe");
		} //hasta acá, sólo se crea e instancia una imagen
		g.drawImage(imagen, 0, 0, null); //acá se inserta la imagen
		g.copyArea(0, 0, 255, 255, 200, 10);
		
		Graphics2D g2 = (Graphics2D) g;
		File miImagen = new File("src/graficos/fondo1.jpg");//desde aca
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 200);
		g2.setPaint(Color.BLUE); 
		g2.fill(rectangulo); 
		g2.draw(rectangulo); 
		
		Font letra = new Font("Arial", Font.ITALIC, 30);
		g2.setColor(Color.ORANGE);
		g2.setFont(letra);
		g2.drawString("Hola, buenas:D", 50, 25);
	}
	private Image imagen; //Se coloca para que pueda ser usada en toda la clase
}





//A partir de acá se encuentran apuntes de aprendizaje no utilizados en el proyecto, o que carecen de utilidad por ahora

class MiMarcoBeta extends JFrame{
	
	/*public MiMarco() {
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamanhoPantalla = mipantalla.getScreenSize();//crea un nuevo objeto de dimensión, y al anterior objeto de Toolkit se encarga de capturar los 	datos del tamaño de la pantalla del dispositivo
		//setBounds(300, 100, 700, 600); //Es setSize y setLocation al mismo tiempo
		setResizable(false); //Impide que el marco se pueda redimensionar
		int altura = tamanhoPantalla.height; //logran darle "cuerpo" a los valores de altura y anchura capturados por getScreenSize()
		int anchura = tamanhoPantalla.width;
		setSize(anchura / 2, altura / 2);
		setVisible(true);
		setLocation(anchura/4, altura / 4);
		Image icono = mipantalla.getImage("src/graficos/icono.jpg");
		setIconImage(icono);
		Panel miPanel = new Panel();
		add(miPanel);
		miPanel.setBackground(Color.RED);
		miPanel.setForeground(Color.YELLOW);
	}*/
}

class PanelBeta extends JPanel{
	
	/*public void paintComponent(Graphics g) {
		super.paintComponent(g); Llama a que el método cumpla su funcionamiento natural
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 200);
		g2.setPaint(Color.BLUE); Lo que hace es "tomar" el color con lo que va a pintar lo siguiente
		g2.fill(rectangulo); fill dibuja el contorno del rectángulo según el color seleccionado
		g2.draw(rectangulo); draw rellena la figura con elcolor selecionado
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(52,18,115)); new Color(...) utiliza el sistema RGB para crear un nuevo color
		g2.fill(elipse);
		g2.draw(elipse);
		g2.draw(new Line2D.Double(10, 10, 50, 90)); Dibuja una linea
		
		Font letra = new Font("Arial", Font.ITALIC, 30); Crea un nuevo tpo de letra, con el tipo de fuente, el estilo, y su tamaño
		g2.setColor(Color.ORANGE);
		g2.setFont(letra);
		g2.drawString("Hola, buenas:D", 50, 25);*/
		
	}