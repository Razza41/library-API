package com.api.library.entity;

import com.api.library.utills.StatusUsuario;
import com.api.library.utills.TipoUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Usuario {
//Usuário/Leitor — nome, CPF, email, telefone, tipo (COMUM, PREMIUM, FUNCIONARIO), status (ATIVO, BLOQUEADO, SUSPENSO)
    @jakarta.persistence.Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private int cpf;

    @Email
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private TipoUsuario tipoUsuario;

    @Column(nullable = false)
    private StatusUsuario statusUsuario;


}
