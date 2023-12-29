package com.example.RedisAPP.queue;

public interface MessagePublisher {

    void publish(final String message);
}
