import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.print("Informe o primeiro número: 15 ");
            int inicio = terminal.nextInt();
            System.out.print("Informe o segundo número: 20 ");
            int fim = terminal.nextInt();

            contar(inicio, fim);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de fornecer números inteiros.");
        } finally {
            terminal.close();
        }
    }

    static void contar(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio >= fim) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
        }

        System.out.println("Contagem de 15 " + inicio + " até 20 " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }
}
