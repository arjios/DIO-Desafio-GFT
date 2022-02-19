package dio.gft.banco;

import dio.gft.banco.entities.Agencia;
import dio.gft.banco.entities.BancoDIO;
import dio.gft.banco.entities.Conta;
import dio.gft.banco.repositories.MovimentarConta;
import dio.gft.banco.services.ProcessarMovimento;

public class Program {

	public static void main(String[] args) {
		
		MovimentarConta transacao = new ProcessarMovimento();
		
		BancoDIO banco = new BancoDIO(1L, "Banco DIO");
		
		Agencia agencia = new Agencia(1L, "GFT");
		
		Conta conta = new Conta(1L, "José", 12000.00, "Corrente");
		
		Conta contaDestino = new Conta(12L, "Maria", 1200.00, "Poupamça");
		
		agencia.getContas().add(conta);
		
		banco.getAgencias().add(new Agencia(1L, "Ilheus"));
		
		System.out.println("Banco.....: " + banco.getNome() + "         Numero..: 00" + banco.getNumero());
		System.out.println("Agencia...: " + agencia.getNome() + "               Numero: 0000" + agencia.getNumero());
		System.out.println("Conta.....: " + conta.getTipo() + "          Numero: 000000" + conta.getNumero());
		System.out.println("Cliente...: " + conta.getCliente() + "              Saldo: " + conta.getSaldo());
		transacao.Deposito(conta, 123.00);
		System.out.println("Cliente...: " + conta.getCliente() + "              Saldo: " + conta.getSaldo());
		System.out.println();
		
		System.out.println("Banco.....: " + banco.getNome() + "         Numero..: 00" + banco.getNumero());
		System.out.println("Agencia...: " + agencia.getNome() + "               Numero: 0000" + agencia.getNumero());
		System.out.println("Conta.....: " + conta.getTipo() + "          Numero: 000000" + conta.getNumero());
		System.out.println("Cliente...: " + conta.getCliente() + "              Saldo: " + conta.getSaldo());
		transacao.Retirada(conta, 1233.01);
		System.out.println("Cliente...: " + conta.getCliente() + "              Saldo: " + conta.getSaldo());
		System.out.println();
		
		System.out.println("Banco.....: " + banco.getNome() + "         Numero..: 00" + banco.getNumero());
		System.out.println("Agencia...: " + agencia.getNome() + "               Numero: 0000" + agencia.getNumero());
		System.out.println("Conta.....: " + conta.getTipo() + "          Numero: 000000" + conta.getNumero());
		System.out.println("Cliente...: " + conta.getCliente() + "              Saldo: " + conta.getSaldo());
		transacao.Transferencia(conta, contaDestino, 350.00);
		System.out.println("Cliente...: " + conta.getCliente() + "              Saldo: " + conta.getSaldo());
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Banco.....: " + banco.getNome() + "         Numero..: 00" + banco.getNumero());
		System.out.println("Agencia...: " + agencia.getNome() + "               Numero: 0000" + agencia.getNumero());
		System.out.println("Conta.....: " + contaDestino.getTipo() + "          Numero: 00000" + contaDestino.getNumero());
		System.out.println("Cliente...: " + contaDestino.getCliente() + "             Saldo.: " + contaDestino.getSaldo());
		System.out.println();
		
	}
}
