package co.bases.datos.proyectofinaldatabase.model;

import lombok.*;
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PayMent {

    private  String payMentId;
    private  float totalPrice;
    private  boolean isCredit;

}
