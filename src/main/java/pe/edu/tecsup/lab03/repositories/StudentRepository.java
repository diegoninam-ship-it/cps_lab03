package pe.edu.tecsup.lab03.repositories;

public class StudentRepository {

    public void guardar() {
        System.out.println("Guardando estudiante en repositorio");
    }

    public void buscarPorCodigo(String codigo) {
        System.out.println("Buscando estudiante con código: " + codigo);
    }

    public void eliminar(String codigo) {
        System.out.println("Eliminando estudiante con código: " + codigo);
    }
}