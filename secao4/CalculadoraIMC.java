package secao4;

import java.util.Scanner;

public class CalculadoraIMC {
    
    public static void main(String[] args) {
        
// 1 - Pedir peso em kg
// 2 - Pedir altura em m
// 3 - Calcular IMC => peso / (altura * altura)
// 4 - Exibir classificação
// < 18.5 => Abaixo do peso
// >= 18.5 e <= 24.9 => Peso normal
// >= 25 e < 29.9 => Sobrepeso
// Mais que isso: obesidade

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu peso em kg?");

        double peso = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Qual a sua altura em m?");

        double altura = scanner.nextDouble();

        scanner.nextLine();

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) 
        {
            System.out.println("IMC = " + IMC + " -> Abaixo do Peso");    
        }
        else if (IMC >= 18.5 && IMC <= 24.9)
        {
            System.out.println("IMC = " + IMC + " -> Peso Normal");
        }
        else if (IMC >= 25 && IMC <= 29.9)
        {
            System.out.println("IMC = " + IMC + " -> Sobrepeso");
        }
        else
        {
            System.out.println("IMC = " + IMC + " -> Obesidade");
        }

        scanner.close();
    } 
}
