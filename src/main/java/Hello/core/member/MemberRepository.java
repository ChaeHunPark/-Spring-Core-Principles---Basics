package Hello.core.member;

public interface MemberRepository {
    void save(Member member); // 멤버 저장

    Member findById(Long memberId); // 아이디 조회
}
