package controller;

public class Exercicio {

	public Exercicio() {
		
	}

	// Exerc�cio 1
	public double Mult(double a, double b) {
		if (b == 0) {
			return 0;
		} else {
			return a + Mult(a, b-1);
		}
	}
		
}
