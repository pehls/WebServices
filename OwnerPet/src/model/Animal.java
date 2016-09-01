package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal implements Serializable {
 
	private static final long serialVersionUID = 6612152577260596832L;
	private String raca;
	private String familia;
	@Id
	private String registro;
	private int peso;
	private int comprimento;
	private int altura;
	private Date dataNascimento;
	private String corPelo;
	private boolean possuiCauda;
	private String descricao;
	private String foto="img/dogue_alemao.jpg";

	public Animal() {

	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	public boolean isPossuiCauda() {
		return possuiCauda;
	}

	public void setPossuiCauda(boolean possuiCauda) {
		this.possuiCauda = possuiCauda;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "Animal [raca=" + raca + ", familia=" + familia + ", registro=" + registro + ", peso=" + peso
				+ ", comprimento=" + comprimento + ", altura=" + altura + ", dataNascimento=" + dataNascimento
				+ ", corPelo=" + corPelo + ", possuiCauda=" + possuiCauda + ", descricao=" + descricao + ", foto="
				+ foto + "]";
	}

	
	
}
