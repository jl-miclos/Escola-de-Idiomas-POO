package org.example;

import java.time.LocalDate;

public class Matriculas {
    private int id;
    private Alunos aluno_id;
    private Cursos cursos_id;
    private LocalDate data_matricula;

    public Matriculas(int id, Alunos aluno_id, Cursos cursos_id, LocalDate data_matricula) {
        this.id = id;
        this.aluno_id = aluno_id;
        this.cursos_id = cursos_id;
        this.data_matricula = data_matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alunos getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(Alunos aluno_id) {
        this.aluno_id = aluno_id;
    }

    public Cursos getCursos_id() {
        return cursos_id;
    }

    public void setCursos_id(Cursos cursos_id) {
        this.cursos_id = cursos_id;
    }

    public LocalDate getData_matricula() {
        return data_matricula;
    }

    public void setData_matricula(LocalDate data_matricula) {
        this.data_matricula = data_matricula;
    }
}
