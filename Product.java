public class Product{
	private String name;
	private double price;
	private String category;
	private boolean inStock;
	private int quantity;
	
	public Product(){
		this("name", 500, "category", true, 4);
	}
	
	public Product(String name, double price, String category){
		this(name, price, category, true, 4);
	}
	
	public Product(String name, double price, String category, boolean inStock, int quantity){
		this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
        this.quantity = quantity;
	}
	
	public String displayInfo(){
		String result = name + "\n" + price + "\n" + category + "\n" + inStock + "\n" + quantity;
		return result;
	}
	
	public void applyDiscount(double ckidka){
		if (ckidka > 0){
			price = (price*ckidka)*0.01;
		}else{
			System.out.println("Сегодня без скидок");
		}
	}
	
	public void restock(int cklad){
         if (cklad > 0){
            quantity += cklad;
        }else{
            System.out.println("Сегодня без пополнить");
        }
    }
	
    public void sell(int amount){
       if (quantity > amount){
            quantity -= amount;
        }else{
            System.out.println("Закончились товары");
        }
    }
	
}