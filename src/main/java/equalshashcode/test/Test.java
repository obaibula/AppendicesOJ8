package equalshashcode.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Account account1 = new Account("Pituh", BigDecimal.ZERO);
        Account account2 = new Account("Pituh", BigDecimal.valueOf(24.18));

        System.out.println(account1.equals(account2));
    }
}
