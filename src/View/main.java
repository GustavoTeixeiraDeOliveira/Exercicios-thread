package View;
import java.util.Random;

import Controller.treadVetor;
public class main {

	public static void main(String[] args) {
		int vetor[] = new int[1000];
		for(int i = 0; i < 1000;i++){
			Random num =  new Random();
			vetor[i] = num.nextInt(100);
		}

		treadVetor t = new treadVetor(1, vetor);
		t.start();
		treadVetor s = new treadVetor(2, vetor);
		s.start();
		
		
	}

}
