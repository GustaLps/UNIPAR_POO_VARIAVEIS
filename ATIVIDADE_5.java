ATIVIDADE 01

  public class FizzBuzz {

    public static void main(String[] args) {


        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // Se o número é divisível por 3 e por 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // Se o número é divisível por 3 apenas
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // Se o número é divisível por 5 apenas
                System.out.println("Buzz");
            } else { // Se o número não é divisível por 3 nem por 5
                System.out.println(i);
            }
        }
    }
}

ATIVIDADE 02 

import java.util.Scanner;

public class PatinhosXuxa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial de patinhos: ");
        int numeroPatinhos = scanner.nextInt();

        for (int i = numeroPatinhos; i > 0; i--) {
            System.out.println(i + " patinhos foram passear");
            System.out.println("Além das montanhas para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");

            if (i > 1) {
                System.out.println("Mas só " + (i - 1) + " patinhos voltaram de lá");
            } else {
                System.out.println("A mamãe patinha foi procurar");
                System.out.println("Além das montanhas na beira do mar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá");
                System.out.println("E os " + numeroPatinhos + " patinhos voltaram de lá.");
            }

            System.out.println();
        }

        scanner.close();
    }
}

ATIVIDADE 03

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();


        int totalDias = (anos * 365) + (meses * 30) + dias;


        System.out.println("A idade expressa em dias é: " + totalDias + " dias.");

        scanner.close();
    }
}


ATIVIDADE 04

package contagemnumeros;

import java.util.Scanner;

public class ContagemNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador0a100 = 0;
        int contador101a200 = 0;
        int contadorMaior200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador0a100++;
            } else if (numero >= 101 && numero <= 200) {
                contador101a200++;
            } else {
                contadorMaior200++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + contador0a100);
        System.out.println("Quantidade de números entre 101 e 200: " + contador101a200);
        System.out.println("Quantidade de números maiores que 200: " + contadorMaior200);

        scanner.close();
    }
}

ATIVIDADE 05

class Carro {
    String marca;
    String modelo;
    String cor;
    int ano;
    int velocidade;

    Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }

    void acelerar(int incremento) {
        this.velocidade += incremento;
        System.out.println("O carro " + this.marca + " " + this.modelo + " acelerou para " + this.velocidade + " km/h.");
    }

    void frear(int decremento) {
        if (this.velocidade - decremento < 0) {
            this.velocidade = 0;
        } else {
            this.velocidade -= decremento;
        }
        System.out.println("O carro " + this.marca + " " + this.modelo + " reduziu para " + this.velocidade + " km/h.");
    }
}

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Fiesta", "Prata", 2022);
        Carro carro2 = new Carro("Chevrolet", "Onix", "Preto", 2023);

        carro1.acelerar(50);
        carro2.acelerar(40);
        carro1.frear(20);
        carro2.frear(30);
    }
}

ATIVIDADE 06

  package carro;

public class ContaBancaria {
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String numeroConta) {
        this.saldo = 0.0;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456");

        conta.depositar(1000.0);
        conta.sacar(500.0);
        conta.sacar(600.0); // Isso deve gerar um erro
        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
    }
}

ATIVIDADE 07

  package carro;

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters para os atributos
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque do produto " + this.descricao);
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque do produto " + this.descricao);
        } else {
            System.out.println("Estoque insuficiente ou quantidade inválida para remover do estoque.");
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto(1, "Camiseta", 29.99, 50);

        System.out.println("Produto: " + produto.getDescricao());
        System.out.println("Preço unitário: R$" + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());

        produto.adicionarEstoque(20);
        produto.removerEstoque(15);
        produto.removerEstoque(40); // Isso deve gerar um erro

        System.out.println("Quantidade em estoque após operações: " + produto.getQuantidadeEmEstoque());
    }
}


