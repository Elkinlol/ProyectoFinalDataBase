package co.bases.datos.proyectofinaldatabase.model;

import lombok.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private String id;
    private double unitPrice;
    private double purchaseValue;
    private int stock;
    private ProductCategory category;

}
