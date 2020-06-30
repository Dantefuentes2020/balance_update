package com.appbalance.balance_d.db;

import java.sql.Blob;
import java.util.Vector;

public interface datos {
    public void registrarse(String nombre_usuario , String apellido_usuario, String email, String contrasena);
    public Vector<String> consultaregistros(String user);


}
