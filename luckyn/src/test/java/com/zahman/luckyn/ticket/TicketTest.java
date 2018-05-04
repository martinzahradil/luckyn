package com.zahman.luckyn.ticket;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicketTest {

  @Test
  public void constructorTest() {
    Ticket ticket = new Ticket(49, 6);
    assertEquals(6, ticket.getNumberOfTips());
    assertEquals(49, ticket.getNumberOfPosibilities());


  }

}
