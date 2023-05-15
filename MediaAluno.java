

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do usuário:");
		String nome;
		nome = teclado.next();
		System.out.println("Bem vindo(a) " + nome);

		
		Scanner sc = new Scanner(System.in);
		
		
	    double nota1 , nota2 , media;

	    System.out.println("Digite as notas:");
	    nota1 = sc.nextInt();
	    nota2 = sc.nextInt();
	    media = (nota1 + nota2)/2;		
	    System.out.println("A média do aluno é: " + media);
	    
	    if (media > 6) {
	    	System.out.println("Aluno Aprovado");
	    }
	    else {
	    	System.out.println("Aluno Reprovado");
			     
	    }

		sc.close();
	}
}
