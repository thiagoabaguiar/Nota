import java.util.Scanner;

public class App{

    public static void main(String[] args){

        try (Scanner scan = new Scanner(System.in)) {
            int scoreStudent = -1;

            while(scoreStudent < 0 || scoreStudent > 10){

                System.out.println("Digite a nota do aluno: ");
                scoreStudent = scan.nextInt();
                if (scoreStudent < 0 || scoreStudent > 10) System.out.println("Nota inválida!");

            }

            System.out.println("Nota do aluno: " + scoreStudent);
        }

    }

}