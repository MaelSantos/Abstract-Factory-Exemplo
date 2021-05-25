package app;

import creators.AbstractFactory;
import creators.MagoFactory;
import personagens.IPersonagem;

public class App {

	public static void main(String[] args) {
		AbstractFactory factory = new MagoFactory();

		IPersonagem personagem = factory.createPersonagem();

		personagem.acao();
		personagem.usarArma();
	}

}
