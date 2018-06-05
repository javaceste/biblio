package biblio.controllers;

import biblio.model.entities.Autor;
import biblio.model.entities.Obra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Adaptador {

    Connection conn;

    public Adaptador(String connectionString) {
        try {
            this.conn = DriverManager.getConnection(connectionString);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String altaAutor(Autor a) {

        try {
            Statement st = conn.createStatement();

            String SQL = "INSERT INTO autor (codigo, nombre) VALUES (?, ?)";

            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, a.getCodigo());
            ps.setString(2, a.getNombre());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            a.setCodigo(null);
        }

        return a.getCodigo();
    }

    public String altaObra(Obra o) {

        try {
            Statement st = conn.createStatement();

            String SQL = "INSERT INTO obra (codigo, titulo, anyo, autor) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, o.getCodigo());
            ps.setString(2, o.getTitulo());
            ps.setInt(3, o.getAnyo());
            ps.setString(4, "XKHJ");
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            o.setCodigo(null);
        }

        return o.getCodigo();
    }

    public void cerrarConexion() throws SQLException {
        this.conn.close();
    }

}
