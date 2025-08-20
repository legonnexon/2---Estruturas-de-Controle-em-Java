import java.util.Scanner;

public class Atividades {
    public void primeiraAtividade() {
            Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero de 1 - 10:");
        var numero = scanner.nextInt();
        
        System.out.println("=======Mega Tabuada 2000======");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s x %s : %s\n", numero, (i+1), numero*(i+1));
        }
    }

    public void segundaAtividade() {
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
    }

    public void terceiraAtividade() {
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

    public void quartaAtividade() {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Informe um numero base:");
        var base = scanner.nextDouble();

        do {
            System.out.println("Informe um numero maior que a base:");
            numero = scanner.nextInt();            

            System.out.println(numero % base);

            if (numero % base == 0) {
                System.out.println("Numero divisiavel de zero!");
                break;
            } else {
                if (numero < base) {
                    System.out.println("Numero menor que a base :(");
                } else if (numero % base != 0) {
                    System.out.println("Resto da divisao nao e 0 :(");
                }
            }
        } while (true);
    }
}
