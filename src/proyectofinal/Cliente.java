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
public class Cliente {
 private int idCliente;
	private String nombre;
                private int clave;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente(int idCliente, int clave, String nombre) {
		super();
		this.idCliente = idCliente;
		this.clave = clave;
		this.nombre = nombre;
	}
        public String validarClave(int clave) {
    String sql = "SELECT * FROM cliente WHERE Clave = ?";
    try (Connection conn = ConexionDB.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, clave);
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