package secao4;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        
    /*
    > Exercício 1: Verificação de Categoria de Preço

    Peça ao usuário para inserir o preço de um produto. 
    Se o preço for menor que 50, categorize-o como "Barato". 
    Se estiver entre 50 e 100, categorize como "Médio". 
    Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.
    */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");

        double preço = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("O valor é: R$" + preço);
  
        scanner.close();

        if (preço < 50) 
        {
            System.out.println("O produto está barato!");            
        }
        else if (preço >= 50 && preço <= 100) 
        {
            System.out.println("O produto está com um preço intermediário!");            
        }
        else    
        {
            System.out.println("O preço do produto está caro!");
        }

    /*
    > Exercício 2: Validação de Login

    Peça ao usuário para inserir um nome de usuário e uma senha. 
    Verifique se o nome de usuário é "admin" e a senha é "1234". 
    Se ambos forem corretos, exiba "Acesso permitido". 
    Caso contrário, exiba "Acesso negado".
    */

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");

        String usuario = scanner2.nextLine();

        System.out.println("Digite sua senha: ");

        String senha = scanner2.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) 
        {
            System.out.println("Acesso permitido");            
        }
        else
        {
            System.out.println("Acesso negado");
        }
        scanner2.close();

    /*    
    > Exercício 3: Identificação de Paridade com Strings

    Peça ao usuário para inserir um número. 
    Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar". 
    Use uma string para armazenar o resultado e exibi-la.

    Depois de avaliar o número, tu vai colocar se é par ou impar em uma var.
    */

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");

        long n = scanner3.nextLong();

        scanner3.nextLine();

        String resultado = "";

        if ((n % 2) == 0) 
        {
            resultado = "O número é PAR.";    
        }
        else
        {
            resultado = "O número é IMPAR.";
        }

        System.out.println(resultado);

        scanner3.close();

    /*
    > Exercício 4: Identificação de Dia Útil

    Peça ao usuário para inserir um número de 1 a 7, 
    representando os dias da semana (1 para domingo, 2 para segunda, etc.). 
    Use switch para verificar se o dia é um dia útil (segunda a sexta) 
    ou final de semana (sábado e domingo). 
    Exiba uma mensagem correspondente.
    */

        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Insira um número de 1 a 7.");

        int diaDaSemana = scanner4.nextInt();

        switch(diaDaSemana)  
        {
            case 1:
            case 7:
                System.out.println("É final de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia útil.");
                break;
            default:
                System.out.println("Digite um número válido.");
                break;
        }

        scanner4.close();
    
    /*
    > Exercício 5: Verificação de Intervalo com AND

    Peça ao usuário para inserir um número. 
    Verifique se o número está no intervalo de 10 a 20, inclusive. 
    Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
    */
    
        Scanner scanner5 = new Scanner(System.in);

        System.out.println("Insira um número: ");

        double nIntervalo = scanner5.nextDouble();

        if (nIntervalo >= 10 && nIntervalo <=20)
        {
            System.out.println("Dentro do intervalo.");
        }
        else
        {
            System.out.println("Fora do intervalo.");
        }

        scanner5.close();

    /*
    > Exercício 6: Classificação de Letra

    Peça ao usuário para inserir uma letra. 
    Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante. 
    Exiba "Vogal" ou "Consoante" de acordo com a entrada. 
    Considere tanto letras maiúsculas quanto minúsculas. 
    */

        Scanner scanner6 = new Scanner(System.in);

        System.out.println("Insira uma letra:");
        
        char letra = scanner6.nextLine().toLowerCase().charAt(0);

        switch (letra) 
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("A letra digitada é uma vogal.");                
                break;        
            default:
                System.out.println("A letra é uma consoante.");
                break;
        }

        scanner6.close();

    }
    
}
