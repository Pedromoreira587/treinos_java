import java.util.ArrayList;
import java.util.Scanner;

public class Ipi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, bem-vindo ao calculador de tributos!");
        System.out.print("Qual o valor atual do IPI a ser calculado? ");
        double ipi = scanner.nextDouble();
        scanner.nextLine();

        ArrayList<String> pecas = new ArrayList<>();
        ArrayList<Double> valoresComIpi = new ArrayList<>();

        String resp = "s";
        while (resp.equalsIgnoreCase("s")) {
            System.out.print("Qual a peça que deseja inserir? ");
            String peca = scanner.nextLine();

            System.out.print("Qual o valor da peça que deseja inserir? ");
            String valor = scanner.nextLine();

            try {
                double valorDouble = Double.parseDouble(valor);
                double valorComIpi = valorDouble + ipi; // Adiciona o IPI ao valor da peça
                valoresComIpi.add(valorComIpi);
                pecas.add(peca);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um valor decimal.");
            }

            System.out.print("Quer inserir outra peça? [s/n] ");
            resp = scanner.nextLine();
        }

        System.out.println("\nPeças e valores com IPI:");
        for (int i = 0; i < pecas.size(); i++) {
            System.out.println(pecas.get(i) + ": R$" + valoresComIpi.get(i));
        }

        scanner.close();
    }

    {

    }
}
