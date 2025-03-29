import java.util.Scanner;

public class melhoraluno {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("-------------------------------------");
            System.out.println("           escola de java            ");
            System.out.println("-------------------------------------");
            System.out.print("quantos alunos a sala tem?");
            int numeroalunos = scanner.nextInt();
            String maluno="";  
            double maiornota=0;

             for (int i = 0; i < numeroalunos; i++){
                System.out.println("Nome do aluno:");
                String nome = scanner.next();
                System.out.println("Nota do aluno:");
                double nota = scanner.nextDouble();
                if (nota > maiornota){
                    maiornota = nota;
                    maluno=nome;
                }
             }
             System.out.printf("o melhor aluno e %s com a nota %.2f",maluno,maiornota);
        }
    }  
}
