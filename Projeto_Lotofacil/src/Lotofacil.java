import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Lotofacil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int escolha;

        do{
            System.out.println("**************************");
            System.out.printf("Menu Lotofácil");
            System.out.println("\n");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A a Z");
            System.out.println("3) Apostar em ímpar ou par");
            System.out.println("0) Sair");
            System.out.println("**************************");
            escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                aposta1();
                break;
            case 2:
                aposta2();S
                break;
            case 3:
                aposta3();
                break;
            case 0:
                System.out.println("Programa Encerrado!");
                break;
            default:
                System.out.println("Opção Inválida.");
           }

        } while (escolha !=0);

    }
    public static void aposta1() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Você selecionou a aposta de 0 a 100.");
        System.out.println("Agora, digite o número que deseja apostar de 0 a 100:");
        int apostaNumero = scanner.nextInt();

            if (apostaNumero < 0 || apostaNumero >100) {
                System.out.println("Apsota Inválida.");
            } else {                                            //Essa biblioteca Random gera o valor aleatorio do seu
                int numeroSorteado = random.nextInt(101);//paramentro -1, por isso coloquei 101, pra gerar 0 a 100

                System.out.println("Número do sorteio: " + numeroSorteado);

                if (apostaNumero == numeroSorteado) {
                    System.out.println("Você ganhou R$1000,00 reais!!!");
                } else {
                    System.out.println("Que pena! O número sorteado foi: " + numeroSorteado);
                }

            }
    }

    public static void aposta2() {
        System.out.println("Você selecionou a aposta de A a Z.");
        System.out.println("Agora, digite uma letra de A a Z: ");

        int entrada = 0;
        try {
            entrada = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        char apostaLetra = (char) entrada;

        //aqui converto as letras para mauiscula para serem lidas iguais
        apostaLetra = Character.toUpperCase(apostaLetra);

            if (!Character.isLetter(apostaLetra)){ //verifica se a entrada digitada é uma letra válida
                System.out.println("Aposta Inválida");
                return;
            }

        char letraPremiada = 'A';
        if (apostaLetra == letraPremiada){
            System.out.println("Você ganhou R$500,00 reais!!!");
        }else {
            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
        }


    }
    public static void aposta3 () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você selecionou a apostra de Ímpar ou par.");
        System.out.println("Agora, digite qualquer número inteiro: ");
        int numeroImparPar = scanner.nextInt();

        if (numeroImparPar %2 == 0) { //%2 analisa o resto de uma divisão feita por 2, se o resto for 0 = par
            System.out.println("Você ganhou R$ 100,00 reais!!!");
        } else {
            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
        }

    }

}


