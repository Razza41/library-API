package com.api.library.entity;

import com.api.library.utills.Categoria;
import jakarta.persistence.*;
import lombok.*;


import java.security.SecureRandom;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Livro {

    //Livro — título, ISBN, ano publicação, total de exemplares, exemplares disponíveis

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false, unique = true, length = 12)
    private String isbn;

    @Column(nullable = false)
    private LocalDate anoPublicacao;

    @Column(nullable = false)
    private Integer totalExemplares;

    @Column(nullable = false)
    private Integer exemplaresDisponiveis;

    private Categoria categoria;
}
