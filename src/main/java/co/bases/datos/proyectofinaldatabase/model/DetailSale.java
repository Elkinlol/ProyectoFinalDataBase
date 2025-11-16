package co.bases.datos.proyectofinaldatabase.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder

public class DetailSale {

    private String id;
    private int quantity;
    private float totalPrice;
    private List<Product> products;
    private Sale sale;
}
