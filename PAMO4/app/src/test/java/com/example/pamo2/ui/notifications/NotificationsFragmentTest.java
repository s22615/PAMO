package com.example.pamo2.ui.notifications;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class NotificationsFragmentTest {

    @Test
    public void calculateMalePPMTestCase() {

        float weight = 70;
        float height = 175;
        int age = 30;

        int expectedResult = (int) (66.5 + (13.75 * 70) + (5.003 * 175) - (6.775 * 30));

        NotificationsFragment notificationFragment = new NotificationsFragment();

        int result = notificationFragment.calculateMalePPMTestCase(weight, height, age);

        assertEquals(expectedResult, result);

    }
}