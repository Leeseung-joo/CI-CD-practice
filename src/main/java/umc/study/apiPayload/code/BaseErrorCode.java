package umc.study.apiPayload.code;

import umc.study.apiPayload.exception.GeneralException;

public interface BaseErrorCode {

    ErrorReasonDTO getReason();

    ErrorReasonDTO getReasonHttpStatus();
}
