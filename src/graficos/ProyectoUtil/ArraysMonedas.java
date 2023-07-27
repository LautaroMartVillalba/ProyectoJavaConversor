package graficos.ProyectoUtil;

import java.util.HashMap;

public class ArraysMonedas {
	private HashMap<String, Double> monedas;

	public ArraysMonedas() {
	        monedas = new HashMap<>();

	        monedas.put("ARS (Peso Argentino)", 1.0);
	        monedas.put("USD (Dolar Estadounidense)", 1.5);
	        monedas.put("Euro", 2.0);
	        monedas.put("JPT (Yen Japonés)", 2.5);
	        monedas.put("GBP (Libra Esterlina)", 3.0);
	        monedas.put("KRW (Won Surcoreano)", 3.5);
	        monedas.put("MXN (Peso Mexicano)", 4.0);
	        monedas.put("RUB (Rublo Ruso)", 4.5);
	        monedas.put("BRL (Real Brasileño)", 5.0);
	}
	public HashMap<String, Double> getMonedas() {
        return monedas;
    }
	public double getValorMoneda(String moneda) {
        return monedas.getOrDefault(moneda, 0.0);
    }
}
