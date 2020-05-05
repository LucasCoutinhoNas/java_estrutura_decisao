package trabalho;

public class exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double altura, masculino, feminino;
		String sexo;
		
		Scanner leitor = new Scanner(System.in);
		
		
		
		System.out.printf( "Informe seu Sexo : [M] ou [F]: " );
		sexo = leitor.next();

		System.out.printf( "Informe sua altura: x,x. " );
		altura = leitor.nextDouble();
		
		
		masculino = ((72.7 * altura) - 58.0);
		feminino = ((62.1 * altura) - 44.7);
			
        
		if ( sexo.equals("M"))
			System.out.printf( "Masculino, peso ideal:" +masculino );
		
		else
			System.out.printf("Feminino, peso ideal:" +feminino);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
