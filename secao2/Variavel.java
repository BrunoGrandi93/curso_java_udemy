package secao2;

public class Variavel {

    public static void main(String[] args) {
        
        // 1- O que são variáveis

        // tipo -> nome -> atribuir um valor;

        String nome = "Bruno";

        // nome => "Bruno"
        System.out.println(nome);

        // 2- Atribuição de variável com outra

        String teste = "Teste";

        String testanto = teste;

        System.out.println(testanto);

        long numeroGrande = 9999999999L;

        // int numeroGrandeDois = numeroGrande; - erro por não conseguir converter uma variável em outra, limite de caracteres da variável int

        System.out.println(numeroGrande);

        // 3- Comentários

        /*
         
        Comentário linha 1
        linha 2
        linha 3

         */

         /**
          * Função para soma
          * param1:
          * param2:
          * retorno
          */

          // 4- Strings

          String firstName = "Bruno";
          String lastName = "Grandi";

          //Concatenar nas Strings para uni-las

          System.out.println(firstName + " " + lastName);

          System.out.println("Meu nome é: " + firstName);

          String fullName = (firstName + " " + lastName);

          System.out.println(fullName);

          //5- Char

          char letra = 'A';

          System.out.println(letra);

          char letra2 = '$';

          System.out.println(letra2);

          //6- Int

          int n = 42;

          System.out.println(n);

          System.out.println(n + 5);

          System.out.println(n * 5);

          System.out.println(n / 5);

          int soma = n + 12;

          System.out.println(soma);

          //7- Long

          //Necessário colocar l ou L no final do valor long

          long populacaoMundial = 7800000000l;

          System.out.println(populacaoMundial);
          
          //Opção de colocar _ para separar de 3 em 3 números para melhor visualização

          long grandeNumero = 1_000_000_000_000L;

          System.out.println(grandeNumero + 1);

          //8- Double

          double preco = 19.99;

          System.out.println(preco);          

          System.out.println(preco - 12);

          System.out.println(preco / 2);   
          
          //Opção de colocar _ para separar de 3 em 3 números para melhor visualização

          double pi = 3.141_592_123;

          System.out.println(pi);

          //Pode-se colocar d ou D ao final do valor double

          double valorD = 12.1D;

          System.out.println(valorD);

          //9- Operadores Aritméticos p1

          int soma2 = 12 + 5;

          System.out.println(soma2);

          System.out.println(22 + 4);

          System.out.println(10 - 5);

          System.out.println(10 * 5);

          System.out.println(10 / 2.5);

          System.out.println(10.0 / 2.5);

          //Para ter resultado com decimais, pelo menos 1 num da divisão tem que ser double

          System.out.println(10 / 3); // = 3

          System.out.println(10.0 / 3); // = 3.333333333

          System.out.println(10 % 3); //O que sobra da divisão exata

          //10- Operadores Aritméticos p2
        
          int x = 5;

          x++;
          x++;
          x++;
          x++;

          //loops -> for, while

          System.out.println(x);

          int y = 5;

          y--;

          System.out.println(y);

          int a = 10;

          a += 5; // a = a + 5;

          System.out.println(a);

          int b = 10;

          b -= 5;

          System.out.println(b);

          b -= a;

          System.out.println(b);

          //11- Type casting

          //Implicito (widening)

          int numero2 = 42;

          long numeroLong = numero2;

          double numeroDouble = numero2;

          System.out.println(numeroLong);

          System.out.println(numeroDouble);

          //Explicito (narrowing)

          double valorDouble = 9.78;

          int valorInt = (int) valorDouble;

          System.out.println(valorInt);

          //Casting de char para int

          char letra3 = 'A';

          int codigoAscii = (int) letra3;

          System.out.println(codigoAscii);

          //12- Exercícios

          

        }
    
}
