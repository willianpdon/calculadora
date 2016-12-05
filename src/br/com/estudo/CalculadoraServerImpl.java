package br.com.estudo;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.estudo.CalculadoraServer")
public class CalculadoraServerImpl {

	public long divide(long x, long y) {
		return (y >=0) ? x/y : 0;
	}

	public long multiplica(long x, long y) {
		return x * y;
	}
	
	public long soma(long x, long y) {
		return x + y;
	}
	
	public long subtrai(long x, long y) {
		return x - y;
	}
}
