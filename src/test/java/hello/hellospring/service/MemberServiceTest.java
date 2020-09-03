package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    MemberService memberService = new MemberService();
    @Test
    void  회원가() {
        Member member = new Member();
        member.setName("hello");
        
        Long saveId = memberService.join(member);
        
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    void findMembers() {
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Meber();
        member2.setName("spring");

        memberService.join(member1);
        IllegalStateException illegalStateException = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        asserThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//        try{
//            memberService.join(member2);
//            fail();
//        }catch(IllegalStateException e){
//            asserThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//        }
    }

    @Test
    void findOne() {
    }
}