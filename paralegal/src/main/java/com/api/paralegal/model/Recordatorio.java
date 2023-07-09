package com.api.paralegal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Recordatorios")
public class Recordatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date vencimiento;

    private String descripcion;

    //BIDIR
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_expediente", referencedColumnName = "id")
    private Expediente expediente; //-
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