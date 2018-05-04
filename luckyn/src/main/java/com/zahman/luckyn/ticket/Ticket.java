package com.zahman.luckyn.ticket;

import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ticket {
  private final static Logger LOGGER = LoggerFactory.getLogger(Ticket.class);
  private int sizeOftArray;
  private int numberOfTips;
  private Set<Integer> tips;
  private long id;
  private static long count;
 


  public Ticket(int sizeOftArray, int numberOfTips) {
    super();
    LOGGER.debug("Creating ticket with size of play array {} and number of tips {}", sizeOftArray,
        numberOfTips);
    this.sizeOftArray = sizeOftArray;
    this.numberOfTips = numberOfTips;
    count++;
    id = count;
  }

  public Set<Integer> getTips() {
    return tips;
  }

  public void setTips(Set<Integer> tips) {
    this.tips = tips;
  }

  public int getSizeOftArray() {
    return sizeOftArray;
  }

  public void setSizeOftArray(int sizeOftArray) {
    this.sizeOftArray = sizeOftArray;
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
