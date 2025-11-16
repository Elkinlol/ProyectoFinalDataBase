package co.bases.datos.proyectofinaldatabase.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder

public class CashPayment extends Payment {
    private String methodPayment;
}
