import java.util.Scanner;

public class VerificadorVoto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicita a idade da pessoa
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        // Solicita se a pessoa é alfabetizada
        System.out.print("Você é alfabetizado? (true/false): ");
        boolean ehAlfabetizado = sc.nextBoolean();

        // Define a elegibilidade com base na idade
        if (idade < 16) {
            System.out.println("Não está apto(a) a votar. A idade mínima é 16 anos.");
        } else if ((idade >= 16 && idade < 18) || idade > 70 || !ehAlfabetizado) {
            System.out.println("Está apto(a) a votar. O voto é facultativo.");
        } else if (idade >= 18 && idade <= 70 && ehAlfabetizado) {
            System.out.println("Está apto(a) a votar. O voto é obrigatório.");
        }

        sc.close();
    }
}
