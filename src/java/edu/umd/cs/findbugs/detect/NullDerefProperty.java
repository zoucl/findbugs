/*
 * FindBugs - Find bugs in Java programs
 * Copyright (C) 2005, University of Maryland
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package edu.umd.cs.findbugs.detect;

import edu.umd.cs.findbugs.props.PriorityAdjustment;
import edu.umd.cs.findbugs.props.WarningProperty;

/**
 * Warning properties for null pointer dereference and redundant null
 * comparison warnings.
 * 
 * @author David Hovemeyer
 */
public class NullDerefProperty implements WarningProperty {
	private String name;
	private PriorityAdjustment priorityAdjustment;
	
	private NullDerefProperty(String name, PriorityAdjustment priorityAdjustment) {
		this.name = name;
		this.priorityAdjustment = priorityAdjustment;
	}
	
	/** Redundant null comparison is of a checked null value. */
	public static final NullDerefProperty CHECKED_VALUE =
		new NullDerefProperty("CHECKED_VALUE", PriorityAdjustment.LOWER_PRIORITY);

	public PriorityAdjustment getPriorityAdjustment() {
		return priorityAdjustment;
	}

	public String getName() {
		return NullDerefProperty.class.getName() + "." + name;
	}

}
