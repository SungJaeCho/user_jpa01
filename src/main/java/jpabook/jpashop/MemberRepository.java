package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId(); // command와 query를 분리해라 member를 리턴해주지않음
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }


}
