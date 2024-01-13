package Hello.core;

import Hello.core.discount.DiscountPolicy;
import Hello.core.discount.FixDiscountPolicy;
import Hello.core.member.MemberRepository;
import Hello.core.member.MemberService;
import Hello.core.member.MemberServiceImpl;
import Hello.core.member.MemoryMemberRepository;
import Hello.core.order.OrderService;
import Hello.core.order.OrderServiceImpl;


// 생성자한 객체 인스턴스의 참조(레퍼런스)를 생성자를 통해서 주입(연결)해준다. (injection)
// 의존성 주입(Dependency Injection)
public class AppConfig {

    //역할
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    //구현
    //메서드명이 드러나도록 리팩토링, Service에서 사용할 객체를 바꾸려면 이 코드를 고치면된다.
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    //역할
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }


    //구현
    public DiscountPolicy discountPolicy(){
        return new DiscountPolicy();
    }
}
