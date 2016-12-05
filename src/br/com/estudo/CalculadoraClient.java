package br.com.estudo;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalculadoraClient {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost:9876/calculadora?wsdl");
		long x =4 , y=2;
		QName qname = new QName("http://estudo.com.br/" , "CalculadoraServerImplService");

		Service service = Service.create(url, qname);
		CalculadoraServer cs = service.getPort(CalculadoraServer.class);

		System.out.println(x+" + "+y+" = " + cs.soma(x, y));
		System.out.println(x+" - "+y+" = " + cs.subtrai(x, y));
		System.out.println(x+" * "+y+" = " + cs.multiplica(x, y));
		System.out.println(x+" / "+y+" = " + cs.divide(x, y));

	}
}
