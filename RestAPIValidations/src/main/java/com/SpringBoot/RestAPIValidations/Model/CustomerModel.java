package com.SpringBoot.RestAPIValidations.Model;

import com.SpringBoot.RestAPIValidations.Entity.Item;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CustomerModel {
    private int customerId;
    @NotBlank(message = "name shouldn't blank")
    @NotNull(message = "name shouldn't null")
    @NotEmpty(message = "name shouldn't not empty")
    private String customerName;
    @NotBlank(message = "email shouldn't blank")
    @NotNull(message = "email shouldn't null")
    @NotEmpty(message = "email shouldn't not empty")
    private String customerMail;
    @NotBlank(message = "password shouldn't blank")
    @NotNull(message = "password shouldn't null")
    @NotEmpty(message = "password shouldn't not empty")
    @Size(min=6,message = "password should be atleast more then 5 characters")
    private String customerPassword;
    @NotBlank(message = "password shouldn't blank")
    @NotNull(message = "password shouldn't null")
    @NotEmpty(message = "password shouldn't not empty")
    @Size(min=10, max=10, message="Phone number must be exactly 10 digits")
    //@Pattern(regexp="[0-9]{10}", message="Phone number must be exactly 10 digits")
    private long customerPhone;

    private List<Item> itemList=new ArrayList<>();
}
