package JAVA03;

public class Cliente {

	//Atributos
		String nome,produto;
		int idade;
		
		//métodos
		
		void escolherProduto(String nome,int idade){
			System.out.println(nome+" de "+idade+" anos esta escolhendo produto...");
		}
		void realizarPagamento(String nome,String produto){
			System.out.println(nome+" escolheu um/uma "+produto+" e realizou o  pagamento");
		}

	}