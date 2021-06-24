package co.com.foodbank.product.dto;

import java.util.Date;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.product.dto 21/06/2021
 */
public interface IProduct {

    String getId();

    Date getDateExpiraton();

    String getName();

    String getDescription();

    String getBrand();


}