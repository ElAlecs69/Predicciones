/**
 * 
 */
package algoritmo;

import java.util.Random;

/**
 * 
 */
public class Bola8 implements Preguntable{
	
	private String[] predicciones;

    public Bola8(String[] predicciones) {
        this.predicciones = predicciones;
    }

    @Override
    public String getRespuesta() {
        Random rand = new Random();
        return predicciones[rand.nextInt(predicciones.length)];
    }

}
