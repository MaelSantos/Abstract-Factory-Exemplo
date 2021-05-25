package creators;

import equipamentos.Cetro;
import equipamentos.IEquipamento;
import personagens.IPersonagem;
import personagens.Suporte;

public class SuporteFactory implements AbstractFactory {

	@Override
	public IPersonagem createPersonagem() {
		return new Suporte(createEquipamento());
	}

	@Override
	public IEquipamento createEquipamento() {
		return new Cetro();
	}

}
