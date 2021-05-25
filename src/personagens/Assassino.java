package personagens;

import equipamentos.IEquipamento;

class Assassino extends Personagem {

	public Assassino(IEquipamento equipamento) {
		super(equipamento);
	}

	@Override
	public void acao() {
		System.out.println("Assassino está matando");

	}

}