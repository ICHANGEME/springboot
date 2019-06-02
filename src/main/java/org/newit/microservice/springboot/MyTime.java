package org.newit.microservice.springboot;

import org.springframework.stereotype.Service;


public class MyTime {
    private Long currentTime;

    public Long getCurrentTime() {

        return currentTime;
    }

    public void setCurrentTime(Long currentTime) {

        this.currentTime = currentTime;
    }
}
