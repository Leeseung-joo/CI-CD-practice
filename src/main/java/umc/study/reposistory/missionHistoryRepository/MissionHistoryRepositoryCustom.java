package umc.study.reposistory.missionHistoryRepository;

import java.util.List;
import umc.study.mapping.MissionHistory;
import umc.study.web.dto.MemberMissionResponse;

public interface MissionHistoryRepositoryCustom {
    List<MemberMissionResponse> findMissionsByMemberId(Long memberId);
}
