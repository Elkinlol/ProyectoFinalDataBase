package co.bases.datos.proyectofinaldatabase.model;

import lombok.*;
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

public abstract class Payment {

    private  String id;
    private  float totalPrice;
    private  boolean isCredit;

}
