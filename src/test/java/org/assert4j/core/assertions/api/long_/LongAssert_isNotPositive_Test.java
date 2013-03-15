/*
 * Created on May 28, 2012
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
package org.assert4j.core.assertions.api.long_;

import org.assert4j.core.assertions.api.LongAssert;
import org.assert4j.core.assertions.api.LongAssertBaseTest;

import static org.mockito.Mockito.verify;


/**
 * Tests for <code>{@link LongAssert#isNotPositive()}</code>.
 * 
 * @author Nicolas François
 */
public class LongAssert_isNotPositive_Test extends LongAssertBaseTest {

  @Override
  protected LongAssert invoke_api_method() {
    return assertions.isNotPositive();
  }

  @Override
  protected void verify_internal_effects() {
    verify(longs).assertIsNotPositive(getInfo(assertions), getActual(assertions));
  }
}