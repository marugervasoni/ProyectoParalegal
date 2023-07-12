package com.api.paralegal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Expedientes")
public class Expediente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Set<String> actores;

    private Set<String> demandados;

    private String objeto;

    private Integer numExpte;

    private Integer añoInicio;

    @ManyToOne
    @JoinColumn(name="id_juzgado")
    private Juzgado juzgado;

    private String infoAdicional;

    @OneToMany(mappedBy = "expediente")
    @JsonIgnore
    private Set<Audiencia> audiencias;

    @ManyToMany
    @JoinTable(
            name = "clientes_x_expte",
            joinColumns = @JoinColumn(name = "id_expediente"),
            inverseJoinColumns = @JoinColumn(name = "id_cliente")
    )
    @JsonIgnore
    private Set<Cliente> clientes;

    @OneToMany(mappedBy = "expediente")
    @JsonIgnore
    private Set<Recordatorio> recordatorios;
}