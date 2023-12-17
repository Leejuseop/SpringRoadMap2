package hello.core.discount;

import org.springframework.stereotype.Component;

import hello.core.member.Grade;
import hello.core.member.Member;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int rate = 10;

    @Override
    public int discount(Member member, int price){
        if(member.getGrade() == Grade.VIP){
            return price*rate/100;
        }
        else{
            return 0;
        }
    }
}
