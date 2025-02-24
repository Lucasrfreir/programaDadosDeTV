package aplicacao;
//segundo programa proposto pelo curso!
import java.util.Locale;
import java.util.Scanner;

import entidades.produtos;  //Importação de classe "produtos". Feita com CTRL+SHIFT+~... 
							//ps: troquei o atalhoCTRL+SHIFT+O pq nao estava funcionando na minha maquina.

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entre com dados do produto: ");
		System.out.print("Nome: ");
		String name= sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		produtos produtos = new produtos(name, preco);
		
		produtos.setName("computador");
		System.out.println("Nome atualizado: " + produtos.getName());
		produtos.setPreco(1200);
		System.out.println("Preço atualizado: " + produtos.getPreco());
		
		System.out.println();
		System.out.println("Dados do produto: " + produtos);		
		
		System.out.println();
		System.out.println("Entre com o numero de produtos para adicionar ao estoque: ");
		int quantidade = sc.nextInt();
		produtos.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados do produto: " + produtos);
		
		System.out.println();
		System.out.println("Entre com a quantidade para remover do estoque: ");
		quantidade = sc.nextInt();
		produtos.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados do produto: " + produtos);

		sc.close();
	}

}
