package com.belemburitiricardo.controller;
import com.belemburitiricardo.entity.Cliente;
import com.belemburitiricardo.entity.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
