/* Data: 14/02/2023
 * Nome: Ronan Jorge
Exercicio 1: 	Criar uma fun��o recursiva que receba 2 valores A e B e, por somas, 
				apresente o resultado da multiplica��o de A por B.
Exerc�cio 2: 	Criar uma fun��o recursiva que receba o dividendo e o divisor de uma 
				opera��o de divis�o e, por subtra��es, exiba o resto da divis�o.
Exerc�cio 3:	Construir uma fun��o recursiva que receba um vetor e seu tamanho e 
				apresente a quantidade de n�meros pares existentes no vetor. Considere
				que a entrada deve ser, apenas de n�meros naturais diferentes de zero
*/


package view;

import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) {
		OperacaoController op = new OperacaoController();
		int a = 11;
		int b = 4;
		int[] vetor = {22,2,1000,1,1,1,1,1,1,100};
		int tamanho = 10;
		
		int multipl = op.mult(a, b);
		System.out.println("a * b = "+multipl);

		int resto = op.div(a, b);
		System.out.println("O resto da divisão de a por b é "+ resto);
		
		int pares = op.qtdepares(vetor, tamanho);
		System.out.println("Qtde de pares = "+pares);
	}

}
