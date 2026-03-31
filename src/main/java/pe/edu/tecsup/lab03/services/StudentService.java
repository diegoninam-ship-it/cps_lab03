package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.repositories.StudentRepository;

public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();

    public void registrarEstudiante(String codigo, String nombre, int edad) {
        System.out.println("Registrando estudiante: " + nombre);
        studentRepository.guardar();
    }

    public void buscarEstudiante(String codigo) {
        System.out.println("Buscando estudiante...");
        studentRepository.buscarPorCodigo(codigo);
    }

    public void eliminarEstudiante(String codigo) {
        System.out.println("Eliminando estudiante...");
        studentRepository.eliminar(codigo);
    }
}