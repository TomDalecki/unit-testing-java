package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
// BDD (Behavior Driven Development) zbiór dobrych praktyk
// BDD pomaga w radzeniu sobie ze złożonością testów oraz pomaga w pisaniu dobrych testów
// jedną z praktyk BDD jest podział kodu testu na trzy sekcje - given, when, then
class AccountTest {
    @Test
    void myTest(){
        //given - określa wstępne założenia naszego testu (tutaj jest to tworzenie nowego konta)
        //when - wykonywane są operacje których działanie chcemy przetestować
        Account newAccount = new Account();
        //then - umieszczamy nasze asercje
        assertFalse(newAccount.isActive(), "Check if new account is not active");

    }

    @Test
    void myTest2(){
        //given
        Account newAccount = new Account();
        assertFalse(newAccount.isActive());
        //when - tutaj when to wywołanie naszej metody activate
        newAccount.activate();
        //then
        assertTrue(newAccount.isActive());

        //test2 według BDD mamy źle napisany test, bo w jednym teście chcemy przetestować dwie asercje, które dodatkowo się wykluczają
        //BDD zakłada testowanie jednej funkcjonalności, jednej ścieżki naszej funkcjonalności
        //ten test trzeba rozbić na dwa oddzielne testy
        //asercji w jednym teście może być więcej, ale powinny one dotyczyć jednej ścieżki, jednej funkcjonalności

        //kontynuacja w klasie AccountTest2
    }
}
