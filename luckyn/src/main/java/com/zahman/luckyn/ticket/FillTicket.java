package com.zahman.luckyn.ticket;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zahman.luckyn.numbergen.NumberGenerator;


public class FillTicket {
  private final static Logger LOGGER = LoggerFactory.getLogger(FillTicket.class);
  private Set<Integer> usedNumbersTickets;
  private Set<Integer> usedNumberOneTicket;


  public FillTicket() {
    super();
    usedNumbersTickets = new HashSet<>();
    usedNumberOneTicket = new HashSet<>();

  }


  public List<Ticket> createTickets(int numberOfTickets, int numberOfPossibilities,
      int numberOfTips) {
    List<Ticket> ticket = new ArrayList<>();
    LOGGER.debug("Generate number for {} ticket ", numberOfTickets);
    for (int i = 0; i < numberOfTickets; i++) {
      Ticket t = new Ticket(numberOfPossibilities, numberOfTips);
      ticket.add(t);
    }
    return ticket;
  }


  public void fillTickets(boolean repeatNumberForOtherTickets, List<Ticket> list) {
    int temp;
    LOGGER.debug("Generate numbers for {} ticket ", list.size());
    for (Ticket t : list) {
      LOGGER.debug("Start genereting to ticket id {}", t.getId());
      usedNumberOneTicket = new HashSet<>();
      do {
        temp = NumberGenerator.numberFromRange(1, t.getNumberOfPosibilities());
        LOGGER.debug("Generate number from range {} to {} is value {}", 1,
            t.getNumberOfPosibilities(), temp);

        if (usedNumbersTickets.add(temp)) {
          LOGGER.debug("Number {} is added to ticket id {}", temp, t.getId());
          usedNumberOneTicket.add(temp);
        }
        if (usedNumbersTickets.size() == t.getNumberOfPosibilities()) {
          LOGGER.debug("All numbers was used. Memory deleted");
          usedNumbersTickets = new HashSet<>();
        }
      } while (usedNumberOneTicket.size() < t.getNumberOfTips());
      t.setTips(usedNumberOneTicket);
      if (repeatNumberForOtherTickets) {
        LOGGER.debug("Used numbers deleted,Other ticket can contain same numbers like previous");
        usedNumbersTickets = new HashSet<>();
      }
    }

  }

  public void showTickets(List<Ticket> list) {
    for (Ticket t : list) {
      LOGGER.debug("Ticket id {} have this values {}", t.getId(), t.getTips().toString());
    }

  }

}
