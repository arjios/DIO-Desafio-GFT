package dio.gft.banco.repositories;

import dio.gft.banco.entities.Conta;

public interface MovimentarConta {
	
	Conta Deposito(Conta conta, Double valor);
	
	Conta Retirada(Conta conta, Double valor);

	Conta Transferencia(Conta contaOrigem, Conta contaDestino, Double valor);
	
}
