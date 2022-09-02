package br.com.exercicios.exercicio3;

public class Aluno {
	
	private String nome, curso;
	private int matricula , periodo;
	private double notaAV1;
	private double notaAV2;
	private double notaAE;
	
	
	Aluno (String nome, String curso, int matricula , int periodo , double notaAV1, double notaAV2 , double notaAE){
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.periodo = periodo;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
	}
	
	public void alteraNotaAV1 (double nota) {
		this.notaAV1 = nota;
	}
	public void alteraNotaAV2 (double nota) {
		this.notaAV2 = nota;
	}
	
	public void alteraNotaAE (double nota) {
		this.notaAE = nota;
	}
	
	public String avaliarAluno (){
		
		if ((this.notaAV1 + this.notaAV2) >= 60) 
		
		    return "Aprovado";
		else
			return "Recuperacao";
		
		
	}
	
	public String avaliarRecuperacao () {
		if ((this.notaAV1 + this.notaAV2 + this.notaAE /2) >=60)
			return "Aprovado";
		else 
			return "Reprovado"; 
		
	}

}
