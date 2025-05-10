package conversordemoeda;

import java.io.IOException;
import java.util.Scanner;

import conversordemoeda.controller.MoedaController;

public class ConversorDeMoedaMain {

    public static void main(String[] args) throws IOException, InterruptedException {

	MoedaController moedaController = new MoedaController();

	Scanner scanner = new Scanner(System.in);

	int opcao = 0;
	double valor = 0;

	while (true) {

	    System.out.println("""
	    	________________________________________________
	    		Escolha uma das opções

	    		1 - Dolar para Real Brasileiro
	    		2 - Real Brasileiro para Dolar
	    		3 - Iene para Real Basileiro
	    		4 - Real Basileiro para Iene
	    		5 - Euro para Real Barileiro
	    		6 - Real Brasileiro para Euro
	    		0 - Para sair do Sistema
	    	________________________________________________
	    	""");

	    System.out.print("Opção: ");
	    opcao = scanner.nextInt();

	    if (opcao == 0) {
		System.out.println("\nPrograma Finalizado...");
		scanner.close();
		System.exit(0);
	    }

	    switch (opcao) {
	    case 1:
		System.out.print("Valor a ser convertido: ");
		valor = scanner.nextDouble();
		moedaController.getSaidaFormatada("USD", "BRL", valor);
		break;

	    case 2:
		System.out.print("Valor a ser convertido: ");
		valor = scanner.nextDouble();
		moedaController.getSaidaFormatada("BRL", "USD", valor);
		break;

	    case 3:
		System.out.print("Valor a ser convertido: ");
		valor = scanner.nextDouble();
		moedaController.getSaidaFormatada("JPY", "BRL", valor);
		break;

	    case 4:
		System.out.print("Valor a ser convertido: ");
		valor = scanner.nextDouble();
		moedaController.getSaidaFormatada("BRL", "JPY", valor);
		break;

	    case 5:
		System.out.print("Valor a ser convertido: ");
		valor = scanner.nextDouble();
		moedaController.getSaidaFormatada("EUR", "BRL", valor);
		break;

	    case 6:
		System.out.print("Valor a ser convertido: ");
		valor = scanner.nextDouble();
		moedaController.getSaidaFormatada("BRL", "EUR", valor);
		break;

	    default:
		System.out.println("Valor digitado é invalido!");
		break;
	    }
	}
    }
}
