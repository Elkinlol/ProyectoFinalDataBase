package co.bases.datos.proyectofinaldatabase.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder

public class CreditPayment extends Payment {

    private  String totalInstallments;
    private float initialQuote;
    private List<Installment> installments;
}
