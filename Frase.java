package desafio;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Frase {
public static void main(String[] args) {
	 String frase = "O codigo estava muito bem escrito.";
	 String[] palavras = frase.split(" ");
	 //lista para armazenar as palavras e os tamanho
	 List<PalavraTamanho> palavrasTamanho = new ArrayList<>(); //é 
	 //aqui preenche a lista com as palavras e seu tamanho
	 for (String palavra : palavras) {
		 //length é o metodo responsavel por contar os caracteres 
         palavrasTamanho.add(new PalavraTamanho(palavra, palavra.length()));
     }
	 //aqui vai ordenar a lista do menor para o maior
	 palavrasTamanho.sort(Comparator.comparingInt(PalavraTamanho::getTamanho));
	 //Stringbuilder permite construção eficiente de String modificaveis 
	 StringBuilder fraseOrdenada = new StringBuilder();
	 //frase ordenada com base no tamanho das palavras
	 for (PalavraTamanho pt : palavrasTamanho) {
         fraseOrdenada.append(pt.getPalavra()).append(" ");
     }
	 System.out.println(fraseOrdenada.toString().trim()); 
}
static class PalavraTamanho{//responsavel por armazenar cada palavra e tamanho
	private String palavra;
	private int tamanho;
	public PalavraTamanho(String palavra, int tamanho) {
        this.palavra = palavra;
        this.tamanho = tamanho;
    }
	public String getPalavra() {
        return palavra;
    }

    public int getTamanho() {
        return tamanho;
    }
}
}


