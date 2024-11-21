package com.consumption.crud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter // colocar
@Setter // tirar informaçoes
@Entity // cada campo como uma identidade
@Table(name = "pessoas") // nome da tabela
public class PessoaModel {
    @Id // bd saiba que é privado
    @GeneratedValue(strategy = GenerationType.AUTO) // gera id automatico
    private Integer id;
    private String name;
    private String description;

    public void setId(Object o) {
    }
}
