/*
 * Created on Jul 20, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2012 the original author or authors.
 */
package org.assert4j.core.assertions.api.date;

import static junit.framework.Assert.assertSame;
import static org.mockito.Mockito.verify;


import org.assert4j.core.assertions.api.DateAssert;
import org.assert4j.core.assertions.api.DateAssertBaseTest;
import org.junit.Test;

/**
 * Tests for <code>{@link DateAssert#hasTime(long)}</code>.
 * 
 * @author Guillaume Girou
 * @author Nicolas François
 */
public class DateAssert_hasTime_Test extends DateAssertBaseTest {

  @Test
  public void should_verify_that_actual_has_time_equals_to_expected() {
    assertions.hasTime(42L);
    verify(dates).assertHasTime(getInfo(assertions), getActual(assertions), 42L);
  }

  @Test
  public void should_return_this() {
    DateAssert returned = assertions.hasTime(42L);
    assertSame(assertions, returned);
  }
}