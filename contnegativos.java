import java.util.Scanner;

public class contnegativos {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            int cont  = 1;
            int totn = 0;
            while (cont < 6) {
                
                System.out.println("digite os numeros que dejeja verificar");
                int numeros = scanner.nextInt();
                    if (numeros<0) { totn = totn + 1;}
                    cont = cont+ 1;  
            }  
            System.out.println("foram digitados " + totn + " valores negativos");
        } 
    }
    
}
