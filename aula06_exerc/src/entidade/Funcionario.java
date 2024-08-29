package entidade;

import entidade.enums.Cargo;

public class Funcionario {

	protected String nome;
	protected double salario;
	protected Cargo cargo;
	
	public Funcionario(String nome, double salario, Cargo cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	
	public void convenio(double convenio) {
		salario =- convenio;
	}
	
	public void adicional(double adicional) {
		salario =+ adicional;
	}


	public void receber() {
		salario =- salario * 0.10;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + "]";
	}

	
}
