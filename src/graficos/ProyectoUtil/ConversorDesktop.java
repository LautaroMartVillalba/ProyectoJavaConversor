package graficos.ProyectoUtil;

import javax.swing.*;

public class ConversorDesktop {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Marco conversorMoneda = new Marco();
				conversorMoneda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				conversorMoneda.setTitle("Proyecto de Conversor");
				conversorMoneda.setVisible(true);
			}
		});
	}
}
