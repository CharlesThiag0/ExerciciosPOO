package sobreCarros;

public class Carro {
	private String modelo;
	private int ano;
	private double preco;

	public Carro(String modelo, int ano, double preco) {

		if (this.modelo != null) {
			this.modelo = modelo;
		} else {
			this.modelo = "Gol";
			System.out.println("O modelo não foi informado. Por isso usaremos " + this.modelo);
		}

		if (this.ano >= 1891) {
			this.ano = ano;
		} else {
			this.ano = 2023;
			System.out.println("Ano não localizado, determinamos como " + this.ano);
		}

		if (this.preco > 0) {
			this.preco = preco;
		} else {
			this.preco = 12000;
			System.out.println("Preço invalido, foi alterado para " + this.preco);
		}
	}

	public Carro(String modelo, double preco) {
		this(modelo, 2023, preco);
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getAno() {
		return this.ano;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
