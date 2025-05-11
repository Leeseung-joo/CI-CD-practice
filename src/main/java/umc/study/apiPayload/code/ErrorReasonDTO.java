package umc.study.apiPayload.code;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
@Builder
public class ErrorReasonDTO {  //fianl필드가 잇는 경우에 자동으로 생성자 안만들어줘서
    //빌더 써야함. 빌더는 모든 필드를 매개변수로 받는 생성자와 빌더 매서드를 자동으로 생성해줌
    private HttpStatus httpStatus;

    private final boolean isSuccess;
    private final String code;
    private final String message;

    public boolean getIsSuccess(){return isSuccess;}
}
