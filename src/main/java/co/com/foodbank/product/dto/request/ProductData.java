package co.com.foodbank.product.dto.request;

import java.util.Date;
import co.com.foodbank.product.dto.interfaces.IProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.product.dto 9/07/2021
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductData implements IProduct {

    private String id;
    private Date dateExpiraton;
    private String name;
    private String description;
    private String brand;

    /**
     * Default constructor.
     */


    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public Date getDateExpiraton() {
        return dateExpiraton;
    }


}
