package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;

public interface Performer {
    void perform() throws PerformanceException;
}
