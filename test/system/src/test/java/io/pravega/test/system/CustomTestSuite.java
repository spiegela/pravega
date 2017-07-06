/**
 * Copyright (c) 2017 Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.pravega.test.system;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by root on 7/6/17.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        MultiControllerTest.class,
        AutoScaleTest.class
})
public class CustomTestSuite {
}
