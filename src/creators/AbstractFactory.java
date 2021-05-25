package creators;

import equipamentos.IEquipamento;
import personagens.IPersonagem;

public interface AbstractFactory {

	public IPersonagem createPersonagem();
	
	public IEquipamento createEquipamento();
	
}
