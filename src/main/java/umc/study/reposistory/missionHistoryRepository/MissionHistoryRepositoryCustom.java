package umc.study.reposistory.missionHistoryRepository;

import java.util.List;
import umc.study.web.response.MemberMissionResponse;

public interface MissionHistoryRepositoryCustom {
    List<MemberMissionResponse> findMissionsByMemberId(Long memberId);
}
