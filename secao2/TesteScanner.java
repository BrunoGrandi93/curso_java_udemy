package secao2;

import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {
        
        // //1 - Testando Scanner

        Scanner scanner = new Scanner(System.in);

        //Mensagem para o usuário digitar
        System.out.println("Digite o seu nome: ");

        //Resgata o valor do terminal
        String nome = scanner.nextLine();

        //Exibe o valor
        System.out.println("Olá " + nome + "!");

        //Mensagem para o usuário digitar
        System.out.println("Digite sua idade: ");

        //Resgata o valor do terminal
        int idade = scanner.nextInt();

        //Exibe o valor
        System.out.println("Você tem mesmo " + idade + " anos?");

        //2- Problema nextLine

        System.out.println("Digite um número: ");

        int n = scanner.nextInt();

        //Comando para não ter problema no input de texto após o input de número
        scanner.nextLine();

        System.out.println("Digite um texto: ");

        String txt = scanner.nextLine();

        System.out.println("Os dados são: n = " +n + " e txt = " + txt);

        //Fechamento do scanner
        scanner.close();

    }

}