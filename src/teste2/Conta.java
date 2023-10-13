package teste2;

public class Conta {
	private Cliente titular;
	private int agencia;
	private double valor;
	
	//getters
	public Cliente getTitular() {
		return this.titular;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	//setters
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
