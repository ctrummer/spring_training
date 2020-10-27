package com.training.java.lambda;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Notification {

    private String message;
    private ZonedDateTime timeStamp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(message, that.message) &&
                Objects.equals(timeStamp, that.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, timeStamp);
    }

}
