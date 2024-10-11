/**
 * Author:  Sergio Castanho
 * Date:  October 11, 2024
 * Objective: Code challenge TeaCup
 * Summary:
 *    The line this.speed = (this.speed + 1) % 4; 
 *    ensures that the fan cycles between speeds 0 (off), 1, 2, and 3, returning to 0 after reaching speed 3. 
 *    This causes the fan to have a cyclical behavior in relation to the speeds.
 *  
 */

package com.teacup.ceiling;

public class CeilingFan {
	private int speed;
	private boolean isReversed;

	public CeilingFan() {
		this.speed = 0; // Speed starts at 0 (off)
		this.isReversed = false; // false represents forward, true represents reverse
	}

	public void pullSpeedCord() {
		// Increases speed, cycles back to 0 if speed is at 3
		this.speed = (this.speed + 1) % 4;
	}

	public void pullDirectionCord() {
		// Reverses direction
		this.isReversed = !this.isReversed;
	}

	public int getSpeed() {
		return this.speed;
	}

	public String getDirection() {
		return this.isReversed ? "Reverse" : "Forward";
	}

	@Override
	public String toString() {
		return "Fan is at speed " + this.speed + " and direction " + getDirection();
	}
}
