package br.com.exercicios.exercicio3;


public class notas {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno ("Lucas", "Analise de sistemas", 123456 , 3 , 30 ,30 ,30);
		System.out.println(aluno1.avaliarAluno());
		System.out.println(aluno1.avaliarAluno());
		System.out.println(aluno1.avaliarRecuperacao());
		aluno1.alteraNotaAE(70);
		System.out.println("Alterar nota da prova");
		System.out.println(aluno1.avaliarRecuperacao());
		
	}

}

