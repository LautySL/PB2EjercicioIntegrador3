package ar.edu.unlam.pb2;

import java.util.Comparator;

public class OrdenPorLatitudYLongitud implements Comparator <MedioTransporte>{

	@Override
	public int compare(MedioTransporte vehiculo1, MedioTransporte vehiculo2) {
		if (vehiculo1.getLatitud().compareTo(vehiculo2.getLatitud()) == 0) {
			return vehiculo1.getLongitud().compareTo(vehiculo2.getLongitud());
		}
		return vehiculo1.getLatitud().compareTo(vehiculo2.getLatitud());
	}

}
