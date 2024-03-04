package com.SpringBoot.RestAPIValidations.Controller;


import com.SpringBoot.RestAPIValidations.Model.AdminModel;
import com.SpringBoot.RestAPIValidations.Model.ItemModel;
import com.SpringBoot.RestAPIValidations.Service.AdminServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminServices adminServices;

    @PostMapping("/addAdmin")
    public String addAdmin(@RequestBody @Valid AdminModel adminModel){
         adminServices.saveAdmin(adminModel);
         return "added";

    }
    @DeleteMapping("/deleteAdmin/{adminId}")
    public String deleteAdmin(@PathVariable @Valid int adminId){
        adminServices.deleteAdmin(adminId);
        return "deleted";

    }

    @GetMapping("/viewAdmins")
    public List<AdminModel> viewAdmins(){
       return adminServices.getAllAdmins();

    }

    @PutMapping("/updateAdmins/{adminId}")
    public AdminModel updateAdmin(@RequestBody @Valid AdminModel adminModel,@PathVariable int adminId){
       return adminServices.updateAdminDetails(adminModel,adminId);

    }
    @PostMapping("/addItemsToAdmin/{adminId}")
    public String addItemsToAdmin(@RequestBody @Valid ItemModel itemModel, @PathVariable int adminId){


        return adminServices.addItemsToAdmin(itemModel,adminId);
    }

    @DeleteMapping("/deleteItemsByAdmin/{adminId}")
    public String deleteItemsByAdmin(@RequestBody @Valid ItemModel itemModel,@PathVariable int adminId){
        adminServices.adminDeleteItem(itemModel,adminId);
        return "item deleted by admin";
    }

    @PutMapping("/updateItemsByAdmin/{adminId}")
    public String updateItemsByAdmin(@RequestBody @Valid ItemModel itemModel,@PathVariable int adminId){
       adminServices.updateItemDetails(itemModel,adminId);
        return "updated";
    }

}
