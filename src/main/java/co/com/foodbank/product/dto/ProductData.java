package co.com.foodbank.product.dto;

import java.util.Date;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.product.dto 9/07/2021
 */
public class ProductData implements IProduct {

    private String id;
    private Date dateExpiraton;
    private String name;
    private String description;
    private String brand;

    /**
     * Default constructor.
     */
    public ProductData() {}

    public void setId(String id) {
        this.id = id;
    }

    public void setDateExpiraton(Date dateExpiraton) {
        this.dateExpiraton = dateExpiraton;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

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
