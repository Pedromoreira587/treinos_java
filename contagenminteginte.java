import java.util.Scanner;

public class contagenminteginte {

    public static void main(String[] args) {
        Scanner scanner =   new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("         CONTAGEM INTELIGENTE        ");
        System.out.println("-------------------------------------");
        System.out.print("inicio: ");
        int numero_inicio = scanner.nextInt();
        System.out.print("fim: ");
        int numero_fim = scanner.nextInt();
        if (numero_inicio == numero_fim) {
            System.out.println("os numeros são iguais");
        }
        if (numero_inicio > numero_fim) {
            System.out.println("Contegem regressiva");
        }
        while (numero_inicio > numero_fim) {

            System.out.println(numero_inicio - 1);
            numero_inicio--;
        }
        if (numero_inicio < numero_fim) {
            System.out.println("Contegem progressiva");
        }
        while (numero_inicio < numero_fim) {

            System.out.println(numero_inicio + 1);
            numero_inicio++;

        }

    }
}