package trabalho;

import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  String nome1, nome2;
	      int x , y;


	        Scanner leitor = new Scanner(System.in);


	        System.out.println( "Digite o nome: " );
		    nome1 = leitor.next();
		    
		    System.out.println( "Digite a idade: " );
		    x = leitor.nextInt();
		
		    System.out.println( "Digite o nome: " );
		    nome2 = leitor.next();
		    
		    System.out.println( "Digite a idade: " );
		    y = leitor.nextInt();
		    
		    
		    if (x > y)
		
		    System.out.print(nome1+ ", " +x+ "anos");
		    
		    else
		    	
		    System.out.print(nome2+ ", " +y+ "anos");
		    
		    		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
