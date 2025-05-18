package umc.study.apiPayload.exception.handler;

import umc.study.apiPayload.code.BaseErrorCode;
import umc.study.apiPayload.exception.GeneralException;

public class DiscordHandler extends GeneralException {
    public DiscordHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
