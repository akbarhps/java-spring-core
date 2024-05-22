package com.charuniverse.spring.core.b_singleton;

import com.charuniverse.spring.core.course.b_singleton.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    void testSingleton() {
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();

        Assertions.assertSame(database1, database2);
    }

}
