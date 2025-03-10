package secao4;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
    //Operadores Lógicos

    //8 - AND

    int idade = 18;
    boolean temCarteiraDeMotorista = true;
    boolean carteiraVencida = false;

    // true == true > true (variável)
    System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

    int a = 10;
    int b = 20;

    if (a > 5 && b > 10) {
        System.out.println("Tudo certo");
    } else {
        System.out.println("Error");
    }

    //9 - OR

    boolean estaChovendo = false;
    boolean temGuardaChuva = true;

    System.out.println(estaChovendo || temGuardaChuva);

    System.out.println(10 > 20 && 100 == 200);

    int idade2 = 17;
    boolean ehMembro = false;

    if (idade2 > 16 || ehMembro) {
        System.out.println("Você pode entrar");        
    }
    else {
        System.out.println("Entrada Negada");
    }

    //10 - NOT

    System.out.println(estaChovendo);
    System.out.println(!estaChovendo);

    System.out.println(estaChovendo || !temGuardaChuva);

    System.out.println(!(estaChovendo || !temGuardaChuva));

    }
}
