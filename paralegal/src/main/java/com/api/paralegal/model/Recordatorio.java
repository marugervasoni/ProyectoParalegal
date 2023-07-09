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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_expediente", referencedColumnName = "id")
    private Expediente expediente;
}