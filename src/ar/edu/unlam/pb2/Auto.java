package ar.edu.unlam.pb2;

public class Auto extends MedioTransporte {

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(patente, cantidadMaximaDePasajeros, velocidadMaxima, latitud, longitud);
	}

	@Override
	public int compareTo(MedioTransporte o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
