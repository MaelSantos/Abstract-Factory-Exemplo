package app;

import creators.AbstractFactory;
import creators.AssassinoFactory;
import creators.AtiradorFactory;
import creators.MagoFactory;
import creators.SoldadoFactory;
import creators.SuporteFactory;
import creators.TankFactory;
import personagens.IPersonagem;

public class App {

	public static void main(String[] args) {
		
		AbstractFactory factory = new MagoFactory();
//		AbstractFactory factory = new SuporteFactory();
//		AbstractFactory factory = new SoldadoFactory();
//		AbstractFactory factory = new AssassinoFactory();
//		AbstractFactory factory = new AtiradorFactory();
//		AbstractFactory factory = new TankFactory();

		IPersonagem personagem = factory.createPersonagem();

		personagem.acao();
		personagem.usarArma();
	}

}
