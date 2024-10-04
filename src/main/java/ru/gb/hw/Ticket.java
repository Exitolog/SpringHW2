package ru.gb.hw;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class Ticket {
    private String numberTicket;
    private LocalDateTime createAt;

    public Ticket(String numberTicket, LocalDateTime time) {
        this.numberTicket = numberTicket;
        this.createAt = time;
    }

    public String getNumberTicket() {
        return numberTicket;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ticket.class.getSimpleName() + "[", "]")
                .add("numberTicket='" + numberTicket + "'")
                .add("createAt=" + createAt)
                .toString();
    }
}
