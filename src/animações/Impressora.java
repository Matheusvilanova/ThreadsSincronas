package animações;
public class Impressora{

	public synchronized void printTableSync(String nome, int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("O processo "+nome+" foi iniciado");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(nome+ " foi encerrado");
	}
	}
