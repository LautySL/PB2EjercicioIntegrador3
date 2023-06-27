package ar.edu.unlam.pb2;

public class Moto extends MedioTransporte {

	public Moto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super (patente, cantidadMaximaDePasajeros, velocidadMaxima, latitud, longitud);
	}
	
	public Moto (String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(patente, velocidadMaxima, latitud, longitud);
	}

	@Override
	public int compareTo(MedioTransporte o) {
		return 0;
	}

}
