public class BankAccount{
	private String accountNumber;
	private String ownerName;
	private double balance;
	private String currency;
	private boolean isActive;
	
	public BankAccount(){
		this("nomer", "thladei", 5000, "rub", true);
	}
	
	public BankAccount(String accountNumber, String ownerName){
		this(accountNumber, ownerName, 0, "rub", true);
	}
	
	public BankAccount(String accountNumber, String ownerName, double balance, String currency, boolean isActive){
		this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.currency = currency;
        this.isActive = isActive;
	}
	
	public String displayInfo(){
		String result = accountNumber + "\n" + ownerName + "\n" + balance + "\n" + currency + "\n" + isActive;
		return result;
	}
	
	public void deposit(double dopsum){
		if (dopsum > 0){
			balance += dopsum;
		}else{
			System.out.println("Счет не пополнился");
		}
	}
	
	public void withdraw(double withdrawsum){
         if (balance > withdrawsum){
            balance -= withdrawsum;
        }else{
            System.out.println("Не достаточно средств");
        }
    }
	
    public void activateAccount(){
        isActive = true;
    }
	
	public void deactivateAccount(){
        isActive = false;
    }
}