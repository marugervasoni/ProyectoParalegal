package com.api.paralegal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Audiencias")
public class Audiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate fecha;

    private String tipo;

    //BIDIR
    @ManyToOne
    @JoinColumn(name="id_expediente", nullable = false , referencedColumnName = "id")
    private Expediente expediente; //-

    private Boolean esVirtual;

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
