package org.eternity.theater.step01;


// 3. 관람객이 소지품을 보관할 용도로 가방을 들고 올 수 있다 - (가정)
public class Bag {
    private Long amount;    // 티켓을 구매할 현금
    private Invitation invitation;  // 초대장
    private Ticket ticket;  // 티켓

    /**
     * (1) 이벤트에 당첨된 관람객의 가방 안에는 '현금+초대장'을 가지고 있다.
     * (2) 이벤트에 당첨되지 않은 관람객의 가방 안에는 'only 현금'만 가지고 있다.
     * 이 2가지 제약을 강제할 수 있도록 생성자를 추가한다.
     *
     * @param amount
     */

    // (2) 이벤트에 당첨되지 않은 관람객의 가방 안에는 'only 현금'만 가지고 있다.
    public Bag(long amount) {
        this(null, amount);
    }

    // (1) 이벤트에 당첨된 관람객의 가방 안에는 '현금+초대장'을 가지고 있다.
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
