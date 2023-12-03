package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /*
     * @return 할인금액 (할인된 금액이 아닌) 
     */

    public int discount(Member member, int price);
}
