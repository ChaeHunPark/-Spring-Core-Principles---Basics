package Hello.core;

import Hello.core.discount.FixDiscountPolicy;
import Hello.core.member.MemberService;
import Hello.core.member.MemberServiceImpl;
import Hello.core.member.MemoryMemberRepository;
import Hello.core.order.OrderService;
import Hello.core.order.OrderServiceImpl;


// 생성자한 객체 인스턴스의 참조(레퍼런스)를 생성자를 통해서 주입(연결)해준다. (injection)
// 의존성 주입(Dependency Injection)
public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(),new FixDiscountPolicy());
    }
}
