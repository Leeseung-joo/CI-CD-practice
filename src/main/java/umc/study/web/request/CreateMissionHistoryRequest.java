package umc.study.web.request;

import jakarta.validation.constraints.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public class CreateMissionHistoryRequest {


    private Long missionId;
    private Long memberId;
    private BigDecimal price;
    private LocalDateTime deadline;
    private int point;
}
