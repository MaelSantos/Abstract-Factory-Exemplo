package creators;

import equipamentos.Cajado;
import equipamentos.IEquipamento;
import personagens.IPersonagem;
import personagens.Mago;

public class MagoFactory implements AbstractFactory {

	@Override
	public IPersonagem createPersonagem() {
		return new Mago(createEquipamento());
	}

	@Override
	public IEquipamento createEquipamento() {
		return new Cajado();
	}

}
