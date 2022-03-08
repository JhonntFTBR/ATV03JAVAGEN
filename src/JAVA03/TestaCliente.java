package JAVA03;

public class TestaCliente {

	public static void main(String[] args) {
		
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.nome = "Bruna";
		cliente1.idade = 25;
		cliente1.produto = "Bolsa";
		
		cliente2.nome = "Jose";
		cliente2.idade = 45;
		cliente2.produto = "CamisaSocial";
		
		cliente1.escolherProduto(cliente1.nome, cliente1.idade);
		cliente1.realizarPagamento(cliente1.nome, cliente1.produto);
		
		cliente2.escolherProduto(cliente2.nome, cliente2.idade);
		cliente2.realizarPagamento(cliente2.nome, cliente2.produto);
		
		}

	}
