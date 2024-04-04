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

ATIVIDADE 04

