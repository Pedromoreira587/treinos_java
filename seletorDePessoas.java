import java.util.Scanner;

public class seletorDePessoas {
   
    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);
        int homensClass=0 , mc=0;
        String cont = "s";
        while (!cont.equals("n")) {
    
            System.out.println("==========================");
            System.out.println("|   SELETOR DE PESSOAS   |");
            System.out.println("==========================");
            System.out.println("Qual seu sexo?[m/f]");
            String sexo = scanner.next();
            System.out.println("Qual sua idade?");
            int idade = scanner.nextInt();
            System.out.println("qual a cor de seu Cabelo?");
            System.out.println("-------------------------");
            System.out.println("[1] Preto");
            System.out.println("[2] Catsnho");
            System.out.println("[3] Loiro");
            System.out.println("[4] Ruivo");
            int cabelo = scanner.nextInt();
            System.out.println("Quer continuar?[s/n]");
            cont = scanner.next();

            
            if (sexo.equals("m")&&idade>=18 && cabelo==2) homensClass++;
            if (sexo.equals("f")&&idade>=25 && idade<=30  && cabelo==3) mc++;
        }
        System.out.println("total de homens com mais de 18 anos e cabelos catanhos: " + homensClass);
        System.out.println("total de mulheres entre 25 e 30 anos cabelos loitos: " + mc);
    }   
    
}
