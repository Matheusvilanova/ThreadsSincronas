package animações;

public class Defender extends Thread{
	Impressora t;

	Defender(Impressora t) {
		this.t = t;
	}

	public void run() {
		t.printTableSync("Defender",400);
	}
}
