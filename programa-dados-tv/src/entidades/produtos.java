package entidades;

public class produtos {

	private String name;
	private double preco;
	private int quantidade;

	public produtos() {
	
	}

	public produtos(String name, double preco, int quantidade) {
		this.name = name;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public produtos(String name, double preco) {
		this.name = name;
		this.preco = preco;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}

	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;

	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", preco)
				+ ", " 
				+ quantidade 
				+ " unidades, total: $ "
				+ String.format("%.2f", valorTotalEmEstoque());

	}
}