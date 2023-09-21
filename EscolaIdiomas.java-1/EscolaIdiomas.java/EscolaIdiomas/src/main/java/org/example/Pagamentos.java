package org.example;

import java.time.LocalDate;

public class Pagamentos {
    private int id;
    private Alunos aluno_id;
    private Cursos cursos_id;
    private float valor;
    private LocalDate data_pagamento;

    public Pagamentos(int id, Alunos aluno_id, Cursos cursos_id, float valor, LocalDate data_pagamento) {
        this.id = id;
        this.aluno_id = aluno_id;
        this.cursos_id = cursos_id;
        this.valor = valor;
        this.data_pagamento = data_pagamento;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(LocalDate data_pagamento) {
        this.data_pagamento = data_pagamento;
    }
}
