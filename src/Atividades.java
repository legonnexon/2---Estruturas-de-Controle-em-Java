import java.util.Scanner;

public class Atividades {
    public void primeiraAtividade() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a MEGAAAA Tabuada Suprema!");
        System.out.println("A onde temos as melhores do mundo!");
        System.out.print("Comece informando um numero de 1 a 10: ");
        var numero = scanner.nextInt();
        
        System.out.println("=======Mega Tabuada 2000======");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s x %s : %s\n", numero, (i+1), numero*(i+1));
        }
        System.out.println("==============================");
    }

    public void segundaAtividade() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seeeejaa bem vindo! Ao programa IMC SUPREMO 5000!");
        System.out.println("Avaliaremos seu peso e altura para descobrir seu I. C. M!");
        System.out.print("Comece informando sua altura em metros (ex: 1,70): ");
        var altura = scanner.nextFloat();

        System.out.printf("\nEntao voce tem %s de altura, legal!\n", altura);
        System.out.print("Se poder informe seu peso: ");
        var peso = scanner.nextFloat();

        System.out.println("\nPelas informacoes recebidas. Irei. avaliar seu ICM!");
        System.out.println("IMC sendo Indice de Massa Corporal!");
        var IMC = peso/(altura * altura);
        
        System.out.println("Depois de um ardo processo e muitas contas!");
        System.out.printf("\nO seu IMC deu...: ");
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
        System.out.println("Isso e um adeus ate a proxima!");
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

        System.out.println("Bem vindo ao programa mais badalado do INTERNET!");
        System.out.println("Conhecido como Deu 0 Ih Agora!");
        System.out.println("Analisaremos os numeros e veremos se sobrara 0 na divisao!\n");
        System.out.println("Comece colocando o numero base: ");
        var base = scanner.nextDouble();

        while (true) {
            System.out.println("Agora um numero maior que a base: ");
            numero = scanner.nextInt(); 

            if (numero < base) {
                System.out.println("Vamos la. Tem que ser um numero MAIOR.");
            } else {
                break;
            }  
        }
        
        System.out.printf("CERTO! Agora temos um numero base de %s\n", base);
        System.out.printf("e o numero que sera dividido em multiplas partes %s\n", numero);
        System.out.println("nenhum numero foi machucado no processo\n");
   
        if (numero % base == 0) {
            System.out.println("O resultado da divisao foi de 0 (zero)!");
        } else {
            System.out.println("O resultado da divisao nao foi 0 (zero)!");
        }

        System.out.println("Parabens! E ate a proxima...");
    }
}
