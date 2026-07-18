package com.api.library.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Emprestimo {
    //Empréstimo — usuário, exemplar, data empréstimo, data prevista devolução, data real devolução, status, renovações usadas

    private Usuario usuario;

    private Exemplar exemplar;

    private LocalDate dataEmprestimo;

    private LocalDate dataPrevistaDevolucao;

    private LocalDate dataRealDevolucao;

    private StatusEmprestimo status;

    private Integer renovacoesUsadas;

}
