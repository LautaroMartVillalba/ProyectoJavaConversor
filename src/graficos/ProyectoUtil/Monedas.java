package graficos.ProyectoUtil;

import java.util.HashMap;

public class Monedas {
	private HashMap<String, Double> monedas;

	public Monedas() {
	        monedas = new HashMap<>();

	        // Agregar las monedas a la lista
	        monedas.put("USD (Dolar Estadounidense)", 0.0038);
	        monedas.put("Euro", 0.0034);
	        monedas.put("JPT (Yen Japonés)", 0.52);
	        monedas.put("GBP (Libra Esterlina)", 0.0029);
	        monedas.put("KRW (Won Surcoreano)", 4.79);
	        monedas.put("MXN (Peso Mexicano)", 0.063);
	        monedas.put("RUB (Rublo Ruso)", 0.34);
	        monedas.put("BRL (Real Brasileño)", 0.018);
	}
	public HashMap<String, Double> getMonedas() { 
        return monedas;
    }
	public double getValorMoneda(String moneda) { 
        return monedas.getOrDefault(moneda, 0.0);
    }
}