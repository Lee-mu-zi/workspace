package com.leemuzi.springschedule;

import com.leemuzi.SpringJob;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringScheduleApplicationTests {

    @Autowired
    private SpringJob springJob;

    @Test
    void contextLoads() {
        springJob.job1();
    }

}
