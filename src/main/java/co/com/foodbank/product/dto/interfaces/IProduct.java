package co.com.foodbank.product.dto.interfaces;

import java.util.Date;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.product.dto 21/06/2021
 */
public interface IProduct {

    String getId();

    String getName();

    String getDescription();

    String getBrand();

    Date getDateExpiraton();


}
