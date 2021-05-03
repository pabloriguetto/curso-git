package entities;

public class Conta {
	
	private int numeroConta;
	private String donoConta;
	private double saldoConta;
	
	public Conta(int numeroConta, String donoConta) {
		this.numeroConta = numeroConta;
		this.donoConta = donoConta;
	}

	public Conta(int numeroConta, String donoConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.donoConta = donoConta;
		deposito(depositoInicial);
	}

	public String getDonoConta() {
		return donoConta;
	}

	public void trocaNomeDonoConta(String novoNome) {
		this.donoConta = novoNome;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void deposito(double deposito) {
		this.saldoConta += deposito;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void saque (double saque) {
		this.saldoConta -= saque + 5;
	}
	
	public String toString() {
		return " Conta: "
				+ numeroConta
				+ "\n Dono: "
				+ donoConta
				+ "\n Saldo da conta: R$"
				+ String.format("%.2f", saldoConta);
	}
	
}
