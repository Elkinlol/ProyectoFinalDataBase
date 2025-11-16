package co.bases.datos.proyectofinaldatabase.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder

public class ProductCategoryDTO {
    private String categoryName;
    private double iva;
    private double profitMargin;

    public ProductCategoryDTO(String categoryName, double iva, double profitMargin) {
        if(categoryName == null || categoryName.isBlank())
            throw new IllegalArgumentException("El usuario es obligatorio");

        if( iva<0.1)
            throw new IllegalArgumentException("El valor del IVA fuente es obligatorio");

        if (profitMargin < 0.1)
            throw new IllegalArgumentException("El valor del profitMargin es obligatorio");
    }
}
