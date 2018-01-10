package models;
import org.junit.*;
import static org.junit.Assert.*;


public class EventTest {

    @Test
    public void runEvent_initiatesEvent() {
        Event testEvent = new Event(20, "Chicken", "Soda", "DJ", "");
        assertEquals(true,testEvent instanceof Event);
    }

    @Test
    public void getGuest() {
        Event testEvent = new Event(20, "Chicken", "Soda", "DJ", "");
        assertEquals(20, testEvent.getGuest());
    }

    @Test
    public void getFood() {
        Event testEvent = new Event(20, "Chicken", "Soda", "DJ", "");
        assertEquals("Chicken", testEvent.getFood());
    }

    @Test
    public void getDrink() {
        Event testEvent = new Event(20, "Chicken", "Soda", "DJ", "");
        assertEquals("Soda", testEvent.getDrink());
    }

    @Test
    public void getEntertainment() {
        Event testEvent = new Event(20, "Chicken", "Soda", "DJ", "");
        assertEquals("DJ", testEvent.getEntertainment());
    }

    @Test
    public void getCoupon() {
        Event testEvent = new Event(20, "Chicken", "Soda", "DJ", "");
        assertEquals("", testEvent.getCoupon());
    }

    @Test
    public void getPlate() {
        Event testEvent = new Event(20, "Chicken", "Soda", "DJ", "");
        assertEquals(0, testEvent.getPlate());
    }
    @Test
    public void calculatePlate() {
        Event testEvent = new Event(20, "Chicken", "Soda", "DJ", "");
        assertEquals(32, testEvent.calculatePlate());
    }
    @Test
    public void calculatePlate_Spirit() {
        Event testEvent = new Event(20, "Chicken", "Spirit", "DJ", "");
        assertEquals(32, testEvent.calculatePlate());
    }
    @Test
    public void calculateTotal_Cost() {
        Event testEvent = new Event(20, "Chicken", "Spirit", "DJ", "FREE DJ");
        assertEquals(790, testEvent.totalCost());
    }
}