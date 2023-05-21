package ru.car.rest.exception_handler;

public class NoSuchCarException extends RuntimeException {
    public NoSuchCarException(String message) {
        super(message);
    }
}
