package co.com.foodbank.product.dto;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.product.dto 8/07/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductPK {

    @NotNull(message = "Complete product number.")
    private String product;


}
