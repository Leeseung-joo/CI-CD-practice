package umc.study.reposistory;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import umc.study.domain.Member;
import umc.study.mapping.MissionHistory;

public interface MissionHistoryRepository extends JpaRepository<MissionHistory,Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("DELETE FROM MissionHistory mh WHERE mh.member = :member")
    void deleteByMember(Member member);
}
