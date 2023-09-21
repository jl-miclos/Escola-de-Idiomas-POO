package org.example;

public class Tarefas {
    private int id;
    private Aulas aula_id;
    private String descricao;

    public Tarefas(int id, Aulas aula_id, String descricao) {
        this.id = id;
        this.aula_id = aula_id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aulas getAula_id() {
        return aula_id;
    }

    public void setAula_id(Aulas aula_id) {
        this.aula_id = aula_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
