package br.com.fiap.giffty.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
@Entity


public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "{produto.icone.notblank}")
    private String icone;

    @NotBlank(message = "{produto.nome.notblank}")
    private String nome;

    @NotBlank(message = "{produto.link.notblank}")
    private String link;

    @NotBlank(message = "{produto.descricao.notblank}")
    private String descricao;

}  
