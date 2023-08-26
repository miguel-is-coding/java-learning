package unit.constructor_challenge;

import org.constructor_challenge.Customer;
import org.junit.Assert;
import org.junit.Test;

public class TestCustomerShould {
    @Test
    public void have_name_credit_limit_and_email_address() throws Exception {
        Customer customer = new Customer("Miguel", 500, "test@test.com");

        Assert.assertEquals("Miguel", customer.getName());
        Assert.assertEquals(500, customer.getCreditLimit());
        Assert.assertEquals("test@test.com", customer.getEmail());
    }

    @Test
    public void have_default_values_when_none_information_is_added() throws Exception {
        Customer customer = new Customer();

        Assert.assertEquals("Guest", customer.getName());
        Assert.assertEquals(100, customer.getCreditLimit());
        Assert.assertEquals("example@example.net", customer.getEmail());
    }

    @Test
    public void have_default_credit_limit_when_name_and_email_are_assigned() throws Exception {
        Customer customer = new Customer("Maria", "maria@test.com");

        Assert.assertEquals("Maria", customer.getName());
        Assert.assertEquals(100, customer.getCreditLimit());
        Assert.assertEquals("maria@test.com", customer.getEmail());
    }
}
