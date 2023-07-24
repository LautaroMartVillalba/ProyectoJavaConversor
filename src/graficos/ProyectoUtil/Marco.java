package graficos.ProyectoUtil;

import java.awt.*;
import javax.swing.*;

public class Marco extends JFrame {

    public Marco() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanhoPantalla = miPantalla.getScreenSize();
        setResizable(false);
        int altura = tamanhoPantalla.height;
        int anchura = tamanhoPantalla.width;
        setSize(anchura / 2, altura / 2);
        setLocation(anchura / 4, altura / 4);
        ImageIcon icono = new ImageIcon("src/graficos/icono.png");
        setIconImage(icono.getImage());
        

        Panel miPanel = new Panel(); // Crear instancia del panel

        add(miPanel); // Agregar el panel al marco

        setTitle("Proyecto de Conversor");
        setVisible(true);
    }
}
