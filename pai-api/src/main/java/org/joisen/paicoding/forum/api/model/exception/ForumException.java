package org.joisen.paicoding.forum.api.model.exception;

import lombok.Getter;
import org.joisen.paicoding.forum.api.model.vo.Status;
import org.joisen.paicoding.forum.api.model.vo.constants.StatusEnum;

public class ForumException extends RuntimeException {

    @Getter
    private Status status;

    public ForumException(Status status) {
        this.status = status;
    }

    public ForumException(int code, String msg) {
        this.status = new Status(code, msg);
    }

    public ForumException(StatusEnum statusEnum, Object... args) {
        this.status = Status.newStatus(statusEnum, args);
    }

}
