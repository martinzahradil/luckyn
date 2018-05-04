package com.zahman.luckyn.numbergen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberGenerator {
  private final static Logger LOGGER = LoggerFactory.getLogger(NumberGenerator.class);

  public static int numberFromRange(int startRange, int endRange) {
    LOGGER.debug("Generate number from {} to {}", startRange, endRange);
    int temp = (int) Math.round(Math.random() * (endRange - startRange));
    LOGGER.debug("Final random number from {} to {} is {}", startRange, endRange,
        temp + startRange);
    return startRange + temp;

  }
  
  

}
