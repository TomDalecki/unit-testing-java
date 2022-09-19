package testing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// BDD określa sposób nazywania testów
// testy nazywamy dokładnie według funkcjonalności którą dany test ma sprawdzać

public class AccountTest2 {
    @Test
    void newAccountShouldBeNotActiveAfterCreation(){
        //given
        //when
        Account newAccount = new Account();
        //then
        assertFalse(newAccount.isActive(), "Check if new account is not active");

    }

    @Test
    void AccountShouldBeActiveAfterActivation(){
        //given
        Account newAccount = new Account();
        assertFalse(newAccount.isActive());
        //when
        newAccount.activate();
        //then
        assertTrue(newAccount.isActive());
    }

    @Test
    void newlyCreatedAccountShouldNotHaveDefaultDeliveryAddress(){
        //given
        Account account = new Account();
        //when
        Address address = account.getDefoultDeliveryAdress();

        //then
        assertNull(address);
    }

    @Test
    void defaultDeliveryAddressShouldNotBeNullAfterBeingSet(){
        //given
        Account account = new Account();
        Address address = new Address("Sezmkowa", "45");
        account.setDefoultDeliveryAdress(address);
        //when
        Address defaultAddress = account.getDefoultDeliveryAdress();
        //then
        assertNotNull(defaultAddress);

    }
}
