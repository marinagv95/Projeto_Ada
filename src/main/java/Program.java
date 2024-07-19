import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o salário bruto do funcionário " + (i + 1) + ": R$ ");

            double salarioBruto = sc.nextDouble();

            double descontoINSS = calcularDescontoINSS(salarioBruto);
            double descontoImpostoRenda = calcularDescontoImpostoRenda(salarioBruto);
            double salarioLiquido = salarioBruto - descontoINSS - descontoImpostoRenda;

            System.out.println("\nDetalhes do Funcionário " + (i + 1) + ":");
            System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
            System.out.printf("Desconto INSS: R$ %.2f\n", descontoINSS);
            System.out.printf("Desconto Imposto de Renda: R$ %.2f\n", descontoImpostoRenda);
            System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
            System.out.println();
        }
        sc.close();
    }

    private static double calcularDescontoINSS(double salarioBruto) {
        if (salarioBruto <= 1212) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            return salarioBruto * 0.09;
        } else if (salarioBruto <= 3641.03) {
            return salarioBruto * 0.12;
        } else if (salarioBruto <= 7087.22) {
            return salarioBruto * 0.14;
        } else {
            return salarioBruto * 0.14;
        }
    }

    private static double calcularDescontoImpostoRenda(double salarioBruto) {
        if (salarioBruto <= 1903.98) {
            return 0;
        } else if (salarioBruto <= 2826.65) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 3751.05) {
            return salarioBruto * 0.15;
        } else if (salarioBruto <= 4664.68) {
            return salarioBruto * 0.225;
        } else {
            return salarioBruto * 0.275;
        }
    }
}





