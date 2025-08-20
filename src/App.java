/*
 * 
1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;


2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:  
    

3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;


4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
        
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        var atividades = new Atividades();
        int choice = -1;
        while (true) {
            System.out.println("=========BEM VINDO=========");
            System.out.println("1: Primeira atividade");
            System.out.println("2: Segunda atividade");
            System.out.println("3: Terceira atividade");
            System.out.println("4: Quarta atividade");
            System.out.println("0: Sair");
            System.out.println("===========================");
            
            choice = scanner.nextInt();

            if (choice != 0) {
                switch (choice) {
                    case 1:
                        atividades.primeiraAtividade();
                        break;
                    case 2:
                        atividades.segundaAtividade();
                        break;
                    case 3:
                        atividades.terceiraAtividade();
                        break;
                    case 4:
                        atividades.quartaAtividade();
                        break;
                    default:
                        break;
                }
            } else {
                break;
            }
        }
        scanner.close();
    }
}
