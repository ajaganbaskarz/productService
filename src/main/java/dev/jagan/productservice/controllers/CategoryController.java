package dev.jagan.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* @RequestMapping("/products/category") - using this We can remove below mapped Endpoints*/

public class CategoryController {

    @GetMapping("/products/category/{categoryName}")
    public String getSingleCategory(@PathVariable("categoryName") String categoryName){
        return "Getting Single Category : "+ categoryName;
    }

    @PostMapping("/products/category")
    public String addNewProduct(){
        return "Adding new category";
    }
}
