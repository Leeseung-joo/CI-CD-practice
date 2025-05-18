package umc.study.converter;

import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.Status;
import umc.study.mapping.MissionHistory;
import umc.study.web.request.CreateMissionHistoryRequest;

public class MissionHistoryConverter {

    public static MissionHistory toMissionHistory(CreateMissionHistoryRequest request, Mission mission, Member member) {
        return MissionHistory.builder()
                .mission(mission)
                .member(member)
                .price(request.getPrice())
                .deadLine(request.getDeadline())
                .point(request.getPoint())
                .completedAt(null) // 아직 미완료
                .status(Status.IN_PROGRESS)
                .build();
    }
}
