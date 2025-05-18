package umc.study.converter;

import umc.study.mapping.MissionHistory;
import umc.study.web.response.MemberMissionResponse;

public class MemberMissionConverter {

    public static MemberMissionResponse fromMissionHistory(MissionHistory missionHistory) {
        return new MemberMissionResponse(
                missionHistory.getMission().getId(),
                missionHistory.getMission().getTitle(),
                missionHistory.getMission().getRestaurant().getName(),
                missionHistory.getStatus(),
                missionHistory.getPrice(),
                missionHistory.getDeadLine(),
                missionHistory.getPoint()
        );
    }
}
