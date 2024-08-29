package principal;

import java.util.Scanner;

import entidade.Clt;
import entidade.Funcionario;
import entidade.Pj;
import entidade.enums.Cargo;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Scanner scn1 = new Scanner(System.in);

		System.out.println("Vamos começar. Digite o nome do funcionario: ");
		String nome = scn.next().toLowerCase();

		System.out.println("Digite o salário do funcionario: ");
		double salario = scn.nextDouble();

		System.out.println("Qual o cargo do funcionario? ");
		System.out.println("1 - DEV");
		System.out.println("2 - CONTADOR");
		System.out.println("3 - PROFESSOR");
		int cargo = scn.nextInt();

		System.out.println("Qual o tipo de Funcionario? ");
		System.out.println("1 - Pj");
		System.out.println("2 - Clt");
		int tipo = scn1.nextInt();

		switch (tipo) {

		case 1:
			System.out.println("Qual o valor adicional? ");
			double adicional = scn1.nextDouble();
			switch (cargo) {

			case 1:
				Pj x = new Pj(nome, salario, Cargo.DEV, adicional);
				System.out.println(x);
				break;

			case 2:
				Pj x1 = new Pj(nome, salario, Cargo.CONTADOR, adicional);
				System.out.println(x1);
				break;

			default:
				Pj x2 = new Pj(nome, salario, Cargo.PROFESSOR, adicional);
				System.out.println(x2);
				break;
			}
		default:
			System.out.println("Digite o valor do convênio");
			double convenio = scn1.nextDouble();
			switch (cargo) {

			case 1:
				Clt x = new Clt(nome, salario, Cargo.DEV, convenio);
				System.out.println(x);
				break;

			case 2:
				Clt x1 = new Clt(nome, salario, Cargo.CONTADOR, convenio);
				System.out.println(x1);
				break;

			default:
				Clt x2 = new Clt(nome, salario, Cargo.PROFESSOR, convenio);
				System.out.println(x2);
				break;
			}
		}

		System.out.println();

		scn.close();
		scn1.close();
	}

}
