package personagens;

import equipamentos.IEquipamento;

public class Tank extends Personagem {

	public Tank(IEquipamento equipamento) {
		super(equipamento);
	}

	@Override
	public void acao() {
		System.out.println("Tank está defendendo");

	}

}
