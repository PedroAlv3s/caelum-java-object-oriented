package com.java.caelum.chapter4.banco;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String mostrarData() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}