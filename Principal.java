/**
 * 
 */
package main;

import algoritmo.Bola8;
import algoritmo.Dado;
import algoritmo.DadoFiguras;
import algoritmo.GalletaDeLaFortuna;

/**
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] predicciones = {
	            "No todos los enamorados son novios, algunos son sólo amigos",
	            "Confiá en el tiempo suele dar dulces salidas a amargas dificultades",
	            "Si te caes 7 veces … levántate 8",
	            "Escucha la sabiduría de los ancianos",
	            "Mañana saldrá el sol",
	            "Sólo los ingenuos pretenden cambiar el pasado"
	        };

	        FabricaDeGalletas fabrica = new FabricaDeGalletas(predicciones);

	        Dado dado26Caras = new Dado(26);

	        for (int i = 0; i < 5; i++) {
	            GalletaDeLaFortuna galleta = fabrica.fabricarGalleta();
	            System.out.println("Galleta " + (i + 1) + ": " + galleta.getRespuesta());
	        }

	        String[] figurasMamiferos = {"León", "Elefante", "Tigre", "Oso", "Jirafa"};
	        DadoFiguras dadoFiguras = new DadoFiguras(figurasMamiferos);

	        System.out.println("Resultado del dado normal (1): " + dado26Caras.getRespuesta());
	        System.out.println("Resultado del dado normal (2): " + dado26Caras.getRespuesta());

	        for (int i = 0; i < 4; i++) {
	            System.out.println("Resultado del dado de figuras (" + (i + 1) + "): " + dadoFiguras.getRespuesta());
	        }

	        String[] respuestasBolaOcho = {
	            " es cierto",
	            " es decididamente así",
	            " sin lugar a dudas",
	            " sí, definitivamente",
	            " puedes confiar en ello",
	            " como yo lo veo sí",
	            " lo más probable",
	            " perspectiva buena",
	            " sí",
	            " las señales apuntan a que sí",
	            " Respuesta confusa, vuelve a intertarlo",
	            " vuelve a preguntar más tarde",
	            " mejor no decirte ahora",
	            " no se puede predecir ahora",
	            " concéntrate y vuelve a preguntar",
	            " No cuentes con ello",
	            " mi respuesta es no",
	            " mis fuentes dicen que no",
	            " las perspectivas no son muy buenas",
	            " muy dudoso"
	            
	        };
	        Bola8 bolaOcho = new Bola8(respuestasBolaOcho);
	        System.out.println("Respuesta de la bola 8:" + bolaOcho.getRespuesta());
	}

}
