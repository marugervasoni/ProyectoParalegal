package com.api.paralegal.model.dto;

import com.api.paralegal.model.Expediente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecordatorioDTO {

    private Long id;
    private Date vencimiento;
    private Expediente expediente;
}
