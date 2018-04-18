
    public static void checkTransferMoney (long fromBalance, boolean fromLocked, boolean    toLocked, long sum) throws Exception{
        if (sum > fromBalance) throw new NotEnoughMoneyException();
        if (fromLocked || toLocked ) throw new AccountLockedException();
        if (sum <= 0) throw new IllegalArgumentException();
    }