1) 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Tabuada do " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

-----------------------------------------------------------------------------

2) import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		float salario;
		System.out.print("Digite o valor do seu salário: ");
		salario =  input.nextInt();
		
		System.out.print(salario + (salario*0.25)); 
	
	}	
}

------------------------------------------------------------------------------

3) import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		double notaAluno1, notaAluno2, notaAluno3, notaAluno4, media;
		String nome;
		
		System.out.println("Digite o nome do aluno: ");
		nome = input.next();
			System.out.print("Digite a nota do aluno: ");
		notaAluno1 =  input.nextDouble();
			System.out.println("Digite a nota do aluno: ");
		notaAluno2 =  input.nextDouble();
			System.out.println("Digite a nota do aluno: ");
		notaAluno3 =  input.nextDouble();
			System.out.println("Digite a nota do aluno: ");
		notaAluno4 =  input.nextDouble();
		
	
	    media = (notaAluno1 + notaAluno2 + notaAluno3 + notaAluno4) / 4;
	    
	    if(media >= 70){
	        System.out.println("Está aprovado! Com a média de " + media);
	    }else if(media <= 65){
	        System.out.println("Está de exame! Com a média de " + media);
	    }else{
	        System.out.println("Está reprovado! Com a média de " + media);
	    }
	    
	}	
}
