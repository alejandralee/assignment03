package assignment03;

public class BankAccountGroup{
	
	private BankAccount[] bankAccountArray;
	
	
	//Constructor
	public BankAccountGroup(BankAccount[] arr){
		this.bankAccountArray = arr;
	}
	
	
	//Methods
	public double getBalance(int i){
		double accountBalance = bankAccountArray[i].getBalance();
		if (bankAccountArray[i]!=null){
			return accountBalance;
		}
		else{
			throw new NullPointerException("Account Balance is null");
		}
	}
	
	public double removeAccount(int i){
		double accountBalance = bankAccountArray[i].getBalance();
		if (bankAccountArray[i]!=null){
			bankAccountArray[i]=null;
			return accountBalance;
		}
		else{
			return 0;
		}
	}
	
	public void insertAccount(int i, BankAccount ac){
		if (bankAccountArray[i] == null){
			bankAccountArray[i] = ac;
		}
		else{
			throw new IllegalArgumentException("Trying to replace existing account");
		}
	}
	public int countNonNull(){
		int notNullAccounts = 0;
		for (int i = 0; i< bankAccountArray.length;i++){
			if (bankAccountArray[i]!=null){
				notNullAccounts = notNullAccounts +1;
			}
		}
		return notNullAccounts;
	}
	public void evenUpAccounts(){
		if (bankAccountArray != null){
			double sum = 0.0;
			double averageAmount = 0;
			double difference;
			for(int i = 0; i < bankAccountArray.length; i++){
				if (bankAccountArray[i]!=null){
					sum = sum + bankAccountArray[i].getBalance();
				}
			}
			averageAmount = sum/countNonNull();
			
			for (int i=0; i<bankAccountArray.length; i++){
				if (bankAccountArray[i]!= null){
					if (bankAccountArray[i].getBalance() > averageAmount){
						difference = bankAccountArray[i].getBalance() - averageAmount;
						bankAccountArray[i].deposit(difference);
					}
					else if (bankAccountArray[i].getBalance() < averageAmount){
						difference = averageAmount - bankAccountArray[i].getBalance();
						bankAccountArray[i].deposit(difference);
					}
				}
			}
		}
		else{
			throw new NullPointerException("Array is null");
		}
	}
	public double depositLowest(double amount){
		double lowestAmount = 99999999;
		for(int i = 0; i < bankAccountArray.length; i++){
			if (bankAccountArray[i]!=null){
				if (bankAccountArray[i].getBalance()<lowestAmount){
					lowestAmount = bankAccountArray[i].getBalance();
				}
			}
		}
		return 0;
	}
	public double withdrawHighest(double amount){
		double highestBalance = 0;
		int highestAccount = 0;
		for (int i=0; i<bankAccountArray.length; i++){
			if(bankAccountArray[i] != null){
				if (bankAccountArray[i].getBalance()>highestBalance){
					highestBalance = bankAccountArray[i].getBalance();
					highestAccount = i;
				}
			}

		}
		if (amount<=bankAccountArray[highestAccount].getBalance()){
			bankAccountArray[highestAccount].withdraw(amount);
			return 0;
		}
		else{
			throw new IllegalArgumentException("No account with sufficient funds");
		}
		
	}
	public void depositInParts(double amount){
		int numNonNullAccounts = this.countNonNull();
		double newAmount = amount/numNonNullAccounts;
		if (this.countNonNull() != 0){
			for (int i=0; i<bankAccountArray.length;i++){
				if (bankAccountArray[i]!= null && numNonNullAccounts != 0){
					this.depositLowest(newAmount);
				}
			}
		}
	}
	public String toString() {
        StringBuilder bldr = new StringBuilder();
        if(bankAccountArray == null) bldr.append("null\n");
        else if(bankAccountArray.length == 0) bldr.append("empty\n");
        else for(int i = 0; i < bankAccountArray.length; i++)
            bldr.append("account " + i + ((bankAccountArray[i]==null?" is null\n":
                " has balance " + bankAccountArray[i].getBalance() + "\n")));
        return bldr.toString();
    }
}