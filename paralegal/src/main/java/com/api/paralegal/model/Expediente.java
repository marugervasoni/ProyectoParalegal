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

    //UNIDIR
    @OneToOne
    @JoinColumn(name = "id_juzgado", referencedColumnName = "id")
    private Juzgado juzgado; //-

    private String infoAdicional;

    //BIDIR
    @OneToMany(mappedBy = "expediente")
    @JsonIgnore
    private Set<Audiencia> audiencias; //-

    //BIDIR
    @ManyToMany
    @JoinTable(
            name = "clientes_x_expte",
            joinColumns = @JoinColumn(name = "id_expediente"),
            inverseJoinColumns = @JoinColumn(name = "id_cliente")
    )
    @JsonIgnore
    private Set<Cliente> clientes; //-

    //BIDIR
    @OneToMany(mappedBy = "expediente")
    @JsonIgnore
    private Set<Recordatorio> recordatorios; //-
}
//OnetoOne ->
//UNIDIR: lado One: joinColumn (nombre atributo); lado ToOne: nada
//BIDIR: lado One: cascade y JoinColum (nombre atributo)
// lado toOne: con mappedby (nombre clase)

//OnetoMany->
//UNIDIR: lado One: cascade y joinColumn (nombre clase); lado toMany: nada
//BIDIR: lado One: mappedby (nombre clase) y JsonIgnore;
//lado toMany JoinColumn (nombre atributo)

//ManytoMany->
//UNIDIR: lado Many: JoinTable(name, joincolumns (nombre clase), inversedJoinColumns (nombre atributo-clase contraria)
//lado toMany: nada
//BIDIR: lado Many: JoinTable(name, joinColumns(nombre clase), inverserdjoincolumns (nombre atributo-clase contraria), JsonIgnore
//lado toMany: mappedby