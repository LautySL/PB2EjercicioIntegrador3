package ar.edu.unlam.pb2;

import java.util.*;

public class Mapa {
	
	private String nombre;
	private ArrayList <MedioTransporte> vehiculos;
	
	public Mapa(String nombre) {
		super();
		this.nombre = nombre;
		this.vehiculos = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<MedioTransporte> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(ArrayList<MedioTransporte> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public Boolean agregarVehiculo (MedioTransporte vehiculo) {
		return this.vehiculos.add(vehiculo);
	}

	public Integer getCantidadDeVehiculos() {
		return this.vehiculos.size();
	}

	public Boolean hayColision() throws ColitionException {
		for (MedioTransporte vehiculo1 : vehiculos) {
			for (MedioTransporte vehiculo2 : vehiculos) {
				if (!vehiculo1.equals(vehiculo2) && vehiculo1.getLatitud().equals(vehiculo2.getLatitud()) 
					&& vehiculo1.getLongitud().equals(vehiculo2.getLongitud())) {
					throw new ColitionException();
				}
			}
		} return false;
	}
	
	// El que explicó Andy en clase, ordenando con un Comparator
	
	public Boolean hayColision1() throws ColitionException {
		TreeSet <MedioTransporte> vehiculosSinColision = new TreeSet<>(new OrdenPorLatitudYLongitud());
		vehiculosSinColision.addAll(vehiculos);
		// Si el tamaño no es igual, porque se compara la longitud y latitud, y en caso de que haya dos vehiculos
		// con la misma, no lo mete al vehiculo en vehiculosSinColision, y por lo tanto quiere decir que hubo una colision
		if (this.vehiculos.size() != vehiculosSinColision.size()) {
			throw new ColitionException();
		} return false;
	}
	
	// VehiculosColisionadosException...
	
	public Boolean hayColision2() throws VehiculosColisionadosException {
		for (MedioTransporte vehiculo1 : vehiculos) {
			for (MedioTransporte vehiculo2 : vehiculos) {
				if (!vehiculo1.equals(vehiculo2) && vehiculo1.getLatitud().equals(vehiculo2.getLatitud()) 
					&& vehiculo1.getLongitud().equals(vehiculo2.getLongitud())) {
					VehiculosColisionadosException vehiculosColisionados = new VehiculosColisionadosException();
					vehiculosColisionados.agregarVehiculo(vehiculo1);
					vehiculosColisionados.agregarVehiculo(vehiculo2);
					throw vehiculosColisionados;
				}
			}
		} return false;
	}

}
