package com.api.paralegal.model.dto;

import com.api.paralegal.model.Juzgado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExpedienteDTO {

    private Long id;
    private List<String> actores;
    private List<String> demandados;
    private String objeto;
    private Integer numExpte;
    private Juzgado juzgado;
}
