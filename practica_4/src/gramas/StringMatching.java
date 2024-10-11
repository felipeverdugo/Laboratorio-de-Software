package gramas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringMatching {
	private final char iniChar = '#';
	private final char finChar = '$';
	private Map<String, List<String>> dicGramas = new HashMap<String, List<String>>();

	public Map<String, List<String>> getDicGramas() {
		return dicGramas;
	}

	private String formatString(String s) {
		return (iniChar + s + finChar);
	}

	public void agregarPalabra(int q, String s1) {

		String s1Format = this.formatString(s1);
		int i = 0;
		String sQ;

		while (s1Format.indexOf(finChar) != i) {
			sQ = s1Format.substring(i, i + q);

			// Comprobar si la clave existe
			if (dicGramas.containsKey(sQ)) {
				// Si la clave ya existe, añadir a la lista existente
				dicGramas.get(sQ).add(s1);
			} else {
				// Si la clave no existe, crear una nueva lista
				dicGramas.put(sQ, new ArrayList<>(Arrays.asList(s1)));
			}

			i++;
		}

	}

	public Map<String, Integer> DistanciaDeLevenshtein(Map<String, List<String>> dicGramas, String s) {
		String sFormat = this.formatString(s);
		List<String> gramas = new ArrayList<>();
		int i = 0;
		while (sFormat.indexOf(finChar) != i) {
			gramas.add(sFormat.substring(i, i + 2));
			i++;
		}

		Map<String, Integer> palabraSimilares = new HashMap<>();
		for (Map.Entry<String, List<String>> entry : dicGramas.entrySet()) {
			String key = entry.getKey();
			List<String> palabras = entry.getValue();
			if (gramas.contains(key)) {
				for (String palabra : palabras) {
					palabraSimilares.put(palabra, palabraSimilares.getOrDefault(palabra, 0) + 1);
				}

			}

		}
		return palabraSimilares;

	}

	public static void main(String[] args) {
		StringMatching stringMatching = new StringMatching();
		stringMatching.agregarPalabra(2, "glucosa");
		stringMatching.agregarPalabra(2, "elefante");
		stringMatching.agregarPalabra(2, "computadora");
		stringMatching.agregarPalabra(2, "automovil");
		stringMatching.agregarPalabra(2, "montaña");
		stringMatching.agregarPalabra(2, "ciudad");
		stringMatching.agregarPalabra(2, "perro");
		stringMatching.agregarPalabra(2, "gato");
		stringMatching.agregarPalabra(2, "pelota");
		stringMatching.agregarPalabra(2, "bicicleta");
		stringMatching.agregarPalabra(2, "avion");
		stringMatching.agregarPalabra(2, "reloj");
		stringMatching.agregarPalabra(2, "teclado");

		for (Map.Entry<String, List<String>> entry : stringMatching.getDicGramas().entrySet()) {
			String key = entry.getKey();
			List<String> val = entry.getValue();
			System.out.println(key);
			System.out.println(val);
		}

		System.out.println(stringMatching.DistanciaDeLevenshtein(stringMatching.getDicGramas(), "felipe"));
	}

}
