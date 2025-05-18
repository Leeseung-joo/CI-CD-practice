package umc.study.converter;

import org.springframework.stereotype.Component;
import umc.study.domain.Mission;
import umc.study.domain.Restaurant;
import umc.study.web.request.CreateMissionRequest;

@Component
public class MissionConverter {

    public static Mission toMission(CreateMissionRequest request, Restaurant restaurant) {
        return Mission.builder()
                .title(request.getTitle())
                .reward(request.getReward())
                .requiredAmount(request.getRequiredAmount())
                .restaurant(restaurant)
                .build();
    }
}
