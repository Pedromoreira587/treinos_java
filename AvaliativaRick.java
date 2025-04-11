import java.util.Scanner;

public class AvaliativaRick {

    public static void main(String[] args) {
        int[] idades;
        try (Scanner leitor = new Scanner(System.in)) {
            idades = new int[20];
            for (int i = 0; i < 20; i++) {
                System.out.print("Insira a idade do atleta " + (i + 1) + ": ");
                idades[i] = leitor.nextInt();
            }
        }

        for (int idade : idades) {
            String classificacao = "Sem classificação";

            if (idade == 6 || idade == 7) {
                classificacao = "Sub-7";
            } else if (idade == 8) {
                classificacao = "Sub-8, Sub-9";
            } else if (idade == 9) {
                classificacao = "Sub-9";
            } else if (idade == 10 || idade == 11) {
                classificacao = "Sub-11";
            } else if (idade == 12 || idade == 13) {
                classificacao = "Sub-13";
            } else if (idade == 14 || idade == 15) {
                classificacao = "Sub-15";
            } else if (idade == 16 || idade == 17) {
                classificacao = "Sub-17";
            } else if (idade >= 18 && idade <= 20) {
                classificacao = "Sub-20";
            }

            System.out.println("Idade: " + idade + " Classificação: " + classificacao);
        }
    }

}
