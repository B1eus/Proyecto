/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author beus2
 */
public class Tarjeta {
private int numerotarjeta;
	private String tipoTarjeta;
        private String tipo_cuenta;

    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public Tarjeta(int numerotarjeta, String tipoTarjeta, String tipo_cuenta) {
        this.numerotarjeta = numerotarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.tipo_cuenta = tipo_cuenta;
    }
	

	public int getNumerotarjeta() {
		return numerotarjeta;
	}

	public void setNumerotarjeta(int numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	public String validarTarjeta(int numeroTarjeta) {
    String sql = "SELECT * FROM tarjeta WHERE NumeroTarjeta = ?";
    try (Connection conn = ConexionDB.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, numeroTarjeta);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                // La tarjeta existe, puedes devolver un mensaje o algún dato específico
                return "Tarjeta válida.";
            } else {
                // No se encontró la tarjeta
                return "Tarjeta no válida.";
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al validar la tarjeta: " + e.getMessage());
        return "Error en la base de datos.";
    }
}
	   
	}
