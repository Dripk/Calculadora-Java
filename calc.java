import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora Simples em Java");
            System.out.println("---------------------------");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma operação (0-4): ");

            int opcao = scanner.nextInt();

            // Se a opção for 0, encerra o programa
            if (opcao == 0) {
                System.out.println("Calculadora encerrada.");
                break;
            }

            // Verifica se a opção é válida (1-4)
            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = somar(num1, num2);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Erro: Divisão por zero!");
                            continue; // Volta ao início do loop
                        }
                        resultado = dividir(num1, num2);
                        break;
                }

                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}