import java.util.Scanner;

public class calculadoraIMC {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            double altura = 0;
            double peso = 0;
            System.out.println("\nOla, bem vindo a calculadora de IMC!");
            System.out.println("\nPara comecar preciso de algumas informaçoes");
            while (true) {
                System.out.println("\nDigite sua altura em metros:");
                altura = scanner.nextDouble();
                if (altura > 0) {
                    break;
                }
                System.out.println("Altura inválida. Digite um valor positivo.");
            }

            while (true) {
                System.out.println("Agora digite seu peso em kg:");
                peso = scanner.nextDouble();
                if (peso > 0) {
                    break;
                }

            }
            double imc = peso / (altura * altura);
            String minhaString;

            if (imc > 40.0) {
                System.out.printf("\nIMC: %.2f ", imc);
                System.out.println("\nClassificação: Obesidade grau 3");
                minhaString = "Obesidade grau 3";

            } else if (imc > 35.0 && imc < 39.9) {
                System.out.printf("\nIMC: %.2f ", imc);
                System.out.println("\nClassificação: Obesidade grau 2");
                minhaString = "Obesidade grau 2";

            } else if (imc > 30.0 && imc < 34.9) {
                System.out.printf("\nIMC: %.2f ", imc);
                System.out.println("\nClassificação: Obesidade grau 1");
                minhaString = "Obesidade grau 1";

            } else if (imc > 25.0 && imc < 29.9) {
                System.out.printf("\nIMC: %.2f ", imc);
                System.out.println("\nClassificação: sobrepeso");
                minhaString = "Sobre peso";

            } else if (imc > 18.5 && imc < 24.9) {
                System.out.printf("\nIMC: %.2f ", imc);
                System.out.println("\nClassificação: peso normal");
                minhaString = "Peso normal";

            } else {
                System.out.printf("\nIMC: %.2f ", imc);
                System.out.println("\nClassificação: abaixo do peso");
                minhaString = "Abaixo do peso";

            }
            switch (minhaString) {
                case "Obesidade grau 3" -> System.out.println("Voce esta em um caso grave! procure um medico urgente");

                case "Obesidade grau 2" -> System.out.println("Voce esta em um caso grave! procure um medico");

                case "Obesidade grau 1" -> System.out.println("Voce esta entrando em um ponto critico! procure ajuda medica");

                case "Sobre peso" -> System.out.println("E recomendado iniciar uma dieta e exercicios");

                case "Peso normal" -> System.out.println("Parabens! seu peso esta otimo!");

                case "Abaixo do peso" -> System.out.println("Voce esta entrando em um ponto critico! procure ajuda mediica");

                default -> {
                }
            }
        }

    }

}
