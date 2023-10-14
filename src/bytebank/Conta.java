package bytebank;

public class Conta {
	//add atributos
	private Cliente titular;
	private int agencia;
	private double saldo;
	
	//construtor
	public Conta (Cliente titular, int agencia, double saldo) {
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	//getters
 	public Cliente getTitular() {
		return this.titular;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	//setters
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//metudo para depositar
	public boolean depositar (double valor) {
		if (valor > 0) {
		this.saldo += valor;
		return true;
		} else {
			return false;
		}
	}
	
	//metudo para sacar
	public boolean sacar (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	//metudo para tranferir
	public boolean tranferir (double valor, Conta destino) {
		if(sacar(valor)){
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	//metudo para saida
	public void resultShow () {
		System.out.printf("Titular da Conta : %s, com a agencia de numero %d%n Saldo : %.2f%n",
				this.titular.getNome(), this.agencia, this.saldo);
		System.out.printf("Dados do Cliente : CPF %s%nProfissão : %s%n",
				this.titular.getCpf(), this.titular.getProfissao());
	}
	
	public void sucesso() {
		System.out.println("Executado com sucesso");
	}
	
	public void falhou () {
		System.out.println("Sua ação falhou !");
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo Atual : " + this.saldo);
	}
	
}
