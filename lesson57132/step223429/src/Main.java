/**
 * Calculates the general sum of canceled transactions for all non empty accounts in the list
 */
public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        Long result = accounts.stream().filter(balance -> balance  .getBalance() > 0).
        map().
        filter(t -> t.getState().equals(State.CANCELED)).
                mapToLong(s -> s.getSum()).sum();
        return result.longValue();
    }