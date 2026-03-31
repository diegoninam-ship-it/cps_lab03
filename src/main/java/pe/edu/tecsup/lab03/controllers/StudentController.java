package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {

    private StudentService studentService = new StudentService();

    public void listar() {
        System.out.println("Listado de estudiantes");
    }

    public void registrar(String codigo, String nombre, int edad) {
        studentService.registrarEstudiante(codigo, nombre, edad);
    }

    public void procesar() {
        System.out.println("Procesando estudiante");
    }

    public void buscar(String codigo) {
        studentService.buscarEstudiante(codigo);
    }

    public void eliminar(String codigo) {
        studentService.eliminarEstudiante(codigo);
    }
}