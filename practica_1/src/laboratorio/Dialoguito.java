package laboratorio;

import java.awt.Dialog;
import java.awt.Frame;

public class Dialoguito extends Dialog {

	// Constructor que requiere un Frame y un título
	public Dialoguito(Frame parent, String title) {
		super(parent, title);
		System.out.println("Dialoguito");
	}

	public static void main(String[] args) {
		Frame frame = new Frame();
		Dialoguito dialoguito = new Dialoguito(frame, "Hola");
	}

}
