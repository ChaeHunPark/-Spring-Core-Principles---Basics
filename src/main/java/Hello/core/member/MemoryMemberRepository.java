package Hello.core.member;

import java.util.HashMap;
import java.util.Map;


// 메모리 저장소 구현체 조립품...
public class MemoryMemberRepository implements MemberRepository{

    // 실무에서는 Concurrent HashMap을 써야한다. 동시성 이슈.
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
