package creators;

import equipamentos.Escudo;
import equipamentos.IEquipamento;
import personagens.IPersonagem;
import personagens.Tank;

public class TankFactory implements AbstractFactory {

	@Override
	public IPersonagem createPersonagem() {
		return new Tank(createEquipamento());
	}

	@Override
	public IEquipamento createEquipamento() {
		return new Escudo();
	}

}
