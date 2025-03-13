package secao4;

public class Condicionais2 {

    public static void main(String[] args) {
        
        //1 - Condicionais ternárias

        int n = 5;

        // CONDIÇÃO X > 5 ? EXPRESSÃO SE TRUE "OK" : "EXPRESSÃO SE FALSE "NÃO OK";
        String resultado = (n % 2 == 0) ? "PAR": "IMPAR";

        System.out.println(resultado);

        //2 - IF e ELSE aninhados/encadeados

        int idade = 26;
        boolean temCarteira = true;

        if (idade >= 18) {

            if(temCarteira) {
                System.out.println("Pode dirigir");
            }
            else
            {
                System.out.println("Precisa ter a habilitação para digirir");
            }
        } 
        else
        { 
            System.out.println("Você não pode dirigir");
        }

        //3- Precedência de operadores lógicos
        boolean a = true;
        boolean b = false;
        boolean c = true;

        //True AND False OR True -> False OR True -> True
        boolean resultado2 = a && b || c;

        System.out.println(resultado2);

        //True OR False AND True -> True AND True -> True
        boolean resultado3 = a || b && c;

        System.out.println(resultado3);

        //NOT (True OR False) AND True -> NOT(True) AND True -> False AND True -> False
        boolean resultado4 = !(a || b) && c;

        System.out.println(resultado4);

        //(NOT True OR False) AND True -> (False OR False) AND True -> False AND True -> False
        boolean resultado5 = (!a || b) && c;

        System.out.println(resultado5);

    }
    
}
