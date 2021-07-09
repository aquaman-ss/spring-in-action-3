package com.springinaction.springidol.performers;

import com.springinaction.springidol.exceptions.PerformanceException;

public interface Performer {
    void perform() throws PerformanceException;
}
