import javax.swing.JOptionPane;


public class Main {

  /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		String entrada;
		
		entrada = JOptionPane.showInputDialog(null, "Digite o tamanho do vetor: ");
		VetorInteiros vetor = new VetorInteiros(Integer.parseInt(entrada));
		
		vetor.preencher();
		vetor.tamanhoVetor();
		vetor.zerar(3);
		vetor.mostra();		
		
		//desafio
		entrada = JOptionPane.showInputDialog(null, "Digite o tamanho do vetor para o desafio: ");
		VetorInteiros vetorDesafio = new VetorInteiros(Integer.parseInt(entrada));
		vetorDesafio.preencher();
		
		vetor.vetoresIguais(vetorDesafio);
		
		
		

	}

}
