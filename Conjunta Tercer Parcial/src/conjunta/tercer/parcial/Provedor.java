/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjunta.tercer.parcial;

/**
 *
 * @author User
 */
public class Provedor {
    private String code;
    private String nombre;
    private String telefono;

    public Provedor(String code, String nombre, String telefono) {
        this.code = code;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getCode() {
        return code;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Provedor{" + "code=" + code + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
