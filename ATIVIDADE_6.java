TEORICA 

1- O que é orientação a objetos e quais são seus princípios fundamentais? 
  
R: A orientação a objetos é um estilo de programação baseado em objetos que representam entidades do mundo real. Seus princípios fundamentais são: 

Abstração 

Encapsulamento 

Herança 

Polimorfismo 

 

2-Quais são as vantagens da orientação a objetos em comparação com paradigmas de programação procedural? 

R: A orientação a objetos oferece vantagens significativas em relação à programação procedural: 

  

1. Reutilização de código: Classes e objetos podem ser reutilizados, reduzindo a redundância. 

  

2. Abstração: Foco nos aspectos essenciais simplifica a compreensão e a manutenção do código. 

  

3. Encapsulamento: Protege os dados e controla o acesso, melhorando a segurança e a integridade. 

  

4. Herança: Hierarquias de classes permitem a reutilização de código e a organização do sistema. 

  

5. Polimorfismo: Trata objetos de maneira uniforme, aumentando a flexibilidade e a extensibilidade do código. 

  

Essas vantagens resultam em software mais robusto, flexível e fácil de manter. 

 

3- Explique o conceito de encapsulamento e como ele é implementado em linguagens de programação orientadas a objetos. 

R: O encapsulamento em programação orientada a objetos significa agrupar dados e métodos em objetos, controlando o acesso aos dados por meio de métodos públicos. Em resumo, é proteger os dados dentro de um objeto e permitir apenas operações autorizadas por métodos específicos. 

 

4- Explique o conceito de classe e objeto em programação orientada a objetos, e como eles estão relacionados. 

R: Uma classe em programação orientada a objetos é um modelo que define atributos e métodos comuns para objetos específicos. Um objeto é uma instância dessa classe, com seus próprios valores para os atributos e a capacidade de executar os métodos definidos pela classe. Em resumo, uma classe é como um plano e um objeto é uma realização desse plano. 

 

5- Qual é a importância dos construtores e métodos em uma classe em programação orientada a objetos? 

R: Os construtores iniciam objetos com um estado inicial, enquanto os métodos definem o comportamento e as operações que os objetos podem realizar. Ambos são cruciais para a estrutura e funcionalidade em programação orientada a objetos. 

 

6- Quais são as diferenças entre métodos estáticos e métodos de instância em uma classe? 

R: Os métodos estáticos pertencem à classe em si, podendo ser chamados sem a necessidade de criar uma instância da classe. Já os métodos de instância estão associados a objetos específicos da classe e requerem que um objeto seja criado para serem chamados. Resumidamente, métodos estáticos são acessados diretamente pela classe, enquanto métodos de instância precisam de um objeto para serem utilizados. 

 

7- Como são tratados os conceitos de acoplamento e coesão na orientação a objetos e por que são importantes? 

R: Acoplamento refere-se ao grau de dependência entre partes do código, enquanto coesão diz respeito a quão relacionados e focados são os elementos dentro de uma parte do código.  

Na orientação a objetos, é importante manter o acoplamento baixo para flexibilidade e alta coesão para clareza e eficiência no código. 

 

8- Qual é o objetivo do metodo main ? 

R: O objetivo do método `main` é ser o ponto de entrada de um programa, onde a execução do código começa. 

 

9- Como ocorre a passagem de parâmetros em métodos de uma classe em programação orientada a objetos? 

R: Na orientação a objetos, a passagem de parâmetros em métodos pode ser por valor (cópia do valor) ou por referência (referência ao objeto). 

 

10- Qual é a diferença entre os modificadores de acesso "public", "private" e "protected" em uma classe? 

R: Claro, vou simplificar bastante: 

public: Permite acesso a membros de qualquer classe. 

private: Restringe o acesso ao próprio corpo da classe onde o membro está definido. 

protected: Similar ao “private”, mas permite acesso também às subclasses da classe onde o membro está definido. 

Isso ajuda a controlar quem pode ver ou modificar partes específicas de uma classe, garantindo a segurança e a integridade do código. 

11-Qual é a importância da palavra-chave "this" em programação orientada a objetos e como ela é utilizada? 

R: A palavra-chave "this" em programação orientada a objetos é usada para se referir ao objeto atual em um método ou construtor. Isso é importante para distinguir variáveis locais de variáveis de instância com o mesmo nome. 

 

PRÁTICA 

1 - Você deve criar uma classe em Java para representar um carro. A classe deve conter atributos privados para armazenar a marca, o modelo, o ano e a cor do carro. Além disso, você deve implementar métodos públicos para acessar e modificar esses atributos, garantindo o encapsulamento da classe. Por fim, crie um método para exibir as informações do carro. 

Após criar a classe, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as informações dos carros criados. 

Lembre-se de utilizar o encapsulamento adequado para proteger os atributos da classe e garantir o acesso seguro aos mesmos através dos métodos públicos. 

R:  package carro;

class Produto {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Produto(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public static void main(String[] args) {
        Produto carro1 = new Produto("Toyota", "Corolla", 2020, "Prata");
        Produto carro2 = new Produto("Honda", "Civic", 2019, "Preto");

        carro1.exibirInformacoes();
        System.out.println(); // linha em branco
        carro2.exibirInformacoes();

        carro1.setAno(2021);
        carro1.setCor("Vermelho");

        System.out.println(); // linha em branco
        System.out.println("Informações atualizadas do Carro 1:");
        carro1.exibirInformacoes();
    }
}

2 - Desenvolva uma classe em Java para representar um objeto do tipo Produto. Essa classe deve possuir atributos privados para armazenar o nome, o preço e a quantidade em estoque do produto. Implemente métodos públicos para acessar e modificar esses atributos, garantindo o encapsulamento adequado da classe.

Após criar a classe Produto, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as informações dos produtos criados.

Certifique-se de utilizar o encapsulamento de forma correta, protegendo os atributos da classe e garantindo o acesso seguro a eles através dos métodos públicos disponibilizados.

R: package produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.99, 50);
        Produto produto2 = new Produto("Calça Jeans", 79.99, 30);

        System.out.println("Informações do Produto 1:");
        produto1.exibirInformacoes();

        System.out.println(); // linha em branco

        System.out.println("Informações do Produto 2:");
        produto2.exibirInformacoes();

        produto1.setPreco(34.99);
        produto1.setQuantidadeEmEstoque(40);

        System.out.println(); // linha em branco
        System.out.println("Informações atualizadas do Produto 1:");
        produto1.exibirInformacoes();
    }
}

3 - Você deve implementar um programa em Java para gerenciar o estoque de uma loja. Para isso, crie uma classe **`Produto`** que representará os produtos disponíveis na loja. Esta classe deve possuir atributos privados para armazenar o nome, o preço e a quantidade em estoque do produto.

Em seguida, implemente métodos públicos na classe **`Produto`** para acessar e modificar esses atributos, garantindo o encapsulamento adequado da classe.

Após criar a classe **`Produto`**, desenvolva um programa principal que permita ao usuário realizar as seguintes operações:

1. Adicionar um novo produto ao estoque, fornecendo o nome, o preço e a quantidade em estoque.
2. Atualizar o preço ou a quantidade em estoque de um produto existente.
3. Exibir os detalhes de um produto específico, incluindo seu nome, preço e quantidade em estoque.

Certifique-se de utilizar o encapsulamento de forma correta na classe **`Produto`**, protegendo os atributos da classe e garantindo o acesso seguro a eles através dos métodos públicos disponibilizados.

R: import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto("Camiseta", 29.99, 50);

        System.out.println("=== Sistema de Gerenciamento de Estoque ===");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Atualizar Produto");
        System.out.println("3. Exibir Detalhes de Produto");
        System.out.println("0. Sair");

        int opcao;
        do {
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.next();
                    System.out.print("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em Estoque: ");
                    int quantidade = scanner.nextInt();
                    produto = new Produto(nome, preco, quantidade);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("1. Atualizar Preço");
                    System.out.println("2. Atualizar Quantidade em Estoque");
                    int escolha = scanner.nextInt();
                    if (escolha == 1) {
                        System.out.print("Novo Preço: ");
                        double novoPreco = scanner.nextDouble();
                        produto.setPreco(novoPreco);
                        System.out.println("Preço atualizado com sucesso!");
                    } else if (escolha == 2) {
                        System.out.print("Nova Quantidade em Estoque: ");
                        int novaQuantidade = scanner.nextInt();
                        produto.setQuantidadeEmEstoque(novaQuantidade);
                        System.out.println("Quantidade em Estoque atualizada com sucesso!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 3:
                    produto.exibirInformacoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

4 - **Exercício para Praticar Método Construtor em Java:**

Você deve criar uma classe **`Circulo`** que representará um círculo geométrico. Essa classe deve conter os seguintes atributos privados:

- Raio (do tipo double)
- Cor (do tipo String)

Implemente um método construtor na classe **`Circulo`** que aceite dois parâmetros: o raio e a cor do círculo. O método construtor deve inicializar os atributos correspondentes com os valores fornecidos como parâmetros.

Após criar a classe **`Circulo`**, desenvolva um programa principal que permita ao usuário criar objetos dessa classe e exibir suas características.

Certifique-se de que o método construtor está sendo utilizado corretamente para inicializar os objetos da classe **`Circulo`** com os valores fornecidos pelo usuário.

Dica: Você pode incluir métodos adicionais na classe **`Circulo`** para calcular a área ou o perímetro do círculo, se desejar.

R: import java.util.Scanner;

public class Circulo {
    private double raio;
    private String cor;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do teclado
        System.out.print("Digite a cor do círculo: ");
        String cor = scanner.nextLine();

        Circulo circulo = new Circulo(raio, cor);

        System.out.println("\nCaracterísticas do Círculo:");
        System.out.println("Raio: " + circulo.raio);
        System.out.println("Cor: " + circulo.cor);
        System.out.println("Área: " + circulo.calcularArea());

        scanner.close();
    }
}

5 - **Exercício para Praticar Múltiplos Construtores em Java:**

Crie uma classe **`Produto`** que representará um produto em uma loja. Essa classe deve conter os seguintes atributos privados:

- Nome (do tipo String)
- Preço (do tipo double)
- Quantidade em Estoque (do tipo int)

Implemente múltiplos métodos construtores na classe **`Produto`** para permitir diferentes maneiras de inicializar um objeto **`Produto`**. Os métodos construtores devem ser os seguintes:

1. Um construtor que aceita apenas o nome do produto e inicializa os demais atributos com valores padrão (preço = 0.0 e quantidade em estoque = 0).
2. Um construtor que aceita o nome e o preço do produto, inicializando a quantidade em estoque com o valor padrão (0).
3. Um construtor que aceita o nome, o preço e a quantidade em estoque do produto.

Após criar a classe **`Produto`**, desenvolva um programa principal que permita ao usuário criar objetos dessa classe utilizando os diferentes construtores implementados e exibir as características dos produtos criados.

Certifique-se de que os métodos construtores estão sendo utilizados corretamente para inicializar os objetos da classe **`Produto`** com os valores fornecidos pelo usuário.

R: import java.util.Scanner;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEmEstoque = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = 0;
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque do produto: ");
        int quantidade = scanner.nextInt();

        Produto produto1 = new Produto(nome);
        Produto produto2 = new Produto(nome, preco);
        Produto produto3 = new Produto(nome, preco, quantidade);

        System.out.println("\nInformações do Produto 1:");
        produto1.exibirInformacoes();
        System.out.println("\nInformações do Produto 2:");
        produto2.exibirInformacoes();
        System.out.println("\nInformações do Produto 3:");
        produto3.exibirInformacoes();

        scanner.close();
    }
}
