package animações;

public class Atacar extends Thread{

	Impressora t;

	Atacar(Impressora t) {
		this.t = t;
	}

	public void run() {
		t.printTableSync("Atacar",900);
	}
}
