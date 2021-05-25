package creators;

import equipamentos.Adaga;
import equipamentos.IEquipamento;
import personagens.IPersonagem;
import personagens.Assassino;

public class AssassinoFactory implements AbstractFactory {

	@Override
	public IPersonagem createPersonagem() {
		return new Assassino(createEquipamento());
	}

	@Override
	public IEquipamento createEquipamento() {
		return new Adaga();
	}

}
