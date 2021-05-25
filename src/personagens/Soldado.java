package personagens;

import equipamentos.IEquipamento;

public class Soldado extends Personagem {

	public Soldado(IEquipamento equipamento) {
		super(equipamento);
	}

	@Override
	public void acao() {
		System.out.println("Soldado está atacando");

	}

}
