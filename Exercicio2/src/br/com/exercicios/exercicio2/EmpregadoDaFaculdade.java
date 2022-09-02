package br.com.exercicios.exercicio2;

public class EmpregadoDaFaculdade {
	
	private String nome;
	private double salario;
	private int horasAula;
	
	EmpregadoDaFaculdade (String nome, double salario,int horasAula){
		this.nome = nome;
		this.salario = salario;
		this.horasAula = horasAula;
	}
	
	double getGastos(){
	return this.salario + 40*horasAula ;
	}
	
	String getInfo(){
	return "nome: " + this.nome + " com salario: " + this.getGastos();
	
	}

}
