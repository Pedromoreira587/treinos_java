import java.util.Scanner;

public class avaliativaandre2_0 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int limitador = 1;
      while( limitador < 21) { 
                int idade;
                    System.out.println("==============================");
                    System.out.println("| identificador de categoria |");
                    System.out.println("|digite a idade do "+limitador+"° atleta:|");
                    System.out.println("==============================");
                 idade = leitor.nextInt();

                    String categoria;

                 if (idade >= 6 && idade <=7) {
                 categoria = "Sub-7";
                    System.out.println("===============================");
                    System.out.println("       Atleta esta apto       ");
                    System.out.println("   A categoria: " + categoria);
                    System.out.println("===============================");    
                } else if (idade == 8) {
                    categoria = "Sub-8";
                    System.out.println("==============================");
                    System.out.println(" |      Atleta esta apto     |");
                    System.out.println(" |  A categoria: " + categoria +"       |");
                    System.out.println("==============================");
                } else if (idade >= 8 && idade <= 9) {
                    categoria = "Sub-9";
                    System.out.println("==============================");
                    System.out.println(" |      Atleta esta apto     |");
                    System.out.println(" |  A categoria: " + categoria +"       |");
                    System.out.println("==============================");
                 System.out.println("===============================");
                } else if (idade >= 10 && idade <= 11) {
                    categoria = "Sub-11";
                    System.out.println("==============================");
                    System.out.println(" |      Atleta esta apto     |");
                    System.out.println(" |  A categoria: " + categoria +"       |");
                    System.out.println("==============================");
                } else if (idade >= 12 && idade <= 13) {
                    categoria = "Sub-13";
                    System.out.println("==============================");
                    System.out.println(" |      Atleta esta apto     |");
                    System.out.println(" |  A categoria: " + categoria +"       |");
                    System.out.println("==============================");
                } else if (idade >= 14 && idade <= 15) {
                    categoria = "Sub-15";
                    System.out.println("==============================");
                    System.out.println(" |      Atleta esta apto     |");
                    System.out.println(" |  A categoria: " + categoria +"       |");
                    System.out.println("==============================");
                } else if (idade >= 16 && idade <= 17) {
                    categoria = "Sub-17";
                    System.out.println("==============================");
                    System.out.println(" |      Atleta esta apto     |");
                    System.out.println(" |  A categoria: " + categoria +"       |");
                    System.out.println("==============================");
                } else if (idade >= 18 && idade <= 20) {
                    categoria = "Sub-20";
                    System.out.println("==============================");
                    System.out.println(" |      Atleta esta apto     |");
                    System.out.println(" |  A categoria: " + categoria +"       |");
                    System.out.println("==============================");
                } else if ( idade > 20) {
                    categoria = "atleta acima da idade permitida!";
                    System.out.println("==================================");
                    System.out.println("|       Atleta não esta apto     |");
                    System.out.println(               "|"+ categoria +"|"        );
                    System.out.println("==================================");
                }else if (idade <6){
                    categoria = "atleta abaixo da idade permitida!";
                    System.out.println("===================================");
                    System.out.println("|        Atleta não esta apto     |");
                    System.out.println(               "|"+ categoria +"|"        );
                    System.out.println("===================================");
                }
                
            limitador++;
        }  
        System.out.println("programa encerrado!");
        System.out.println("todos os altatas foram verificados!");
        leitor.close();
      
    }   
}