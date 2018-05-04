package com.zahman.luckyn.ticket;

import org.junit.Test;

public class FillTicketTest {

  @Test
  public void testFillTickets() {
    Ticket ticket1 = new Ticket(49, 6);
    Ticket ticket2 = new Ticket(49, 5);
    Ticket ticket3 = new Ticket(49, 8);
    Ticket ticket4 = new Ticket(68, 3);
    Ticket ticket5 = new Ticket(10, 2);
    FillTicket fill = new FillTicket();
    fill.fillTickets(ticket1, ticket2, ticket3, ticket4, ticket5);
  }

}
