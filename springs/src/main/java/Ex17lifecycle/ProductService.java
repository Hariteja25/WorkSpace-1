package Ex17lifecycle;

public class ProductService {

	public ProductService(){
		System.out.println("prodservice constr");
	}
	public void save(){
		//saving to db
		System.out.println("saving  Product::");
	}
}
