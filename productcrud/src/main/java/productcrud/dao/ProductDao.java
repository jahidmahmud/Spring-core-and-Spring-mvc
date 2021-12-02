package productcrud.dao;

import java.util.ArrayList;
import java.util.List;

import productcrud.model.Product;

public class ProductDao {
	
	private List<Product> products=new ArrayList<>();
	
	public ProductDao() {
		super();
		this.products.add(new Product(1,"Bonolota","This is book 1",2000));
		this.products.add(new Product(2,"Luck","This is book 2",1000));
		this.products.add(new Product(3,"Mike","This is book 3",1500));
		this.products.add(new Product(4,"Lucy","This is book 4",750));
	}
	
	public List<Product> getAll(){
		return this.products;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public Product getSingleProduct(int id) {
		return this.products.stream().filter(book->book.getId()==id).findFirst().orElse(null);
	}
	public void updateProduct(Product product) {
		this.products.set(product.getId()-1, product);
	}
	
	public void deleteProduct(Product p) {
		this.products.remove(p);
	}

}
