package umc.study.reposistory.missionHistoryRepository;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import umc.study.domain.Member;
import umc.study.mapping.MissionHistory;

public interface MissionHistoryRepository extends JpaRepository<MissionHistory,Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("DELETE FROM MissionHistory mh WHERE mh.member = :member")
    void deleteByMember(Member member);

    @Query("""
    SELECT 
        m.id,
        m.title,
        r.name,
        mh.status,
        mh.price,
        mh.deadLine,
        mh.point
    
    FROM MissionHistory mh
    JOIN mh.misson m
    JOIN m.restaurant r
    WHERE mh.member.id = :memberId
""")
    List<MissionHistory> findAllByMemberId(Long memberId);
}
