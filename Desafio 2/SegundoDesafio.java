import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int notas;

        System.out.print("Digite um valor: ");
        double valor = input.nextDouble();


        System.out.println("NOTAS: ");
        notas = (int)valor/100;
        System.out.printf("%d nota(s) de R$ 100.00\n", notas);
        valor %= 100;

        notas = (int)valor/50;
        System.out.printf("%d nota(s) de R$ 50.00\n", notas);
        valor %= 50;

        notas = (int)valor/20;
        System.out.printf("%d nota(s) de R$ 20.00\n", notas);
        valor %= 20;

        notas = (int)valor/10;
        System.out.printf("%d nota(s) de R$ 10.00\n", notas);
        valor %= 10;

        notas = (int)valor/5;
        System.out.printf("%d nota(s) de R$ 5.00\n", notas);
        valor %= 5;

        notas = (int)valor/2;
        System.out.printf("%d nota(s) de R$ 2.00\n", notas);
        valor %= 2;

        valor *= 100;

        System.out.println("MOEDAS:");

        notas = (int)valor/100;
        System.out.printf("%d moeda(s) de R$ 1.00\n", notas);
        valor %= 100;

        notas = (int)valor/50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", notas);
        valor %= 50;

        notas = (int)valor/25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", notas);
        valor %= 25;

        notas = (int)valor/10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", notas);
        valor %= 10;

        notas = (int)valor/5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", notas);
        valor %= 5;

        notas = (int)valor/1;
        System.out.printf("%d moeda(s) de R$ 0.01\n", notas);
        valor %= 1;

    }
}
