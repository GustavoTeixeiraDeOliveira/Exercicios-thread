package Controller;

public class treadVetor extends Thread {
	
	private int num;
	private int vetor[];
	
	@Override
	public void run() {
		String Tempo = percorrerVetor(num, vetor);
		System.out.println(Tempo);
	}
	public treadVetor(int num, int vetor[]) {
		this.num = num;
		this.vetor = vetor;
	}
	
	public String percorrerVetor(int num, int vetor[]) {
		if(num%2 == 0) {
    	   double tempoInicial = System.nanoTime();
    	   for (int i = 0; i <vetor.length; i++) {
    		
    	   }
    	   double tempoFinal = System.nanoTime();
    	   double tempoTotal = tempoFinal - tempoInicial;
    	   tempoTotal = tempoTotal / Math.pow(10, 9);
    	   String Tempo = "String => "+tempoTotal;
    	   return Tempo;
    	}else {
    		double tempoInicial = System.nanoTime();
    		for(int x: vetor) {
    			
    		}
    	    double tempoFinal = System.nanoTime();
     	    double tempoTotal = tempoFinal - tempoInicial;
     	    tempoTotal = tempoTotal / Math.pow(10, 9);
     	    String Tempo = "String => "+tempoTotal;
     	    return Tempo;
     	    }
	}

}
