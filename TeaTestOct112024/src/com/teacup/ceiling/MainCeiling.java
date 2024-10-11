/**
 * Author:  Sergio Castanho
 * Date:  October 11, 2024
 * Objective: Code challenge TeaCup 
 */

package com.teacup.ceiling;

public class MainCeiling {

	public static void main(String[] args) {

		// Create an instance of Ceiling Fan
		CeilingFan fan = new CeilingFan();

		// Simulate some operations
		System.out.println("Speed: " + fan.getSpeed() + ", Direction: " + fan.getDirection()); // Speed: 0, Direction:
																								// Normal
		fan.pullSpeedCord();
		System.out.println("Speed: " + fan.getSpeed() + ", Direction: " + fan.getDirection()); // Speed: 1, Direction:
																								// Normal
		fan.pullSpeedCord();
		System.out.println("Speed: " + fan.getSpeed() + ", Direction: " + fan.getDirection()); // Speed: 2, Direction:
																								// Normal
		fan.pullDirectionCord();
		System.out.println("Speed: " + fan.getSpeed() + ", Direction: " + fan.getDirection()); // Speed: 2, Direction:
																								// Reversed
		fan.pullSpeedCord();
		System.out.println("Speed: " + fan.getSpeed() + ", Direction: " + fan.getDirection()); // Speed: 3, Direction:
																								// Reversed
		fan.pullSpeedCord();
		System.out.println("Speed: " + fan.getSpeed() + ", Direction: " + fan.getDirection()); // Speed: 0, Direction:
																								// Reversed
	}
}
