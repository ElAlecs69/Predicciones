/**
 * 
 */
package algoritmo;

import java.util.Random;

/**
 * 
 */
public class Dado implements Preguntable{

	private int numeroCaras;

    public Dado(int numeroCaras) {
        this.numeroCaras = numeroCaras;
    }

    @Override
    public String getRespuesta() {
        Random rand = new Random();
        return Integer.toString(rand.nextInt(numeroCaras) + 1);
    }
}
