package graficos.ProyectoUtil;

import java.awt.*;
import javax.swing.*;

public class Marco extends JFrame{

	public Marco() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanhoPantalla = miPantalla.getScreenSize();
		setResizable(false);
		int altura = tamanhoPantalla.height;
		int anchura = tamanhoPantalla.width;
		setSize(anchura / 2, altura / 2);
		setLocation(anchura / 4, altura / 4);
		Image icono = miPantalla.getImage("src/graficos/icono.jpg");
		setIconImage(icono);
		Panel miPanel = new Panel();
		add(miPanel);
		setVisible(true); /*Es importante que esté al final, pues el efecto de cascada haria que lo que esté debajo no sea cargado para poder posteriormente verse*/
	}
}
