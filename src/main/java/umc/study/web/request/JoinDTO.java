package umc.study.web.request;

import java.util.List;
import lombok.Getter;
import org.locationtech.jts.geom.Point;
import umc.study.domain.Gender;
import umc.study.mapping.FavoriteFood;
import umc.study.validation.annotation.ExistCategories;

@Getter
public class JoinDTO {
    private String name;
    private String email;
    private Gender gender;
    private String birthdate;
    private Point location;
    @ExistCategories
    private List<Long> preferFood;



}
