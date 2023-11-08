package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Member member2 = new Member(110L, "youngkwang2");
//            em.persist(member2);
//
//            Member findmember = em.find(Member.class, 100L);
//            System.out.println("findmember.getId() = " + findmember.getId());
//
////            member2.setId(103L);
////            System.out.println("findmember2.getId() = " + findmember.getId());
//
//
////            member2.setId(103L);
////
////            Member findmember = em.find(Member.class, 100L);
////            System.out.println("findmember.getName() = " + findmember.getName());

            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
