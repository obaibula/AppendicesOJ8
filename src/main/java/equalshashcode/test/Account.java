package equalshashcode.test;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    String username;
    BigDecimal balance;

    public Account(String username, BigDecimal balance) {
        this.username = username;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object rval) {
        return rval instanceof Account &&
                Objects.equals(username, ((Account) rval).username);
    }
}
