package questao_1;

import questao_2.ListaLotadaException;

public class AppLuna {

	public static void main(String[] args) throws ListaLotadaException {

		LunaList luna = new LunaList();

		for (int i = 0; i < 30; i++) {
			luna.inserir(i);
			System.out.println("Victor " + i);

		}
		
		System.out.println(luna.getTamanho());

	}

}
