package com.belemburitiricardo;


import com.belemburitiricardo.controller.ContaCorrente;
import com.belemburitiricardo.controller.ContaPoupanca;
import com.belemburitiricardo.entity.Cliente;
import com.belemburitiricardo.entity.Conta;

public class Main {

	public static void main(String[] args) {
		Cliente ricardo = new Cliente();
		ricardo.setNome("Ricardo");
		
		Conta cc = new ContaCorrente(ricardo);
		Conta poupanca = new ContaPoupanca(ricardo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
