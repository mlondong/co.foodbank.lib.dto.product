package co.com.foodbank.product.dto;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.product.dto 22/06/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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



}
