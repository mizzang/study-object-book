package org.eternity.theater.step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// 5. 매표소 관람객에게 판매할 티켓과 티켓의 판매 금액이 보관돼 있어야 한다.
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // 편의상 티켓 컬렉션의 맨 첫 번째 위치에 저장된 티켓을 반환하는 것으로 구현함
    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
