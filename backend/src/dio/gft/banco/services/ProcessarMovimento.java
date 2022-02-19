package dio.gft.banco.services;

import dio.gft.banco.entities.Conta;
import dio.gft.banco.repositories.MovimentarConta;
	
public class ProcessarMovimento implements MovimentarConta {
	
	@Override
	public Conta Deposito(Conta conta, Double valor) {
		conta.setSaldo(conta.getSaldo() + valor);
		System.out.println("Transa��o.: Deposito          Valor.: +" + valor);
		return conta;
	}
	
	@Override
	public Conta Retirada(Conta conta, Double valor) {
		if(conta.getSaldo() >= valor) {
			conta.setSaldo(conta.getSaldo() - valor);
			System.out.println("Transa��o.: Retirada          Valor.: -" + valor);
		}
		else {
			System.out.println("Retirada n�o permitida: Saldo insuficiente");
		}
		return conta;
	}
	
	@Override
	public Conta Transferencia(Conta contaOrigem, Conta contaDestino, Double valor) {
		if(contaOrigem.getSaldo() >= valor) {
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
			contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
			System.out.println("Transa��o.: Transferencia     Valor.: -" + valor);
		}
		else {
			System.out.println("Transferencia n�o permitida: Saldo insuficiente");
		}
		return contaOrigem;
	}
}
