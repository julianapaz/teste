import java.util.Scanner;

public class Desafio1 {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String leitura;
		int numeroDeElementos=0;
		double valorMedio=0;
		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Digite os valores separados por espaço:");
		leitura = entrada.nextLine();
		entrada.close();
		
		int tam = leitura.length();
		leitura = leitura + " ";
		int i;
		String numero="0";
		int[] numeros= new int[tam];
		boolean negativo = false;
		int AlgarismosLidos=0;
				
		for(i=0;i<=tam;i++){
			if(leitura.charAt(i)=='-'){
				negativo = true;
				i++;}
			
			if(leitura.charAt(i)=='0' ||leitura.charAt(i)=='1' || leitura.charAt(i)=='2' || leitura.charAt(i)=='3' || leitura.charAt(i)=='4' || leitura.charAt(i)=='5' || leitura.charAt(i)=='6' || leitura.charAt(i)=='7' || leitura.charAt(i)=='8'  || leitura.charAt(i)=='9'){
				numero = numero+leitura.charAt(i);
				AlgarismosLidos++;
			}
			
			if(leitura.charAt(i)==' '){
				
				 if(AlgarismosLidos==0)
					continue;
				 else{
				 numeros[numeroDeElementos] = Integer.parseInt(numero);
			  	 if(negativo==true){
			  		 numeros[numeroDeElementos]=-numeros[numeroDeElementos];
					 negativo = false;}				
			    numeroDeElementos++;
				numero="0";
				AlgarismosLidos=0;}
		    }
		}
		

		int valorMaximo=numeros[0];
		int valorMinimo=numeros[0];
		double soma=0;
		System.out.println("Números lidos");
		for(i=0;i<numeroDeElementos;i++){
			System.out.print(numeros[i]+" | ");
			if(numeros[i]>valorMaximo)
					valorMaximo = numeros[i];
			if(numeros[i]<valorMinimo)
				valorMinimo = numeros[i];
			soma=soma+numeros[i];
			
		}
		
		valorMedio = soma/numeroDeElementos;
		System.out.println("\nValor minimo: "+valorMinimo);
		System.out.println("Valor máximo: "+valorMaximo);
		System.out.println("Número de elementos na sequencia: "+numeroDeElementos);
		System.out.printf("Valor médio: %.6f ",valorMedio);
		}				
	}
