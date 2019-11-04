package org.eternity.theater.step01;


// 6. 판매원 매표소에서 초대장을 티켓으로 교환 or 티켓을 판매하는 역할을 수행한다.
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
