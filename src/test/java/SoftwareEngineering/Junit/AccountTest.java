package SoftwareEngineering.Junit;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testWithdraw1(){
        Account account = new Account("JE-Chen",10000L,400000.5f);
        boolean canDeposit = account.withdraw(100000000.f,5f);
        assertFalse(canDeposit);
    }
    @Test
    public void testWithdraw2(){
        Account account = new Account("JE-Chen",10000L,400000.5f);
        boolean canDeposit = account.withdraw(1000.f,5f);
        assertTrue(canDeposit);
    }

    @Test
    public void testDeposit1(){
        Account account = new Account("JE-Chen",10000L,400000.5f);
        boolean canDeposit = account.deposit(-20.f);
        assertFalse(canDeposit);
    }

    @Test
    public void testDeposit2(){
        Account account = new Account("JE-Chen",10000L,400000.5f);
        boolean canDeposit = account.deposit(200.f);
        assertTrue(canDeposit);
    }
}
