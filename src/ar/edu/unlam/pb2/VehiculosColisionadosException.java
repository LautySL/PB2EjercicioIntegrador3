package ar.edu.unlam.pb2;

import java.util.*;

public class VehiculosColisionadosException extends ColitionException {
	
	private ArrayList <MedioTransporte> vehiculos = new ArrayList<>();
	
	public void agregarVehiculo(MedioTransporte vehiculo) {
		this.vehiculos.add(vehiculo);
	}

	public ArrayList<MedioTransporte> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<MedioTransporte> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
}
