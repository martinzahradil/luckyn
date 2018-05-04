package com.zahman.luckyn.ticket;

import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ticket {
  private final static Logger LOGGER = LoggerFactory.getLogger(Ticket.class);
  private int numberOfPosibilities;
  private int numberOfTips;
  private Set<Integer> tips;
  private long id;
  private static long count;



  public Ticket(int numberOfPosibilities, int numberOfTips) {
    super();
    this.numberOfPosibilities = numberOfPosibilities;
    this.numberOfTips = numberOfTips;
    count++;
    id = count;
    LOGGER.debug("Creating ticket id {} with size of play array {} and number of tips {}", id,
        numberOfPosibilities, numberOfTips);
  }

  public Set<Integer> getTips() {
    return tips;
  }

  public void setTips(Set<Integer> tips) {
    this.tips = tips;
  }

  public int getNumberOfPosibilities() {
    return numberOfPosibilities;
  }

  public void setNumberOfPosibilities(int sizeOftArray) {
    this.numberOfPosibilities = sizeOftArray;
  }

  public int getNumberOfTips() {
    return numberOfTips;
  }

  public void setNumberOfTips(int numberOfTips) {
    this.numberOfTips = numberOfTips;
  }

  public long getId() {
    return id;
  }



}
