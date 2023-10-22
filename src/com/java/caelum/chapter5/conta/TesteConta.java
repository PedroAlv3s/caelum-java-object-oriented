package com.java.caelum.chapter5.conta;

import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		
		Conta conta1 = new Conta();
		conta1.nome = "Pedro";
		conta1.saldo = 1000;
		contas[0] = conta1;
		
		Conta conta2 = new Conta();
		conta2.nome = "Rian";
		conta2.saldo = 1500;
		contas[1] = conta2;
		
		for(int i = 0; i < 10; i++) {
			if(contas[i] == null) {
				System.out.println("Posição nula!");
			} else {
				DecimalFormat formato = new DecimalFormat("#.##");
				double saldoFormatado = Double.valueOf(formato.format(contas[i].saldo));
				System.out.printf("%-6s%-2s%f\n", contas[i].nome, "|", saldoFormatado);
			}
		}
	}
}