package finalProject;

/**
 *
 * @author rebur
 */
public class AccountDatabase {
    
    //List of Accounts in the database.
    private static final Account[] accounts = {
        new Account("Alex", "password1", new Cart()),
        new Account("John", "password2", new Cart()),
        Manager.getInstance() //Manager is a Singleton.
    };

    /**
     * Finds and returns account with credentials matching the input.
     * @param username  the string in the username text box.
     * @param password  the string in the password text box.
     * @return account  the account matching the credentials.
     */
    public static Account getAccount(String username, String password) {
        for (Account account : accounts) {
            if (!account.getUsername().equals(username) 
                    || !account.checkPassword(password)){
            } else {
                return account;
            }
        }
        return null;
    }
}

