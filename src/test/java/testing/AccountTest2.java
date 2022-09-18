package testing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

}
