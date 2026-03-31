package pe.edu.tecsup.lab03.entities;

public class StudentEntity {

    private String nombre;
    private int edad;

    public StudentEntity() {
    }

    public StudentEntity(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}