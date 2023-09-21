package org.example;

public class Notas {
    private int id;
    private Alunos aluno_id;
    private Cursos cursos_id;
    private float nota;

    public Notas(int id, Alunos aluno_id, Cursos cursos_id, float nota) {
        this.id = id;
        this.aluno_id = aluno_id;
        this.cursos_id = cursos_id;
        this.nota = nota;
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

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
