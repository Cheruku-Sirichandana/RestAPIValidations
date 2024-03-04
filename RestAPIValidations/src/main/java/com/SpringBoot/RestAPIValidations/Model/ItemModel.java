package com.SpringBoot.RestAPIValidations.Model;


import com.SpringBoot.RestAPIValidations.Entity.Admin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ItemModel {
    private int itemId;
    @NotBlank(message = "name shouldn't blank")
    @NotNull(message = "name shouldn't null")
    @NotEmpty(message = "name shouldn't not empty")
    private String itemName;

    @NotBlank(message = "name shouldn't blank")
    @NotNull(message = "name shouldn't null")
    @NotEmpty(message = "name shouldn't not empty")
    @Positive(message = "Price must be a positive number")

    private double itemPrice;
    @Positive(message = "Quantity must be a positive number")

    private int itemQuantity;

    private Admin admin;
}
