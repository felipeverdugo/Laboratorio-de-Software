
package griego;

class Gamma {
	void unMétodoG() {
		Alpha a = new Alpha();
		a.x = 10;
		a.otroMetodoA();
	}

	public static void main(String[] args) {
		Gamma gamma = new Gamma();
		gamma.unMétodoG();
	}
}