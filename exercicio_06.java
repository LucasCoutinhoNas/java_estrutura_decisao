package trabalho;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  float nota1, nota2, nota3, soma, media;



	        Scanner leitor = new Scanner(System.in);

	        System.out.printf( "Primeira nota: " );
	        nota1 = leitor.nextFloat(); 


	        System.out.printf( "Segunda nota: " );
	        nota2 = leitor.nextFloat(); 


	        System.out.printf( "Terceira nota: " );
	        nota3 = leitor.nextFloat(); 


	        soma = (nota1 * 2) + (nota2 * 3) + (nota3 * 5);
	        media = soma / 10 ;

	        System.out.printf( "Média: " +media + "\n");

	        if(media >= 7)
	            System.out.println( "Aprovado" );

	        else
	            System.out.println( "Reprovado" );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
