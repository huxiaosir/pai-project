package org.joisen.paicoding.forum.api.model.exception;

import lombok.Getter;
import org.joisen.paicoding.forum.api.model.vo.Status;
import org.joisen.paicoding.forum.api.model.vo.constants.StatusEnum;

/**
 * @author Joisen
 * @version 1.0
 * @date 2025/2/21 021 16:46
 */
public class ForumAdviceException extends RuntimeException {
    @Getter
    private Status status;

    public ForumAdviceException(Status status) {
        this.status = status;
    }

    public ForumAdviceException(int code, String msg) {
        this.status = Status.newStatus(code, msg);
    }

    public ForumAdviceException(StatusEnum statusEnum, Object... args) {
        this.status = Status.newStatus(statusEnum, args);
    }
}
