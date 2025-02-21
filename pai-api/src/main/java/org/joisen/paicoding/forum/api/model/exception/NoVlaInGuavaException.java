package org.joisen.paicoding.forum.api.model.exception;

/** 未命中异常
 * @author Joisen
 * @version 1.0
 * @date 2025/2/21 021 16:48
 */
public class NoVlaInGuavaException extends RuntimeException {
    public NoVlaInGuavaException(String msg) {
        super(msg);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
