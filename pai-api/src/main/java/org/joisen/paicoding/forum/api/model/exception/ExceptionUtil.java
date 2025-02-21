package org.joisen.paicoding.forum.api.model.exception;

import org.joisen.paicoding.forum.api.model.vo.constants.StatusEnum;

public class ExceptionUtil {

    public static ForumException of(StatusEnum statusEnum, Object... args) {
        return new ForumException(statusEnum, args);
    }
}
