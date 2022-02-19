package dio.gft.banco.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class BancoDIO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long numero;
	private String nome;
	
	Set<Agencia> agencias = new HashSet<>();
	
	public BancoDIO() {
	}

	public BancoDIO(Long numero, String nome) {
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
	
	public Set<Agencia> getAgencias() {
		return agencias;
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
		BancoDIO other = (BancoDIO) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
