package Hello.core.discount;

import Hello.core.member.Grade;
import Hello.core.member.Member;


/* 정률할인 정책 구현*/
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        }
        return 0;
    }
}
