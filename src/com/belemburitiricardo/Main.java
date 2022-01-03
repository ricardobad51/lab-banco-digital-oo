package com.belemburitiricardo;


import com.belemburitiricardo.controller.ContaCorrente;
import com.belemburitiricardo.controller.ContaPoupanca;
import com.belemburitiricardo.entity.Cliente;
import com.belemburitiricardo.entity.Conta;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
