# Gerenciamento de Produtos em Java

## Sobre o Projeto
Este é um projeto simples em Java para gerenciamento de produtos. O programa permite criar um objeto `Produto`, modificar seus atributos, adicionar ou remover unidades do estoque e visualizar as informações do produto atualizado.

O projeto foi desenvolvido como parte de um curso de introdução à Programação Orientada a Objetos (POO) em Java.

---

## Estrutura do Projeto

O projeto é composto por dois pacotes:
- `aplicacao`: Contém a classe `programa`, responsável pela interação com o usuário e execução do fluxo principal.
- `entidades`: Contém a classe `produtos`, que define os atributos e métodos relacionados ao produto.

### 📂 Pacotes e Arquivos:
```
📦 aplicacao
 ┣ 📜 programa.java
📦 entidades
 ┣ 📜 produtos.java
```

---

## Explicação do Código

### `programa.java` (Classe Principal)
Esta classe contém o método `main`, que faz a interação com o usuário e manipula os objetos da classe `produtos`.

1. **Configuração do Scanner e Locale:**
   ```java
   Locale.setDefault(Locale.US);
   Scanner sc = new Scanner(System.in);
   ```
   Define a formatação numérica como padrão dos EUA e inicializa um `Scanner` para entrada de dados.

2. **Entrada de Dados do Usuário:**
   ```java
   System.out.print("Nome: ");
   String name= sc.nextLine();
   System.out.print("Preço: ");
   double preco = sc.nextDouble();
   ```
   Solicita ao usuário o nome e o preço do produto.

3. **Criação do Objeto Produto:**
   ```java
   produtos produtos = new produtos(name, preco);
   ```
   Instancia um objeto da classe `produtos` com os dados informados.

4. **Modificação e Exibição de Dados:**
   ```java
   produtos.setName("computador");
   System.out.println("Nome atualizado: " + produtos.getName());
   ```
   O nome do produto é atualizado e exibido.

5. **Manipulação de Estoque:**
   ```java
   System.out.print("Entre com o número de produtos para adicionar ao estoque: ");
   int quantidade = sc.nextInt();
   produtos.addProdutos(quantidade);
   ```
   Adiciona unidades ao estoque.

6. **Remoção de Itens do Estoque:**
   ```java
   System.out.print("Entre com a quantidade para remover do estoque: ");
   quantidade = sc.nextInt();
   produtos.removerProdutos(quantidade);
   ```
   Remove unidades do estoque.

---

### `produtos.java` (Classe Produto)
Esta classe define os atributos e métodos do produto.

#### **Atributos:**
```java
private String name;
private double preco;
private int quantidade;
```
Define o nome, preço e quantidade do produto no estoque.

#### **Construtores:**
```java
public produtos(String name, double preco, int quantidade) {
    this.name = name;
    this.preco = preco;
    this.quantidade = quantidade;
}
```
Permite criar objetos com ou sem quantidade inicial definida.

#### **Métodos:**
- **Getters e Setters:** Para acessar e modificar os atributos.
- **Métodos para Gerenciamento de Estoque:**
  ```java
  public void addProdutos(int quantidade) {
      this.quantidade += quantidade;
  }

  public void removerProdutos(int quantidade) {
      this.quantidade -= quantidade;
  }
  ```
  Adiciona ou remove unidades do estoque.

- **Método `toString` para Exibição Formatada:**
  ```java
  public String toString() {
      return name
          + ", $ "
          + String.format("%.2f", preco)
          + ", "
          + quantidade
          + " unidades, total: $ "
          + String.format("%.2f", valorTotalEmEstoque());
  }
  ```
  Retorna os dados do produto formatados.

---

## Como Executar o Programa

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. **Abra o projeto em uma IDE (Eclipse, IntelliJ, VS Code com extensão Java).**
3. **Compile e execute `programa.java`.**
4. **Siga as instruções do console para interagir com o programa.**

---

## Melhorias Futuras 🚀
- Implementar tratamento de erros para evitar valores inválidos.
- Criar uma interface gráfica para melhorar a usabilidade.
- Permitir salvar e carregar produtos de um arquivo ou banco de dados.

---

## Autor
Desenvolvido por **Lucas Freire** – [GitHub](https://github.com/Lucasrfreir)

Se você gostou do projeto, não se esqueça de deixar uma ⭐ no repositório!

---

