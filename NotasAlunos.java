import java.util.Scanner;

public class NotasAlunos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float soma = 0;

    for (int i=1; i<=4; i++) {

        System.out.println("Nota " + i + ": ");
        int nota1 = s.nextInt();
        soma = soma + nota1;

    }
        float media = soma / 4;
        System.out.println("-------------"); 
        System.out.println("A média das notas é: " + media); 

        if (media < 5) {
            System.out.println("Aluno Reprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno de Recuperação");
        } else {
            System.out.println("Aluno Aprovado!");
        }


    }
}
