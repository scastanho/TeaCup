/**
 * Author:  Sergio Castanho
 * Date:  October 11, 2024
 * Objective: Code challenge TeaCup
 * Test Class: CeilingFanTest
 */


package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.teacup.ceiling.*;

public class CeilingFanTest {

	private CeilingFan fan;

	@Before
	public void setUp() {
		
		// Initialize the fan before each test
		fan = new CeilingFan();
	}

	@Test
	public void testInitialSpeedIsZero() {

		// Check if the initial velocity is 0
		assertEquals(0, fan.getSpeed());
	}

	@Test
	public void testInitialDirectionIsClockwise() {
		
		// Check if the initial direction is clockwise
		assertEquals("Clockwise", fan.getDirection());
	}

	@Test
	public void testPullSpeedCord() {
		
		// Tests if the fan increases speed correctly
		fan.pullSpeedCord();
		assertEquals(1, fan.getSpeed());

		fan.pullSpeedCord();
		assertEquals(2, fan.getSpeed());

		fan.pullSpeedCord();
		assertEquals(3, fan.getSpeed());

		// Tests returning to 0 (off) after reaching maximum speed
		fan.pullSpeedCord();
		assertEquals(0, fan.getSpeed());
	}

	@Test
	public void testPullDirectionCord() {
		
		// Tests for direction reversal
		fan.pullDirectionCord();
		assertEquals("CounterClockwise", fan.getDirection());

		// Reverts back to clockwise
		fan.pullDirectionCord();
		assertEquals("Clockwise", fan.getDirection());
	}

	@Test
	public void testSpeedMaintainedOnDirectionChange() {
		
		// Tests whether speed is maintained after changing direction
		fan.pullSpeedCord(); // Speed 1
		fan.pullDirectionCord(); // Reverse

		assertEquals(1, fan.getSpeed());
		assertEquals("CounterClockwise", fan.getDirection());

		// Tests if the speed is not changed after new revert
		fan.pullDirectionCord(); // Reverte para horário
		assertEquals(1, fan.getSpeed());
		assertEquals("Clockwise", fan.getDirection());
	}

	@Test
	public void testSpeedAndDirectionCycle() {
		
		// Test the complete speed and direction cycle
		fan.pullSpeedCord(); // Speed ​​1
		fan.pullSpeedCord(); // Speed ​​2
		fan.pullSpeedCord(); // Speed ​​3
		fan.pullDirectionCord(); // Reverse
		assertEquals("CounterClockwise", fan.getDirection());

		fan.pullSpeedCord(); // Reset to 0 (off), direction remains
		assertEquals(0, fan.getSpeed());
		assertEquals("CounterClockwise", fan.getDirection());

		fan.pullSpeedCord(); // Speed ​​1, direction still reverse
		assertEquals(1, fan.getSpeed());
		assertEquals("CounterClockwise", fan.getDirection());
	}
}
