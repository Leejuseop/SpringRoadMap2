package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    final static int FixDiscountAmount = 1000;

    @Override
    public int discount(Member member, int price){
        if(member.getGrade() == Grade.VIP){
            return FixDiscountAmount;
        }
        else{
            return 0;
        }
    }
}
