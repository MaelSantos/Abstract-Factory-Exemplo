package personagens;

import equipamentos.IEquipamento;

public class Atirador extends Personagem {

	public Atirador(IEquipamento equipamento) {
		super(equipamento);
	}

	@Override
	public void acao() {
		System.out.println("Atirador está atacando");

	}

}
