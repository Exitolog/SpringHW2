package ru.gb.hw;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Component
public class Scoreboard {

    private TicketNumberGenerator ticketNumberGenerator;

    public Scoreboard(TicketNumberGenerator ticketNumberGenerator) {
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    public Ticket newTicket(){
      return new Ticket(ticketNumberGenerator.createNewNumber(), LocalDateTime.now());
    }

}
