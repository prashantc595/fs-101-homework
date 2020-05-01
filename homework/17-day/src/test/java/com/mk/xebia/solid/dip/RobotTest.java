package com.mk.xebia.solid.dip;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.internal.verification.AtLeast;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    @Mock
    Battery battery;

    @Test
    void robotShouldWalk(){
        Robot robot = new Robot(battery);
        boolean check = robot.canWalk();
        assertTrue(check);
        verify(battery).canWalk();
       
    }

}