package vacuna;

import java.util.ArrayList;
import java.util.List;

public class TestVacuna {

	
	public static void main(String[] args) {
		List<Vacuna> vacunas = new ArrayList<Vacuna>(5);
		Vacuna vacuna1 = new Vacuna("Ast", "chi", "covid", 4);
		Vacuna vacuna2 = new Vacuna("Sin", "arg", "covid", 3);
		Vacuna vacuna3 = new Vacuna("Cov", "uru", "covid", 2);
		Vacuna vacuna4 = new Vacuna("Yac", "usa", "gripe", 3);
		Vacuna vacuna5 = new Vacuna("Kek", "esp", "covid", 1);
		
		Vacuna vacunaEQ = vacuna1;
		Vacuna vacunaNEQ = new Vacuna("Not", "chi", "covid", 4);
		
		vacunas.add(vacuna1);
		vacunas.add(vacuna2);
		vacunas.add(vacuna3);
		vacunas.add(vacuna4);
		vacunas.add(vacuna5);
		vacunas.add(vacunaEQ);
		vacunas.add(vacunaNEQ);
		
		for (Vacuna vacuna : vacunas) {
			System.out.println(vacuna.toString());
			
		}
		
	
		
		// Evalua si tienen el mismo estado
		System.out.println(vacuna1.getMarca().equals(vacunaEQ.getMarca()));
		System.out.println(vacuna1.equals(vacunaEQ));
		System.out.println(vacuna1.equals(vacunaNEQ));
		
		//Evalua si apuntan al mismo objeto
		System.out.println(vacuna1 == vacunaEQ);
		System.out.println(vacuna1 == vacunaNEQ);



	}
}
