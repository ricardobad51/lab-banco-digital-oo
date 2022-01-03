package com.belemburitiricardo.controller;
import com.belemburitiricardo.entity.Cliente;
import com.belemburitiricardo.entity.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
