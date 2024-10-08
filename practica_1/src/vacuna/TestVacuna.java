package vacuna;

public class TestVacuna {

	public static void main(String[] args) {
//		List<Vacuna> vacunas = new ArrayList<Vacuna>(5);
//		Vacuna vacuna1 = new Vacuna("Ast", "chi", "covid", 4);
//		Vacuna vacuna2 = new Vacuna("Sin", "arg", "covid", 3);
//		Vacuna vacuna3 = new Vacuna("Cov", "uru", "covid", 2);
//		Vacuna vacuna4 = new Vacuna("Yac", "usa", "gripe", 3);
//		Vacuna vacuna5 = new Vacuna("Kek", "esp", "covid", 1);
//		
//		Vacuna vacunaEQ = vacuna1;
//		Vacuna vacunaNEQ = new Vacuna("Not", "chi", "covid", 4);
//		
//		vacunas.add(vacuna1);
//		vacunas.add(vacuna2);
//		vacunas.add(vacuna3);
//		vacunas.add(vacuna4);
//		vacunas.add(vacuna5);
//		vacunas.add(vacunaEQ);
//		vacunas.add(vacunaNEQ);
//		
//		for (Vacuna vacuna : vacunas) {
//			System.out.println(vacuna.toString());
//			
//		}
//		
//	
//		
//		// Evalua si tienen el mismo estado
//		System.out.println(vacuna1.getMarca().equals(vacunaEQ.getMarca()));
//		System.out.println(vacuna1.equals(vacunaEQ));
//		System.out.println(vacuna1.equals(vacunaNEQ));
//		
//		//Evalua si apuntan al mismo objeto
//		System.out.println(vacuna1 == vacunaEQ);
//		System.out.println(vacuna1 == vacunaNEQ);

		// Crear instancias de cada clase
		VacunaPatogenoIntegro vacuna1 = new VacunaPatogenoIntegro("VacunaA", "Grecia", "COVID-19",
				"Virus COVID-19",2 );
		VacunaSubunidadAntigenica vacuna2 = new VacunaSubunidadAntigenica("VacunaB", "España", "Gripe", 1, 3,
				"Proceso de purificación");
		VacunaGenetica vacuna3 = new VacunaGenetica("VacunaC", "Italia", "Hepatitis B", 3, -20.0, -15.0);

		System.out.println("Información de Vacuna Patógeno Íntegro:");
		System.out.println("Marca: " + vacuna1.getMarca());
		System.out.println("País de Origen: " + vacuna1.getPaisOrigen());
		System.out.println("Enfermedad que Previene: " + vacuna1.getEnfermedad());
		System.out.println("Cantidad de Dosis: " + vacuna1.getCantDosis());
		System.out.println("Nombre del Virus Patógeno: " + vacuna1.getNombreVirus());
		System.out.println();

		System.out.println("Información de Vacuna Subunidad Antigénica:");
		System.out.println("Marca: " + vacuna2.getMarca());
		System.out.println("País de Origen: " + vacuna2.getPaisOrigen());
		System.out.println("Enfermedad que Previene: " + vacuna2.getEnfermedad());
		System.out.println("Cantidad de Dosis: " + vacuna2.getCantDosis());
		System.out.println("Cantidad de Antígenos: " + vacuna2.getCantAntigenos());
		System.out.println("Tipo de Proceso: " + vacuna2.getTipoDeProceso());
		System.out.println();

		System.out.println("Información de Vacuna Genética:");
		System.out.println("Marca: " + vacuna3.getMarca());
		System.out.println("País de Origen: " + vacuna3.getPaisOrigen());
		System.out.println("Enfermedad que Previene: " + vacuna3.getEnfermedad());
		System.out.println("Cantidad de Dosis: " + vacuna3.getCantDosis());
		System.out.println("Temperatura Mínima: " + vacuna3.getTempMinima() + "°C");
		System.out.println("Temperatura Máxima: " + vacuna3.getTempMaxima() + "°C");

	}
}
