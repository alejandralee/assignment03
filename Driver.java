package assignment03;

public class Driver {

    public static void main(String[] args) {
        BankAccount[] arr1 = null;
        BankAccount[] arr2 = {};
        BankAccount[] arr3 = {null, null, null, null, null};
        BankAccount[] arr4 = {
                new BankAccount(200),
                new BankAccount(300),
                new BankAccount(250),
                new BankAccount(300),
                new BankAccount(200)
                };
        BankAccount[] arr5 = {
                null, null,
                new BankAccount(200),
                new BankAccount(300),
                null,
                new BankAccount(250),
                new BankAccount(300),
                null, null, 
                new BankAccount(200),
                null};
		BankAccount[] arr6 = {new BankAccount (6000), 
				null, new BankAccount(1000),
				new BankAccount(273849759)};
		BankAccount[] arr7 = {new BankAccount (0),
				new BankAccount(1), new BankAccount(2),
				new BankAccount(3)};
			


// test all of the following for all the groups above
//      public double removeAccount(int i)
//      public void insertAccount(int i, BankAccount ac)
//      public int countNonNull()
//      public void evenUpAccounts()
//      public double withdrawHighest(double amount)
//      public void depositInParts(double amount)

// For arr1 
        BankAccountGroup test1 = new BankAccountGroup(arr1);   
		System.out.println(test1);
        try {
            test1.removeAccount(0);
        } catch (NullPointerException e) {
            System.out.println("1.1. As expected, null pointer exception");
        } 
		
        // insert account
        try {
            test1.insertAccount(0, new BankAccount(250));
        } catch (NullPointerException e) {
            System.out.println("1.2. As expected, null pointer exception");
        }
		
		//count non null
        try {
            test1.countNonNull();
        } catch (NullPointerException e) {
            System.out.println("1.3. As expected, null pointer exception");
        }
		
		//even up accounts
        try {
            test1.evenUpAccounts();
        } catch (NullPointerException e) {
            System.out.println("1.4. As expected, null pointer exception");
        }
		
		//withdraw highest
        try {
            test1.withdrawHighest(200);
        } catch (NullPointerException e) {
            System.out.println("1.5. As expected, null pointer exception");
        }
		
		//deposit in parts
        try {
            test1.depositInParts(300);
        } catch (NullPointerException e) {
            System.out.println("1.5. As expected, null pointer exception");
        }
		System.out.println(test1);
// For arr2 
        BankAccountGroup test2 = new BankAccountGroup(arr2); 
		System.out.println(test2);
        try {
            test2.removeAccount(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2.1. As expected, the index is out of bounds");
        } 
		
        // insert account
        try {
            test2.insertAccount(0, new BankAccount(250));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2.2. As expected, the index is out of bounds");
        }
		
		//count non null
        try {
            test2.countNonNull();
			System.out.println("2.3. Succesfully counted the number of non null accounts: " + test2.countNonNull());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2.3. As expected, the index is out of bounds");
        }
		
		//even up accounts
        try {
            test2.evenUpAccounts();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2.4. As expected, the index is out of bounds");
        }
		
		//withdraw highest
        try {
            test2.withdrawHighest(200);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2.5. As expected, the index is out of bounds");
        }
		
		//deposit in parts
        try {
            test2.depositInParts(300);
        } catch (NullPointerException e) {
            System.out.println("2.5. As expected, null pointer exception");
        }
		System.out.println(test2);

// For arr3 
        BankAccountGroup test3 = new BankAccountGroup(arr3);  
		System.out.println(test3);
        try {
            test3.removeAccount(0);
        } catch (NullPointerException e) {
            System.out.println("3.1. As expected, the index is out of bounds");
        } 
		
        // insert account
        try {
            test3.insertAccount(0, new BankAccount(250));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3.2. As expected, the index is out of bounds");
        }
		
		//count non null
        try {
            test3.countNonNull();
			System.out.println("3.3. Succesfully counted the number of non null accounts: " + test3.countNonNull());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3.3. As expected, the index is out of bounds");
        }
		
		//even up accounts
        try {
            test3.evenUpAccounts();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3.4. As expected, the index is out of bounds");
        }
		
		//withdraw highest
        try {
            test3.withdrawHighest(200);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3.5. As expected, the index is out of bounds");
        }
		
		//deposit in parts
        try {
            test3.depositInParts(300);
        } catch (NullPointerException e) {
            System.out.println("3.6. As expected, null pointer exception");
        }
		System.out.println(test3);

// For arr4 
        BankAccountGroup test4 = new BankAccountGroup(arr4); 
		System.out.println(test4);
        try {
            test4.removeAccount(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4.1. As expected, the index is out of bounds");
        } 
		
        // insert account
        try {
            test4.insertAccount(0, new BankAccount(250));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4.2. As expected, the index is out of bounds");
        }
		
		//count non null
        try {
            test4.countNonNull();
			System.out.println("4.3. Succesfully counted the number of non null accounts: " + test2.countNonNull());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4.3. As expected, the index is out of bounds");
        }
		
		//even up accounts
        try {
            test4.evenUpAccounts();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4.4. As expected, the index is out of bounds");
        }
		
		//withdraw highest
        try {
            test4.withdrawHighest(200);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4.5. As expected, the index is out of bounds");
        }
		
		//deposit in parts
        try {
            test4.depositInParts(300);
        } catch (NullPointerException e) {
            System.out.println("4.5. As expected, null pointer exception");
        }
		System.out.println(test4);

// For arr5 
        BankAccountGroup test5 = new BankAccountGroup(arr5);  
		System.out.println(test5);
        try {
            test5.removeAccount(0);
        } catch (NullPointerException e) {
            System.out.println("5.1. As expected, the index is out of bounds");
        } 
		
        // insert account
        try {
            test5.insertAccount(0, new BankAccount(250));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5.2. As expected, the index is out of bounds");
        }
		
		//count non null
        try {
            test5.countNonNull();
			System.out.println("5.3. Succesfully counted the number of non null accounts: " + test2.countNonNull());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5.3. As expected, the index is out of bounds");
        }
		
		//even up accounts
        try {
            test5.evenUpAccounts();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5.4. As expected, the index is out of bounds");
        }
		
		//withdraw highest
        try {
            test5.withdrawHighest(200);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("5.5. As expected, the index is out of bounds");
        }
		
		//deposit in parts
        try {
            test5.depositInParts(300);
        } catch (NullPointerException e) {
            System.out.println("5.6. As expected, null pointer exception");
        }
		System.out.println(test5);
		
// For arr6 
        BankAccountGroup test6 = new BankAccountGroup(arr6);  
		System.out.println(test6);
        try {
            test6.removeAccount(0);
        } catch (NullPointerException e) {
            System.out.println("6.1. As expected, the index is out of bounds");
        } 
		
        // insert account
        try {
            test6.insertAccount(0, new BankAccount(250));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("6.2. As expected, the index is out of bounds");
        }
		
		//count non null
        try {
            test6.countNonNull();
			System.out.println("6.3. Succesfully counted the number of non null accounts: " + test2.countNonNull());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("6.3. As expected, the index is out of bounds");
        }
		
		//even up accounts
        try {
            test6.evenUpAccounts();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("6.4. As expected, the index is out of bounds");
        }
		
		//withdraw highest
        try {
            test6.withdrawHighest(200);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("6.5. As expected, the index is out of bounds");
        }
		
		//deposit in parts
        try {
            test6.depositInParts(300);
        } catch (NullPointerException e) {
            System.out.println("6.6. As expected, null pointer exception");
        }
		System.out.println(test6);
		
// For arr7 
        BankAccountGroup test7 = new BankAccountGroup(arr7);  
		System.out.println(test7);
        try {
            test7.removeAccount(0);
        } catch (NullPointerException e) {
            System.out.println("7.1. As expected, the index is out of bounds");
        } 
		
        // insert account
        try {
            test7.insertAccount(0, new BankAccount(250));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("7.2. As expected, the index is out of bounds");
        }
		
		//count non null
        try {
            test7.countNonNull();
			System.out.println("7.3. Succesfully counted the number of non null accounts: " + test2.countNonNull());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("7.3. As expected, the index is out of bounds");
        }
		
		//even up accounts
        try {
            test7.evenUpAccounts();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("7.4. As expected, the index is out of bounds");
        }
		
		//withdraw highest
        try {
            test7.withdrawHighest(200);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("7.5. As expected, the index is out of bounds");
        }
		
		//deposit in parts
        try {
            test7.depositInParts(300);
        } catch (NullPointerException e) {
            System.out.println("7.6. As expected, null pointer exception");
        }
		System.out.println(test7);
// In the tests that follow, you can cheat about setting up the exceptions:
// Try it and see what happens first.
// If your test throws an exception, just go back and put in a try and
// catch around that line and then a println saying it was expected.
// It's like someone screwing up and then saying "I meant to do that!"
// Other exceptions are
// ArrayIndexOutOfBoundsException and IllegalArgumentException

// For arr4
        //BankAccountGroup test4 = new BankAccountGroup(arr4);
        System.out.println("Before:");
        System.out.println(test4);
        test4.removeAccount(2);
        System.out.println("After:");
        System.out.println(test4);
        System.out.println("4.1. As expected the account[2] was set "
                + "to null");

        try {
            test4.removeAccount(arr4.length);           
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("4.2. As expected there is no bounds "
                    + "check in the code of the method");           
        }

    }
}