package com.zahman.luckyn.ticket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zahman.luckyn.numbergen.NumberGenerator;

public class Ticket {
  private final static Logger LOGGER = LoggerFactory.getLogger(Ticket.class);
  private int sizeOftArray;
  private int numberOfTips;
  private int[] tips;
  private long id;
  private static long count;


  public Ticket(int sizeOftArray, int numberOfTips) {
    super();
    LOGGER.debug("Creating ticket with size of play array {} and number of tips {}", sizeOftArray,
        numberOfTips);
    this.sizeOftArray = sizeOftArray;
    this.numberOfTips = numberOfTips;
    tips = new int[numberOfTips];
    count++;
    id = count;
  }

  public int[] getTips() {
    return tips;
  }

  public void setTips(int[] tips) {
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
