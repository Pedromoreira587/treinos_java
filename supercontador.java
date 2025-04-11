import java.util.Scanner;

public class supercontador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=========================");
            System.out.println("|       M E N U         |");
            System.out.println("=========================");
            System.out.println("|    [1] De 1 a 10      |");
            System.out.println("|    [2] De 10 a 1      |");
            System.out.println("|    [3] SAIR           |");
            System.out.println("=========================");
            int resp = scanner.nextInt();
            int num1 ;
            if (resp == 1){
                num1 = 1 ;
                while (num1 <= 10) {
                    System.out.print(num1 +(num1<10? "..":""));
                num1++;    
                }
                
            }else if (resp == 2) {
                num1 = 10 ;
                while (num1 > 0) {
                    System.out.print(num1 +(num1>1? "..":""));
                num1--;
                
            }} else if (resp == 3) {
                System.out.println("Saindo do programa.");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}

 
 