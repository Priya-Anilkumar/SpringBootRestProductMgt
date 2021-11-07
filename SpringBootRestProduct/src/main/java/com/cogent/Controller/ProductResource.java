package com.cogent.Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cogent.model.ProdRepository;
import com.cogent.model.Product;
import com.cogent.Controller.ResourceNotFoundExceptions;

//@RestController
public class ProductResource {
/*	
@Autowired
ProdRepository prodrepository;


@GetMapping("/")
public List<Product> retrieveAllProducts(){
	List<Product> prodlist=prodrepository.findAll();
	for (Product product : prodlist) {
		System.out.println(product.getProductName()	);
		
	}
	return prodlist;	
	
}
@GetMapping("/products/{id}")
public ResponseEntity<Product> retrieveProduct(@PathVariable int id) throws ResourceNotFoundExceptions{
	Product product1=prodrepository.findById(id).orElseThrow(()->new ResourceNotFoundExceptions("product not found"+id));
	return ResponseEntity.ok().body(product1);	
}

@DeleteMapping("/products/{id}")
public void deleteProduct1(@PathVariable int id) {
	prodrepository.deleteById(id);
}

@PostMapping("/products")
public ResponseEntity<Object>
createProduct(@RequestBody Product product) {
	Product newProdcut = prodrepository.save(product);

	URI location = 
		ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			.buildAndExpand(newProdcut.getProductCode()).toUri();

	return ResponseEntity.created(location).build();

}

@PutMapping("/students/{id}")
public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable int id)
throws ResourceNotFoundExceptions
{

     Product product1 = prodrepository.findById(id).orElseThrow(() -> new ResourceNotFoundExceptions("Product not found for this id :: " + id));


	product1.setProductCode(id);
	product1.setProductName(product1.getProductName());
	Product productupdated=	prodrepository.save(product1);

	return ResponseEntity.ok(productupdated);
}*/
}
