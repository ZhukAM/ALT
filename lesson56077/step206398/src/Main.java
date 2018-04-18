/**
 * The method change the balance of the given account according to an operation.
 * @param account
 * @param operation
 * @return true if the balance has changed, otherwise - false.
 */
class Main {
    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        long balance = account.getBalance();
        if (operation.equals(Operation.DEPOSIT)) {
            account.setBalance(balance + sum);
            return true;
        }
        else if (operation.equals(Operation.WITHDRAW) && sum <= balance) {
            account.setBalance(account.getBalance() - sum);
            return true;
        }
        else {
            System.out.println("Not enough money to withdraw.");
            return false;
        }
    }
}

enum Operation {
    /**
     * deposit (add) an amount into an Account
     */
    WITHDRAW,
    /**
     * withdraw (subtract) an amount from an Account
     */
    DEPOSIT
}

class Account {

    private String code;
    private Long balance;

    public String getCode() {
        return code;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}