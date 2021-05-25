package personagens;

import equipamentos.IEquipamento;

public abstract class Personagem implements IPersonagem {

	protected IEquipamento equipamento;

	public Personagem(IEquipamento equipamento) {
		this.equipamento = equipamento;
	}

	@Override
	public void usarArma() {
		equipamento.acao();
	}

}
