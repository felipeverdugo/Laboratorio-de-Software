package veterinaria;

public class Veterinaria<E> {
	private E animal;

	public void setAnimal(E x) {
		animal = x;
	}

	public E getAnimal() {
		return animal;
	}

	public static void main(String[] args) {

//		Veterinaria<Animal> vet = new Veterinaria<Gato>(); // No se permine

//		Veterinaria<Gato> vet = new Veterinaria<Animal>();
//		Veterinaria<?> vet = new Veterinaria<Gato>();
//		vet.setAnimal(new Gato());
//		Veterinaria vet = new Veterinaria();
//		vet.setAnimal(new Perro());
//		Veterinaria vet = new Veterinaria<?>();
//		Veterinaria<? extends Animal> vet = new Veterinaria<Gato>();
	}
}
