package personagens;

import equipamentos.IEquipamento;

public class Mago extends Personagem {

	public Mago(IEquipamento equipamento) {
		super(equipamento);
	}

	@Override
	public void acao() {
		System.out.println("Mago está dando stun");

	}

}
