package com.api.paralegal.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JuzgadoDTO {

    private Long id;

    private int numero;

    private String jurisdicción;
}
