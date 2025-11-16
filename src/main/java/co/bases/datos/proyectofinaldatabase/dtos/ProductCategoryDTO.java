package co.bases.datos.proyectofinaldatabase.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder(toBuilder = true)

public class ProductCategoryDTO {
    private int id;
    private String categoryName;
    private double iva;
    private double profitMargin;

    private ProductCategoryDTO(int id, String categoryName, double iva, double profitMargin) {
        this.id = id;
        this.categoryName = categoryName;
        this.iva = iva;
        this.profitMargin = profitMargin;

        validate();
    }

    private void validate() {

        if (categoryName == null || categoryName.isBlank()) {
            throw new IllegalArgumentException("El nombre de la categoría es obligatorio");
        }

        if (iva < 0.0) {
            throw new IllegalArgumentException("El IVA no puede ser negativo");
        }

        if (profitMargin < 0.0) {
            throw new IllegalArgumentException("El margen de utilidad no puede ser negativo");
        }
    }
}
