package com.api.paralegal.model.dto;

import com.api.paralegal.model.Expediente;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AudienciaDTO {

    private Long id;
    private LocalDate fecha;
    private Expediente expediente;

}
