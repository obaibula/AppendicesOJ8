package equalshashcode.test;

import reflection.interfacea.A;

import java.math.BigDecimal;
import java.util.*;

public class Test {
    private static Set<Account> test(Set<Account> testSet) {
        Account testAccount = new Account("herod", BigDecimal.valueOf(999.99), UUID.randomUUID());
        Collections.addAll(testSet,
                new Account("pituh", BigDecimal.ZERO, UUID.randomUUID()),
                new Account("pituh", BigDecimal.valueOf(24.18), UUID.randomUUID()),
                new Account("pituh", BigDecimal.valueOf(24.18), UUID.randomUUID()),
                new Account("chmo", BigDecimal.ONE, UUID.randomUUID()),
                new Account("gnyda", BigDecimal.valueOf(22.18), UUID.randomUUID()),
                new Account("vitalik", BigDecimal.TEN, UUID.randomUUID()),
                new Account("shasha", BigDecimal.valueOf(0.18), UUID.randomUUID()),
                testAccount
        );

        return testSet;
    }

    public static void main(String[] args) {
        TreeSet<Account> accountTreeSet = new TreeSet<>();
        HashSet<Account> accountHashSet= new HashSet<>();
        LinkedHashSet<Account> accountLinkedHashSet = new LinkedHashSet<>();

        Map<Account, String> accountMap = new TreeMap<>();

        System.out.println(test(accountTreeSet));
        System.out.println(test(accountHashSet));
        System.out.println(test(accountLinkedHashSet));

        accountTreeSet.forEach(a -> accountMap.put(a, a.getUsername()));


        System.out.println(accountMap);


    }
}
