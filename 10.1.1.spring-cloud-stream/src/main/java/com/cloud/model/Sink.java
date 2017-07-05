package com.cloud.model;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by Admin on 2017/7/3.
 */
public interface Sink {

    String INPUT = "input";

    @Input(Sink.INPUT)
    SubscribableChannel inputArg();
}
