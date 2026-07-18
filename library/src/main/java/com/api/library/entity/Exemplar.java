package com.api.library.entity;

import com.api.library.utills.StatusExemplar;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Exemplar {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private  Livro livro;

    @Column(nullable = false)
    private  String estadoConservacao;

    @Column(nullable = false)
    private StatusExemplar statusExemplar;

    @Column(nullable = false)
    private String codUnico;




}
