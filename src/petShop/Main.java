package petShop;

public class Main {
	public static void main(String[] args) {
		Especie especie = new Especie("Cachorro", 2, "vira-lata", 35);
		Animais animais = new Animais(especie, "18/08/2018");
		Racao racao = new Racao(2.30, 10);
		Caixa caixa = new Caixa(racao, 250);
		PetShop petShop = new PetShop(especie, animais, racao, caixa);
		
		petShop.setEspecie(especie);
		petShop.setAnimais(animais);
		petShop.setRacao(racao);
		petShop.setCaixa(caixa);
		
		petShop.resultShow();
		
	}
}
