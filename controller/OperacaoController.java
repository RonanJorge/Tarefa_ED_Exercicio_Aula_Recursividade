package controller;

public class OperacaoController {
	public OperacaoController() {
		super();
	}
	
	public int mult(int a, int b) {
		if(b == 0) {
			return 0;
		}
		else {
			b = b - 1;
			return a + mult(a, b);
		}
	}
	
	
	public int div(int a, int b) {
		if(a < b) {
			return a;
		}
		else {
			a = a - b;
			return 0 + div(a, b);
		}
	}
	
	public int qtdepares(int[] vetor, int tamanho) {
		if(tamanho == 0){
			return 0;
		}
		else {
			int valor = vetor[tamanho - 1];
			tamanho = tamanho - 1;
			if(valor%2 == 0) return 1 + qtdepares(vetor, tamanho);
			else return qtdepares(vetor, tamanho);
		}
	}
}
