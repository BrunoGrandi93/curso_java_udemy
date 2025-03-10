package secao4;

public class Condicionais {

    public static void main(String[] args) {
        
    //1 - O que é boolean

    boolean isTrue = true;
    boolean isFalse = false;

    System.out.println(isTrue);
    System.out.println(isFalse);

    //2 - Operadores de comparação

    int x = 10;

    System.out.println(x == 10);

    System.out.println(x == 9);

    System.out.println(x != 5);

    System.out.println(x != 10);

    System.out.println(x > 10);

    System.out.println(x >= 10);

    System.out.println(x < 10);

    System.out.println(x <= 10);

    //3 - Diferença entre comparação e atribuição

    int n = 5;

    int m = 10;

    System.out.println(n == 12);

    System.out.println(n);

    System.out.println(n == m);

    //4 - Comparação de Strings

    String texto1 = "Java";

    String texto2 = new String("Java");

    System.out.println(texto1);

    System.out.println(texto2);

    System.out.println(texto1 == texto2);

    System.out.println(texto1 == "Java");

    System.out.println(texto1.equals(texto2));

    System.out.println(texto2.equals(texto1));

    System.out.println(texto1.equals("Java"));

    String texto3 = "JAVA";

    System.out.println(texto1.equals(texto3));

    System.out.println(texto1.equalsIgnoreCase(texto3));

    //5- IF

    int numero = 10;

    if (numero > 5) {

        System.out.println("O número é maior que 5");
        
    }

    String texto = "Teste";

    if (texto.equals("Teste")) {
        
        System.out.println("O texto é: Teste");
        
    }

    //6 - ELSE

    int q = 7;

    if (q > 10) {

        System.out.println("q é maior que 10");
        
    } else {

        System.out.println("q é menor que 10");

    }

    //7 - ELSE IF

    double nota = 10;

    if(nota == 10) {
        System.out.println("Você tirou a nota máxima");
    }
      else if (nota >= 9) {
        System.out.println("Nota muito boa");
    } else if (nota >= 7) {
        System.out.println("Acima da média");
    } else {
        System.out.println("Abaixo da média");
    }

    int num = 5;
    if (num > 3 && num < 5) {
        System.out.println("Alguma coisa");
    }
    else if (num == 5) {
        System.out.println("Outra coisa");
    }

}
    
}