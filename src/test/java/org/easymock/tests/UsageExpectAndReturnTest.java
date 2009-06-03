/*
 * Copyright 2001-2009 OFFIS, Tammo Freese
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.easymock.tests;

import static org.junit.Assert.*;

import org.easymock.MockControl;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class UsageExpectAndReturnTest {
    private MockControl<IMethods> control;

    private IMethods mock;

    @Before
    public void setup() {
        control = MockControl.createControl(IMethods.class);
        mock = control.getMock();
    }

    @Test
    public void booleanType() {
        control.expectAndReturn(mock.booleanReturningMethod(4), true);
        control.replay();
        assertEquals(true, mock.booleanReturningMethod(4));
        control.verify();
    }

    @Test
    public void longType() {
        control.expectAndReturn(mock.longReturningMethod(4), 12l);
        control.replay();
        assertEquals((long) 12, mock.longReturningMethod(4));
        control.verify();
    }

    @Test
    public void floatType() {
        control.expectAndReturn(mock.floatReturningMethod(4), 12f);
        control.replay();
        assertEquals(12f, mock.floatReturningMethod(4), 0f);
        control.verify();
    }

    @Test
    public void doubleType() {
        control.expectAndReturn(mock.doubleReturningMethod(4), 12.0);
        control.replay();
        assertEquals(12.0, mock.doubleReturningMethod(4), 0.0);
        control.verify();
    }

    @Test
    public void object() {
        control.expectAndReturn(mock.objectReturningMethod(4), "12");
        control.replay();
        assertEquals("12", mock.objectReturningMethod(4));
        control.verify();
    }

    @Test
    public void booleanAndRange() {
        control.expectAndReturn(mock.booleanReturningMethod(4), true,
                MockControl.ONE);
        control.replay();
        assertEquals(true, mock.booleanReturningMethod(4));
        control.verify();
    }

    @Test
    public void longAndRange() {
        control.expectAndReturn(mock.longReturningMethod(4), 12l,
                MockControl.ONE);
        control.replay();
        assertEquals((long) 12, mock.longReturningMethod(4));
        control.verify();
    }

    @Test
    public void floatAndRange() {
        control.expectAndReturn(mock.floatReturningMethod(4), 12f,
                MockControl.ONE);
        control.replay();
        assertEquals(12f, mock.floatReturningMethod(4), 0f);
        control.verify();
    }

    @Test
    public void doubleAndRange() {
        control.expectAndReturn(mock.doubleReturningMethod(4), 12.0,
                MockControl.ONE);
        control.replay();
        assertEquals(12.0, mock.doubleReturningMethod(4), 0.0);
        control.verify();
    }

    @Test
    public void objectAndRange() {
        control.expectAndReturn(mock.objectReturningMethod(4), "12",
                MockControl.ONE);
        control.replay();
        assertEquals("12", mock.objectReturningMethod(4));
        control.verify();
    }

    @Test
    public void booleanAndCount() {
        control.expectAndReturn(mock.booleanReturningMethod(4), true, 2);
        control.replay();
        assertEquals(true, mock.booleanReturningMethod(4));
        assertEquals(true, mock.booleanReturningMethod(4));
        control.verify();
    }

    @Test
    public void longAndCount() {
        control.expectAndReturn(mock.longReturningMethod(4), 12l, 2);
        control.replay();
        assertEquals((long) 12, mock.longReturningMethod(4));
        assertEquals((long) 12, mock.longReturningMethod(4));
        control.verify();
    }

    @Test
    public void floatAndCount() {
        control.expectAndReturn(mock.floatReturningMethod(4), 12f, 2);
        control.replay();
        assertEquals(12f, mock.floatReturningMethod(4), 0f);
        assertEquals(12f, mock.floatReturningMethod(4), 0f);
        control.verify();
    }

    @Test
    public void doubleAndCount() {
        control.expectAndReturn(mock.doubleReturningMethod(4), 12.0, 2);
        control.replay();
        assertEquals(12.0, mock.doubleReturningMethod(4), 0.0);
        assertEquals(12.0, mock.doubleReturningMethod(4), 0.0);
        control.verify();
    }

    @Test
    public void objectAndCount() {
        control.expectAndReturn(mock.objectReturningMethod(4), "12", 2);
        control.replay();
        assertEquals("12", mock.objectReturningMethod(4));
        assertEquals("12", mock.objectReturningMethod(4));
        control.verify();
    }

    @Test
    public void booleanAndMinMax() {
        control.expectAndReturn(mock.booleanReturningMethod(4), true, 2, 3);
        control.replay();
        assertEquals(true, mock.booleanReturningMethod(4));
        assertEquals(true, mock.booleanReturningMethod(4));
        control.verify();
    }

    @Test
    public void longAndMinMax() {
        control.expectAndReturn(mock.longReturningMethod(4), 12l, 2, 3);
        control.replay();
        assertEquals((long) 12, mock.longReturningMethod(4));
        assertEquals((long) 12, mock.longReturningMethod(4));
        control.verify();
    }

    @Test
    public void floatAndMinMax() {
        control.expectAndReturn(mock.floatReturningMethod(4), 12f, 2, 3);
        control.replay();
        assertEquals(12f, mock.floatReturningMethod(4), 0f);
        assertEquals(12f, mock.floatReturningMethod(4), 0f);
        control.verify();
    }

    @Test
    public void doubleAndMinMax() {
        control.expectAndReturn(mock.doubleReturningMethod(4), 12.0, 2, 3);
        control.replay();
        assertEquals(12.0, mock.doubleReturningMethod(4), 0.0);
        assertEquals(12.0, mock.doubleReturningMethod(4), 0.0);
        control.verify();
    }

    @Test
    public void objectAndMinMax() {
        control.expectAndReturn(mock.objectReturningMethod(4), "12", 2, 3);
        control.replay();
        assertEquals("12", mock.objectReturningMethod(4));
        assertEquals("12", mock.objectReturningMethod(4));
        control.verify();
    }
}
