import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String resp = "s";
            while (!resp.equals("n")) {
            System.out.print("digite um numero:");
            int num = scanner.nextInt();
            int cont = num;
            int fat =1;
            
            if (num==0) {
                System.out.println("O fatorial de " + num + " é igual a 1");
               
            } else if (num<0){
                System.out.println("Fatorial não definido para números negativos.");
            } else {
            }
            
                while (cont > 1) {
                    fat = fat * cont; 
                    cont = cont - 1;
              
                    System.out.print(cont +(cont >1? " x " :""));    
                }
                    System.out.print("\no valor de fatorial de " + num + " e igual a "+  fat);
                System.out.println(" quer continuar?");
                resp = scanner.next();
            }
        }
    }
}
