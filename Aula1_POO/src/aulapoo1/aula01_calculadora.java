package aulapoo1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class aula01_calculadora {

    public static void main(String[] args) {
        int op, n1, n2, soma, sub, mult;
        double div, res = 0;
        String conf = "Success!";
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------- CALCULADORA --------------");

        System.out.println("Digite o 1º número: ");
        n1 = scanner.nextInt();

        System.out.println("Digite o 2º número: ");
        n2 = scanner.nextInt();

        System.out.println("Digite a operação desejada: \n1- Soma\n2- Subtração"
                + "\n3- Multiplicação\n4- Divisão");
        op = scanner.nextInt();

        switch (op) {
            case 1:
                res = n1 + n2;
                break;
            case 2:
                res = n1 - n2;
                break;
            case 3:
                res = n1 * n2;
                break;
            case 4:
                res = n1 / n2;
                break;
        }
        System.out.println("\n");
        System.out.println(conf);
        System.out.println("\nResultado: " + res);
    }
}
