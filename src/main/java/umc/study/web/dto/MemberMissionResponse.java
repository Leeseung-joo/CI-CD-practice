package umc.study.web.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import umc.study.domain.Status;

public record MemberMissionResponse(
        Long missionId,
        String title,
        String restaurantName,
        Status status,
        BigDecimal price,
        LocalDateTime deadLine,
        int point



) {
}
