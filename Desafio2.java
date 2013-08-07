import java.util.Scanner;


public class PrincipalDesafio2 {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int[] notas = {100,50,20,10};
		int[] qtdNotas = {2,2,4,10};
		
	
		
		int resto=0;
		int i;
		int tam=notas.length;
		int valorTotal=0;
		int qtdNotasEntrega=0;
			
		
		
		for(i=0;i<tam;i++){
			valorTotal = valorTotal+(notas[i]*qtdNotas[i]);			
			System.out.print("R$"+notas[i]+": "+qtdNotas[i]+" notas | ");
		
		}
		int saque = valorTotal + 1;
		
		while(saque>valorTotal){
			System.out.println("\n\nValor disponivel para saque R$"+valorTotal);
			System.out.println("\nDigite o valor de saque: ");
			saque = entrada.nextInt();
		}
				
		
		
		
		entrada.close();
		
		
		for(i=0;i<tam;i++){
			if(saque>=notas[i]){
				resto = (saque%notas[i]);
				qtdNotasEntrega = (saque-resto)/notas[i];
				if(qtdNotasEntrega<=qtdNotas[i]){
					qtdNotas[i]= qtdNotas[i]-qtdNotasEntrega;		
					System.out.println("Entregar "+qtdNotasEntrega +" notas de R$"+notas[i]);
					saque=resto;					
				}
				else{
					qtdNotasEntrega = qtdNotasEntrega - qtdNotas[i];
					System.out.println("Entregar "+qtdNotas[i]+" notas de R$"+notas[i]);
					qtdNotas[i]=0;
					saque = (qtdNotasEntrega*notas[i])+resto;
					
				}
				
				}
		}	
	}
}

		
			
			
			
