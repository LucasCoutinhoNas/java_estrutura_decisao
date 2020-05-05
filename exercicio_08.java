package trabalho;

import java.util.Scanner;

public class exercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String senha;
		
		Scanner leitor = new Scanner (System.in);
		
		 System.out.println( "Senha: " );
		 senha = leitor.next();
		 
		 if(senha.equals ("AEDB"))
		 System.out.println( "Acesso permitido" );
		 
		 else
	     System.out.print ( "Você não tem acesso ao sistema");
		
		
		
		
	}

}
