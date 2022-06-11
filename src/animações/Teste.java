package animações;

public class Teste {

	public static void main(String[] args) {
		
		
			
				Impressora impressora = new Impressora();

				Correr t1 = new Correr(impressora);
				Thread thread = new Thread(t1);
				thread.start();
				
				Atacar t2 = new Atacar(impressora);
				t2.start();
				
				Defender t3 = new Defender(impressora);
				t3.start();
				
				
				
				
	}
}
		
		
	


