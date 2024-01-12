package Hello.core.member;


// 멤버서비스 구현체
public class MemberServiceImpl implements MemberService{


    //DIP 위반중이다.
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
