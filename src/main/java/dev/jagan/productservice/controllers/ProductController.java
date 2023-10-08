package dev.jagan.productservice.controllers;

import dev.jagan.productservice.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
/* @RequestMapping("/products") - using this We can remove below mapped Endpoints*/

public class ProductController {

    @GetMapping("/products")
    public String getAllProducts(){
        return "Getting all Product Lists";
    }

    @GetMapping("/products/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId){
        return "Getting Single Products : " + productId;
    }

    @PostMapping("/products")
    public String addNewProduct(@RequestBody ProductDto productDto){
        return "Adding New products : " + productDto;
    }

    @PutMapping("/products/{productId}")
    public String putExistingProduct(@PathVariable("productId") Long productId ,@RequestBody ProductDto productDto){
        return "Updating Existing Product : "  + productId +" " +productDto;
    }

    @PatchMapping("/products/{productId}")
    public String patchExistingProduct(@PathVariable("productId") Long productId , @RequestBody ProductDto productDto){
        return "Patch Existing Product :  "  + productId +" " +productDto;
    }

    @DeleteMapping("/products/{productId}")
    public String deletingProduct(@PathVariable("productId") Long productId){
        return "deleting the ProductID : " + productId ;
    }
}

