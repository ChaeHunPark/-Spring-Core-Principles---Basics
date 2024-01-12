package Hello.core.discount;

import Hello.core.member.Grade;
import Hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmout = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){ // Enum type은 ==으로 비교
            return discountFixAmout;
        }

        return 0;
    }
}
