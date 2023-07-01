package graficos;

import java.awt.*;
import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		MiMarco conversor = new MiMarco();
		
		conversor.setVisible(true);
		conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//EXIT_ON_CLOSE hace que el programa finalice al cerrarse
		conversor.setTitle("Conversor");
		
		
		}
}


class MiMarco extends JFrame{
	
	public MiMarco() {
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamanhoPantalla = mipantalla.getScreenSize();//crea un nuevo objeto de dimensión, y al anterior objeto de Toolkit se encarga de capturar los datos del tamaño de la pantalla del dispositivo
		//setBounds(300, 100, 700, 600); //Es setSize y setLocation al mismo tiempo
		setResizable(false); //Impide que el marco se pueda redimensionar
		int altura = tamanhoPantalla.height; //logran darle "cuerpo" a los valores de altura y anchura capturados por getScreenSize()
		int anchura = tamanhoPantalla.width;
		setSize(anchura / 2, altura / 2);
		setVisible(true);
		setLocation(anchura/4, altura / 4);
		Image icono = mipantalla.getImage("C:\\Users\\lauta\\Documents\\ProyectoConversor\\Conversor.java\\Imagenes\\icono.jpg");
		setIconImage(icono);
		Panel miPanel = new Panel();
		add(miPanel);
		
	}
}

class Panel extends JPanel{ //Crea una nueva clase panel, que tiene recrea el método paintComponent
	
	public void paintComponent(Graphics g) { //reescribe el método
		super.paintComponent(g); //Llama a que el método cumpla su funcionamiento natural
		g.drawString("Hola, Mundo!:D", 50, 100); //Crea un String con coordenadas 50 100
	}
	
}