package entidade;

import entidade.enums.Cargo;

public class Pj extends Funcionario {

	private double adicional;
	
	public Pj(String nome, double salario, Cargo cargo, double adicional) {
		super(nome, salario, cargo);
		this.adicional= adicional;
		}


	public void adicional(double adicional) {
		salario = (salario * 0.10) + adicional;
	}

	@Override
	public String toString() {
		return "Pj nome: " + nome + " Salario total: " + salario + " cargo: " + cargo + " adicional: " + adicional + " ]";
	}
	
	
	
}
