package entidade;

import entidade.enums.Cargo;

public class Clt extends Funcionario {
	
	private double convenio;

	public Clt(String nome, double salario, Cargo cargo, double convenio) {
		super(nome, salario, cargo);
		this.convenio = convenio;
	}

	@Override
	public String toString() {
	return "Clt nome: " + nome + " salario: " + salario + " cargo: " + cargo + " convênio" + convenio + "]";
	}

	public void convenio(double convenio) {
		salario =- convenio;
	}
	
	public void receber() {
		salario =- salario * 0.10;
	}
	
}
