package com.generation.f20220602.modelos;

import java.util.List;

public class Asistencia {


    public void asistenciaAlumno(List<Alumno> listaAlumno) {
        for (Alumno alumno: listaAlumno) {
            System.out.println(alumno.toString());
            if(alumno.getAsistencia().equals("Si")){
                System.out.println("Alumno esta ausente");
            }
            }

        }
    }

