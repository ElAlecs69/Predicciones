/**
 * 
 */
package algoritmo;

import java.util.Random;

/**
 * 
 */
public class DadoFiguras implements Preguntable{
	
	private String[] figuras;

    public DadoFiguras(String[] figuras) {
        super();
        this.figuras = figuras;
    }

    @Override
    public String getRespuesta() {
        Random rand = new Random();
        return figuras[rand.nextInt(figuras.length)];
    }

}
