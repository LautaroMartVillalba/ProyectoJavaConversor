package graficos.ProyectoUtil;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class Panel extends JPanel{
	public Image imagen; /*Es importante no olvidar crear esta variable*/

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			imagen = ImageIO.read(new File("src/graficos/fondo1.jpg"));
		} catch (IOException e) {
			System.out.println("No se encontró la imagen.");
		}
		g.drawImage(imagen, 0, 0, null); /*Es el método sobrecargado que tiene cómo parámetro final ImageObserver*/
	}
}
