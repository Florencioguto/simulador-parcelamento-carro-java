package jursParcelados;

import java.util.Scanner;

public class SimuladorDeParcelamentoDeCarro {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("Digite o valor do carro: ");
        double valorDoCarro = sca.nextDouble();

        int parcelasMax = (int) (valorDoCarro / 1000);

        if (parcelasMax < 1) {
            System.out.println("O carro não pode ser parcelado. Valor por parcela seria menor que R$1000.");
        } else {
            System.out.printf("O carro pode ser parcelado em até %d vezes.%n", parcelasMax);
            System.out.print("Deseja parcelar? (S/N): ");
            char resposta = sca.next().trim().toUpperCase().charAt(0);

            if (resposta == 'S') {
                System.out.printf("Digite a quantidade de parcelas desejada (1 a %d): ", parcelasMax);
                int qtdParcelas = sca.nextInt();

                if (qtdParcelas > 0 && qtdParcelas <= parcelasMax) {
                    double taxaJurosTotal = 0.14;
                    double valorTotalComJuros = valorDoCarro * (1 + taxaJurosTotal);
                    double valorParcela = valorTotalComJuros / qtdParcelas;

                    System.out.println("\n--- Detalhes do Parcelamento ---");
                    for (int i = 1; i <= qtdParcelas; i++) {
                        System.out.printf("Parcela %02d: R$ %.2f%n", i, valorParcela);
                    }
                    System.out.printf("Valor total com juros (14%%): R$ %.2f%n", valorTotalComJuros);
                    System.out.println("--------------------------------");

                } else {
                    System.out.println("Quantidade de parcelas inválida.");
                }

            } else if (resposta == 'N') {
                System.out.println("Compra cancelada ou finalizada sem parcelamento.");
            } else {
                System.out.println("Resposta inválida. Encerrando.");
            }
        }

        sca.close();
    }
}
