package creators;

import equipamentos.Espada;
import equipamentos.IEquipamento;
import personagens.IPersonagem;
import personagens.Soldado;

public class SoldadoFactory implements AbstractFactory {

	@Override
	public IPersonagem createPersonagem() {
		return new Soldado(createEquipamento());
	}

	@Override
	public IEquipamento createEquipamento() {
		return new Espada();
	}

}
