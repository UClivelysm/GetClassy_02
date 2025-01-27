import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product1, product2, product3;
    @BeforeEach
    void setUp() {
        product1 = new Product("000001", "productName1", "ProductDescription1", 299.99);
        product2 = new Product("000001", "productName1", "ProductDescription1", 299.99);
        product3 = new Product("000002", "productName2", "ProductDescription2", 499.99);
    }

    @Test
    void setID() {
        product1.setID("000004");
        assertEquals("000004", product1.getID());
    }

    @Test
    void setName() {
        product1.setName("DifferentName");
        assertEquals("DifferentName", product1.getName());
    }

    @Test
    void setDescription() {
        product1.setDescription("DifferentDescription");
        assertEquals("DifferentDescription", product1.getDescription());
    }

    @Test
    void setCost() {
        product1.setCost(699.99);
        assertEquals(699.99, product1.getCost());
    }

    @Test
    void testHashCode() {
        assertEquals(product1.hashCode(), product2.hashCode());

        assertTrue(product1.hashCode() !=product3.hashCode());
    }

    @Test
    void testToString() {
        String expectedString = "Product{ID='000001', Name='productName1', Description='ProductDescription1', Cost='299.99'}";
        assertEquals(expectedString, product1.toString());
    }

    @Test
    void testEquals() {
        assertTrue(product1.equals(product2));

        assertFalse(product1.equals(product3));

        assertFalse(product1.equals(null));

        assertFalse(product1.equals("string"));
    }
}