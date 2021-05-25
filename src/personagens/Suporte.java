package personagens;

import equipamentos.IEquipamento;

public class Suporte extends Personagem {

	public Suporte(IEquipamento equipamento) {
		super(equipamento);
	}

	@Override
	public void acao() {
		System.out.println("Suporte está dando assistência");

	}

}
