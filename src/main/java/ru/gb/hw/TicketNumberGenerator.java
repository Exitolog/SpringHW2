package ru.gb.hw;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGenerator {

    public String createNewNumber(){
        return new String("Ticket # " + UUID.randomUUID().toString());
    }

}
