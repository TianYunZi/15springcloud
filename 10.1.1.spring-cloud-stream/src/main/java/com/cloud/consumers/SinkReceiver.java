package com.cloud.consumers;

import com.cloud.Ch1011Application;
import com.cloud.model.Sink;
import org.slf4j.Logger;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * Created by Admin on 2017/7/3.
 */
@EnableBinding(Sink.class)
public class SinkReceiver {

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(Ch1011Application.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("Received: " + payload);
    }
}
