package com.zahman.luckyn.ticket;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

public class FillTicketTest {

  @Test
  public void testFillTickets() {

    FillTicket fill = new FillTicket();
    List<Ticket> tickets = fill.createTickets(10, 49, 6);
    fill.fillTickets(false, tickets);
    fill.showTickets(tickets);
    assertEquals(10, tickets.size());

  }

}
