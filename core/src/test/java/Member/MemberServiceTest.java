package Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceimpl();

    @Test
    public void join(){
        //given 
        Member member = new Member(1L, "memberA", Grade.VIp);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
