import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) throws Exception {

        double nota1, nota2, nota3, nota4, media;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite a primeira nota bimestral: ");

        nota1 = input.nextInt();

        System.out.println("Digite a segunda nota bimestral: ");

        nota2 = input.nextInt();

        System.out.println("Digite a terceira nota bimestral: ");

        nota3 = input.nextInt();

        System.out.println("Digite a quarta nota bimestral: ");

        nota4 = input.nextInt();

        input.close();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas bimestrais é: " + media);
        
    }

}
