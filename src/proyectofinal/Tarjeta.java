/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author beus2
 */
public class Tarjeta {
private String numerotarjeta;
	private String tipoTarjeta;
	

	public String getNumerotarjeta() {
		return numerotarjeta;
	}

	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	
	public Tarjeta(String numerotarjeta, String tipoTarjeta) {
		super();
		this.numerotarjeta = numerotarjeta;
		this.tipoTarjeta = tipoTarjeta;
	}

	public String validarTarjeta(String tipoTarjeta) {
		if (tipoTarjeta.equals("1")) {
	        return "Tarjeta de débito";
		}
	    else if (tipoTarjeta.equals("2")) {
	        return "Tarjeta de crédito";
	    }
	    else {
	        return "Opción no válida";
	    }
	}
}