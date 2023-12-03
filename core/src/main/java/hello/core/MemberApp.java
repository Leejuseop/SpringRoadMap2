package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceimpl();
        Member member = new Member(1L, "memberA", Grade.VIp);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("회원 아이디 : " + findMember.getId() + "\n회원 이름 : " + findMember.getName());
    }
}
