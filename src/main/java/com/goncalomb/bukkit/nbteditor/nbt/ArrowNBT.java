/*
 * Copyright (C) 2013-2018 Gonçalo Baltazar <me@goncalomb.com>
 *
 * This file is part of NBTEditor.
 *
 * NBTEditor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NBTEditor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NBTEditor.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.goncalomb.bukkit.nbteditor.nbt;

import com.goncalomb.bukkit.nbteditor.nbt.variables.BooleanVariable;
import com.goncalomb.bukkit.nbteditor.nbt.variables.ByteVariable;
import com.goncalomb.bukkit.nbteditor.nbt.variables.DoubleVariable;
import com.goncalomb.bukkit.nbteditor.nbt.variables.NBTUnboundVariableContainer;
import com.goncalomb.bukkit.nbteditor.nbt.variables.ShortVariable;

public class ArrowNBT extends EntityNBT {

	static {
		NBTUnboundVariableContainer variables = new NBTUnboundVariableContainer("Arrow");
		variables.add("Pickup", new ByteVariable("pickup", (byte) 0, (byte) 2));
		variables.add("Player", new BooleanVariable("player"));
		variables.add("Life", new ShortVariable("life"));
		variables.add("Damage", new DoubleVariable("damage"));
		variables.add("Critical", new BooleanVariable("crit"));
		registerVariables(ArrowNBT.class, variables);
	}

}
