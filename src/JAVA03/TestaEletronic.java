package JAVA03;

public class TestaEletronic {

	public static void main(String[] args) {
		Eletronic Eletronico1 = new Eletronic();
		Eletronic Eletronico2 = new Eletronic();
		
		Eletronico1.nome = "SmarTV";
		Eletronico1.marca = "LG";
		Eletronico1.valor = 2800.99;
		
		Eletronico2.nome = "Iphone11";
		Eletronico2.marca = "Apple";
		Eletronico2.valor = 5899.99;
		
		Eletronico1.consultarValorProduto(Eletronico1.nome, Eletronico1.marca, Eletronico1.valor);
		Eletronico2.consultarValorProduto(Eletronico2.nome, Eletronico2.marca, Eletronico2.valor);
		
		

	}

}