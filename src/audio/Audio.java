package audio;

public class Audio implements Runnable{

	private String nome;
	private int tempo;

	public Audio(String nome, int tempo) {

		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();

	}

	public void run() {

		for(int i=0; i<6;i++) {

			System.out.println("O processo "+ nome +" está sendo executado");
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		System.out.println(nome + " foi encerrado");
	}

}
