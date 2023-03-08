package equalshashcode.test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class Account implements Comparable<Account> {
    private String username;
    private BigDecimal balance;
    private UUID uuid;

    public Account(String username, BigDecimal balance, UUID uuid) {
        this.username = username;
        this.balance = balance;
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object rval) {
        return rval instanceof Account &&
                Objects.equals(uuid, ((Account) rval).uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(uuid);
    }

    @Override
    public int compareTo(Account o) {
        int firstCompare = username.compareToIgnoreCase(o.username);
        if (firstCompare != 0)
            return firstCompare;
        int secondCompare = balance.compareTo(o.balance);
        if (secondCompare != 0)
            return secondCompare;
        return uuid.compareTo(o.uuid);
    }

    @Override
    public String toString() {
        return username + ": " + balance;
    }

}
