/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

/**
 *
 * @author juan_cam.aristizabal
 */
public class Estudiante {
    
    
    private String nombre;
    private String codigo;

    public Estudiante() {
    }

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

        public String getNombre() {
            return nombre;
        }

        @Override
        public String toString() {
            return "Estudiante{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
}
