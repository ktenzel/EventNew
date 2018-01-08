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

    }
//
//    @Test
//    public void getDrink() {
//    }
//
//    @Test
//    public void getEntertainment() {
//    }
//
//    @Test
//    public void getCoupon() {
//    }
//
//    @Test
//    public void calculatePlate() {
//    }
//
//    @Test
//    public void totalCost() {
//    }
}