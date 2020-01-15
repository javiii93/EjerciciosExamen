package net.codejava.hibernate;
// Generated 15-ene-2020 17:57:14 by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Personal generated by hbm2java
 */
public class Personal implements java.io.Serializable {

	private short codigo;
	private String nombre;
	private String categoria;
	private Set tripulacions = new HashSet(0);

	public Personal() {
	}

	public Personal(short codigo) {
		this.codigo = codigo;
	}

	public Personal(short codigo, String nombre, String categoria, Set tripulacions) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.tripulacions = tripulacions;
	}

	public short getCodigo() {
		return this.codigo;
	}

	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Set getTripulacions() {
		return this.tripulacions;
	}

	public void setTripulacions(Set tripulacions) {
		this.tripulacions = tripulacions;
	}

}
