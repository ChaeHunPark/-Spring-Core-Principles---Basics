package Hello.core.order;


import Hello.core.discount.DiscountPolicy;
import Hello.core.discount.FixDiscountPolicy;
import Hello.core.member.Member;
import Hello.core.member.MemberRepository;
import Hello.core.member.MemoryMemberRepository;

//주문 서비스 구현체
public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
      Member member = memberRepository.findById(memberId); //회원 정보 조회
      int discountPrice = discountPolicy.discount(member, itemPrice); // 할인 정책 확인

      return new Order(memberId, itemName, itemPrice, discountPrice); //최종 주문 반환
    };
}
