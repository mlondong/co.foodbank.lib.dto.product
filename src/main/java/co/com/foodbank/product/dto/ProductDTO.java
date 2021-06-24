package co.com.foodbank.product.dto;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.product.dto 22/06/2021
 */
public class ProductDTO {

    @NotNull(message = "Name must be declared.")
    @Size(min = 3, max = 30, message = "Complete name of Product.")
    private String name;

    @NotNull(message = "Description must be declared.")
    @Size(min = 3, max = 30, message = "Complete description of Product.")
    private String description;

    @NotNull(message = "Brand must be declared.")
    @Size(min = 3, max = 30, message = "Complete brand of Product.")
    private String brand;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateExpiraton;


    @NotNull
    @Pattern(regexp = "^[0-9]{1,4}$",
            message = "The storage life days must be numeric.")
    private String expectedStorageLife;

    @NotNull
    @Pattern(regexp = "^[0-9]{1,4}$",
            message = "The temperature of storage must be numeric.")
    private String storageTemperature;


    private boolean requiredRefrigeration;



    /**
     * Defaut constructor.
     */
    public ProductDTO() {}


    public String getExpectedStorageLife() {
        return expectedStorageLife;
    }

    public void setExpectedStorageLife(String expectedStorageLife) {
        this.expectedStorageLife = expectedStorageLife;
    }

    public String getStorageTemperature() {
        return storageTemperature;
    }

    public void setStorageTemperature(String storageTemperature) {
        this.storageTemperature = storageTemperature;
    }

    public boolean isRequiredRefrigeration() {
        return requiredRefrigeration;
    }

    public void setRequiredRefrigeration(boolean requiredRefrigeration) {
        this.requiredRefrigeration = requiredRefrigeration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public Date getDateExpiraton() {
        return dateExpiraton;
    }

    public void setDateExpiraton(Date dateExpiraton) {
        this.dateExpiraton = dateExpiraton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
