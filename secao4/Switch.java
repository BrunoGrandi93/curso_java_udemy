package secao4;

public class Switch {

    public static void main(String[] args) {
        
        //11 - Switch

        //Para validar dia de semana baseado em número
        //1 = Domingo
        //7 = Sábado

        int diaDaSemana = 7;

        switch(diaDaSemana)  {
            
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

        }

        //12 - Default

        //default é o else do switch

        int n = 10;

        switch (n) {
            case 1:
                System.out.println("É 1");
                break;
            case 2:
                System.out.println("É 2");
                break;
            default:
                System.out.println("Número não encontrado");
            break;
        }

        }
    }

