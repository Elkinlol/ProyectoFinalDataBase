package co.bases.datos.proyectofinaldatabase.model;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    private String id;
    private LocalDate saleDate;
    private User customer;
    private User employee;
    private List<Payment> payments;
}

