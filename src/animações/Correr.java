package animações;

public class Correr implements Runnable{

		Impressora t;

		Correr(Impressora t) {
			this.t = t;
		}

		public void run() {
			t.printTableSync("Correr",500);
		}

	
}
