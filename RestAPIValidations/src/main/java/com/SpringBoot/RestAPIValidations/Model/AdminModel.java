package com.SpringBoot.RestAPIValidations.Model;

import com.SpringBoot.RestAPIValidations.Entity.Item;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminModel {

    private int adminId;
    @NotBlank(message = "name shouldn't blank")
    @NotNull(message = "name shouldn't null")
    @NotEmpty(message = "name shouldn't not empty")
    private String adminName;
    @NotBlank(message = "email shouldn't blank")
    @NotNull(message = "email shouldn't null")
    @NotEmpty(message = "email shouldn't not empty")
    private String adminEmail;
    @NotBlank(message = "username shouldn't blank")
    @NotNull(message = "username shouldn't null")
    @NotEmpty(message = "username shouldn't not empty")
    private String adminUsername;
    @NotBlank(message = "password shouldn't blank")
    @NotNull(message = "password shouldn't null")
    @NotEmpty(message = "password shouldn't not empty")
    @Size(min=6,message = "password should be atleast more then 5 characters")
    private String adminPassword;
    private List<Item> itemList=new ArrayList<>();

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
