package com.zahman.luckyn.ticket;

import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zahman.luckyn.numbergen.NumberGenerator;


public class FillTicket {
  private final static Logger LOGGER = LoggerFactory.getLogger(NumberGenerator.class);
  private Set<Integer> usedNumbersTickets;
  private Set<Integer> usedNumberOneTicket;


  public FillTicket() {
    super();
    usedNumbersTickets = new HashSet<>();
    usedNumberOneTicket = new HashSet<>();

  }


  public void fillTickets(boolean repeatNumberForOtherTickets, Ticket... tickets) {
    int temp;
    LOGGER.debug("Generate number for {} ticket ", tickets.length);
    for (Ticket t : tickets) {
      LOGGER.debug("Start genereting to ticket id {}", t.getId());
      usedNumberOneTicket = new HashSet<>();
      {
        temp = NumberGenerator.numberFromRange(1, t.getSizeOftArray());
        LOGGER.debug("Generate number from range {} to {} is value {}", 1, t.getSizeOftArray(),
            temp);

        if (usedNumbersTickets.add(temp)) {
          LOGGER.debug("Number {} is added to ticket id {}", temp, t.getId());
          usedNumberOneTicket.add(temp);
        }
        if (usedNumbersTickets.size() == t.getSizeOftArray()) {
          LOGGER.debug("All numbers was used. Memory deleted");
          usedNumbersTickets = new HashSet<>();
        }
      }
      while (usedNumberOneTicket.size() < t.getNumberOfTips());
      t.setTips(usedNumberOneTicket);
      if (repeatNumberForOtherTickets) {
        LOGGER.debug("Used numbers deleted,Other ticket can contain same numbers like previous");
        usedNumbersTickets = new HashSet<>();
      }
    }
  }

}
