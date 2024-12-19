package main;

import java.util.Random;

import algoritmo.GalletaDeLaFortuna;

public class FabricaDeGalletas {

	
	private String[] fortunes;

    public FabricaDeGalletas(String[] fortunes) {
        this.fortunes = fortunes;
    }

    public GalletaDeLaFortuna fabricarGalleta() {
        Random rand = new Random();
        return new GalletaDeLaFortuna(fortunes[rand.nextInt(fortunes.length)]);
        
    }
}
