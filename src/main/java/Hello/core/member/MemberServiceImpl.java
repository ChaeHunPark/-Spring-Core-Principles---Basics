package Hello.core.member;


// 멤버서비스 구현체
public class MemberServiceImpl implements MemberService{


    // 이제는 추상화에만 의존중이다.
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
