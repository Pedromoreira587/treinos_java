import java.util.Scanner;

public class avaliativaandre {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            String resp = "s";
            while (!resp.equals("n")) {
                
                int idade;
                System.out.print("digite sua idade:");
                idade = leitor.nextInt();
                
                String categoria;
                
                if (idade >= 6 && idade <= 7) {
                    categoria = "Sub-7";
                    System.out.println("A categoria do atleta e: " + categoria);
                } else if (idade == 8) {
                    categoria = "Sub-8";
                    System.out.println("A categoria do atleta e: " + categoria);
                } else if (idade >= 8 && idade <= 9) {
                    categoria = "Sub-9";
                    System.out.println("A categoria do atleta e: " + categoria);
                } else if (idade >= 10 && idade <= 11) {
                    categoria = "Sub-11";
                    System.out.println("A categoria do atleta e: " + categoria);
                } else if (idade >= 12 && idade <= 13) {
                    categoria = "Sub-13";
                    System.out.println("A categoria do atleta e: " + categoria);
                } else if (idade >= 14 && idade <= 15) {
                    categoria = "Sub-15";
                    System.out.println("A categoria do atleta e: " + categoria);
                } else if (idade >= 16 && idade <= 17) {
                    categoria = "Sub-17";
                    System.out.println("A categoria do atleta e: " + categoria);
                } else if (idade >= 18 && idade <= 20) {
                    categoria = "Sub-20";
                    System.out.println("A categoria do atleta e: " + categoria);
                } else if (idade > 20) {
                    categoria = "atleta acima da idade permitida!";
                    System.out.println(categoria);
                } else if (idade < 6) {
                    categoria = "atleta abaixo da idade permitida!";
                    System.out.println(categoria);
                }
                System.out.println(" quer continuar?");
                resp = leitor.next();
            }
        }
    }

}
