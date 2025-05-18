package umc.study.web.request;

import java.math.BigDecimal;
import lombok.Data;
import lombok.Getter;

@Getter
public class CreateMissionRequest {
    private Long missionId;
    private String title;
    private Long reward;
    private BigDecimal requiredAmount;
}
