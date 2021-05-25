package creators;

import equipamentos.Arco;
import equipamentos.IEquipamento;
import personagens.Atirador;
import personagens.IPersonagem;

public class AtiradorFactory implements AbstractFactory {

	@Override
	public IPersonagem createPersonagem() {
		return new Atirador(createEquipamento());
	}

	@Override
	public IEquipamento createEquipamento() {
		return new Arco();
	}

}
