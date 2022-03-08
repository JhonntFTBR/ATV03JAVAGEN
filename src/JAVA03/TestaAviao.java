package JAVA03;

public class TestaAviao {

	public static void main(String[] args) {
		
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		
		aviao1.tipo = "Airbus A350";
		aviao1.companhiaAerea = "LATAM";
		aviao1.autorizacao = "esta";
		
		aviao2.tipo = "Airbus A320Neo";
		aviao2.companhiaAerea = "Azul";
		aviao2.autorizacao = "não esta";
		
		aviao1.permitirDecolagem(aviao1.tipo, aviao1.companhiaAerea, aviao1.autorizacao);
		aviao2.permitirDecolagem(aviao2.tipo, aviao2.companhiaAerea, aviao2.autorizacao);
		
		}

}