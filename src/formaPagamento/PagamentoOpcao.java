/*
Escreva um programa que leia o preço de um produto e a forma de pagamento escolhida pelo cliente: 

→ 1 - em espécie
→ 2 - cartão de crédito
→ 3 - cartão de débito 

Mostre o valor final da compra. 

Considere que o produto tem 10% de desconto se for pago em espécie ou no cartão de débito e não tem desconto se for pago no cartão de crédito.
 */

package formaPagamento;

import java.util.Scanner;

public class PagamentoOpcao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Caixa automatico \nDigite o valor: ");
		double valor = scan.nextDouble();
		
		System.out.println("Escolha forma de pagamento \r\n "
				+ "→ 1 - em espécie\r\n"
				+ "→ 2 - cartão de crédito\r\n"
				+ "→ 3 - cartão de débito");
		int opcao = scan.nextInt();
		
		if (opcao == 1) {
			double desconto = (valor * 10) /100;
			valor = desconto - valor;
			System.out.printf("Opção escolhida há desconto, valor fica %.2f ", valor);
		} else if(opcao == 2){
			
		}else if (opcao == 3) {
			double desconto = (valor * 10) /100;
			valor = desconto - valor;
			System.out.printf("Opção escolhida há desconto, valor fica %.2f ", valor);
		}else {
			System.out.println("Opção invalida");
		}
		// SWITCH CASE, OUTRA FORMA DE SOLUÇÃO:
		
		/*
		switch (formaPag) {
		case 1: 
			desconto = (valorProduto * 10) / 100;
			valorProduto = valorProduto - desconto;
			System.out.println("Forma de Pagamento é Especie, há desconto de 10%, valor do produto: "+ valorProduto);
			break;
		
		case 2: {

			System.out.println("Forma de Pagamento é Crédito, valor do produto: " + valorProduto);
			break;
		}
		case 3: {
			desconto = (valorProduto * 10) / 100;
			valorProduto = valorProduto - desconto;
			System.out.println("Forma de Pagamento é Débito, há desconto de 10%, valor do produto: " + valorProduto);
			break;
		}
		default:
			System.out.println("Não e uma forma de pagamento.");
		}
		*/
	}
}
