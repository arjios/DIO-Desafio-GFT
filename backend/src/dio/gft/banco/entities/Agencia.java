package dio.gft.banco.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Agencia  extends BancoDIO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long numero;
	private String nome;
	
	private BancoDIO banco;
	
	Set<Conta> contas = new HashSet<>();	
	
	public Agencia() {
	}
	
	public Agencia(Long numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conta> getContas() {
		return contas;
	}

	public BancoDIO getBanco() {
		return banco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agencia other = (Agencia) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
