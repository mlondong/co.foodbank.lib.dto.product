package co.com.foodbank.product.dto;

import javax.validation.constraints.NotNull;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.product.dto 8/07/2021
 */
public class ProductPK {
    @NotNull(message = "Complete product number.")
    private String product;

    public ProductPK() {}

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}
