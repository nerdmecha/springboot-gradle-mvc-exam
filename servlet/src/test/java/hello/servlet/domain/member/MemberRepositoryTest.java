package hello.servlet.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.assertj.core.api.Assertions;

class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        // GIVEN
        Member member = new Member("hello", 20);
        // WHEN
        Member savedMember =  memberRepository.save(member);
        // THEN
        Member findMember = memberRepository.findById(savedMember.getId());
        Assertions.assertThat(findMember).isEqualTo(savedMember);
    }

    @Test
    void findAll() {
        // GIVEN
        Member member01 = new Member("member01", 20);
        Member member02 = new Member("member02", 24);
        
        memberRepository.save(member01);
        memberRepository.save(member02);
        // WHEN
        List<Member> result = memberRepository.findAll();
        // THEN
        Assertions.assertThat(result.size()).isEqualTo(2);
        Assertions.assertThat(result).contains(member01, member02);
    }
}