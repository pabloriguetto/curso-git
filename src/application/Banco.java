package application;

import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		Scanner n = new Scanner (System.in);
		
		Conta conta;

		System.out.print("Entre com o numero da conta: ");
		int numeroConta = n.nextInt();
		System.out.println("");
		
		System.out.print("Entre com o nome do dono da conta: ");
		String nome = n.next();
		System.out.println("");
		
		System.out.print("Terá primeiro deposito? s/n");
		char resposta = n.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Qual valor do primeiro deposito? ");
			double primeiroDeposito = n.nextDouble();
			conta = new Conta (numeroConta, nome, primeiroDeposito);
		}else {
			conta = new Conta (numeroConta, nome);
		}
		
		System.out.println("");
		System.out.println(conta);
		System.out.println("");
		System.out.print("Digite o valor do deposito: ");
		double deposito = n.nextDouble();
		conta.deposito(deposito);
		System.out.println("");
		System.out.print("Digite o valor do saque: ");
		double saque = n.nextDouble();
		conta.saque(saque);
		System.out.println("");
		
		System.out.println(conta);
		
		
		
		
		
		
		n.close();
	}

}
