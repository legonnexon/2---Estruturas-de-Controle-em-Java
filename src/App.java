/*
 * 
1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe um numero de 1 - 10:");
    var numero = scanner.nextInt();
    
    System.out.println("=======Mega Tabuada 2000======");
    for (int i = 0; i < 10; i++) {
        System.out.printf("%s x %s : %s\n", numero, (i+1), numero*(i+1));
    }

2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe sua altura:");
    var altura = scanner.nextFloat();

    System.out.print("Informe seu peso:");
    var peso = scanner.nextFloat();

    var IMC = peso/(altura * altura);

    if (IMC <= 18.5) {
        System.out.println("Abaixo do peso");
    } else if (IMC >= 18.6 && IMC <= 24.9) {
        System.out.println("Peso ideal");
    } else if (IMC >= 25.0 && IMC <= 29.9) {
        System.out.println("Levemente acima do peso");
    } else if (IMC >= 30.0 && IMC <= 34.9) {
        System.out.println("Obesidade Grau I");
    } else if (IMC >= 35.0 && IMC <= 39.9) {
        System.out.println("Obesidade Grau II (Severa)");
    } else if (IMC >= 40.0) {
        System.out.println("Obesidade III (Mórbida)");
    } else {
        System.out.println("Valor inválido");
    }

3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

4Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int menorNumero = 0;
        int maiorNumero = 0;
        String escolha = "";

        System.out.println("Bem vindo! Ao Seus Pares e Impares Preferidos Inverso 2000!");
        System.out.println("Tambem conhecido como SPIPI 2000");

        do {
            System.out.print("Informe o menor numero: ");
            menorNumero = scanner.nextInt();

            System.out.print("Informe o maior numero: ");
            maiorNumero = scanner.nextInt();
            
            System.out.print("\n");

            if (maiorNumero > menorNumero) {
                System.out.println("Números válidos. Vamos proseguir!\n");
                break;
            } else {
                System.out.println("O maior tem que ser maior >:C tente novamente.");
            }
        } while (true);

        System.out.println("Escolha entre Par ou Impar:");
        while (true) {
            escolha = scanner.nextLine().toUpperCase();
            if ((escolha.equals("PAR")) || (escolha.equals("IMPAR"))) {break;}
        }
        System.out.printf("Legal! Sua escolha foi %s\n\n", escolha);

        System.out.println("========Contagem Inversa=========");
        if (escolha.equals("PAR")) {
            for (int i = maiorNumero; i >= menorNumero; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = maiorNumero; i >= menorNumero; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        
    }
}
