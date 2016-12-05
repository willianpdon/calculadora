package br.com.estudo;

import javax.xml.ws.Endpoint;

public class Publiser {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:9876/calculadora",
				new CalculadoraServerImpl());
	}
}
