package trabalho;

import java.util.Scanner;

public class exercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double produto;
		double produto30;
		double produto45;
		
		Scanner leitor = new Scanner(System.in);
		

		System.out.printf( "Digite o valor do produto: " );
			produto = leitor.nextDouble();
			
			produto30 = (produto * 1.3);
			
			produto45 = (produto * 1.45);
			
			
		if ( produto > 20 )
			System.out.printf( "Valor do produto: " + produto30);
		
		
		else 
			System.out.printf( "Valor do produto: " + produto45);	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
