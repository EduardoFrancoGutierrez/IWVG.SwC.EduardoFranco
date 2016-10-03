package es.upm.miw.spai.test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.spai.ecp2.User;

public class UserTest {
    
    @Test
    public void testUser() {
        
        int number=2;
        String name="Eduardo";
        String familyName="FRANCO";
        User user = new User(number, name, familyName);
        assertEquals(2, user.getNumber());
        assertEquals("Eduardo", user.getName());
        assertEquals("Franco", user.getFamilyName());
    }

    @Test
    public void testFullName() {
       
        int number=2;
        String name="Eduardo";
        String familyName="FRANCO";
        User user = new User(number, name, familyName);
        assertEquals("Eduardo Franco",user.fullName());
        
    }

    @Test
    public void testInitials() {
        int number=2;
        String name="Eduardo";
        String familyName="FRANCO";
        User user = new User(number, name, familyName);
        assertEquals("E.",user.initials());
    }

    @Test
    public void testGetNametoUpper() {
        String name = "Eduardo";         
        User user = new User(name);
        assertEquals("EDUARDO",user.getNametoUpper());
    }
}
