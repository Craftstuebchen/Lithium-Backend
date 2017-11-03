/*
 * MIT License
 *
 * Copyright (c) 2017 NickAc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.nickac.lithium.backend.other;

import net.nickac.lithium.backend.other.serverhandlers.LithiumCloseWindowHandler;
import net.nickac.lithium.backend.other.serverhandlers.LithiumRefreshControlHandler;
import net.nickac.lithium.backend.other.serverhandlers.LithiumRuntimeControlHandler;

/**
 * Created by NickAc for Lithium!
 */
public class LithiumConstants {
	//Start Window Section
	public static String LITHIUM_WINDOW_OPEN = "LITHIUM|WINDOW_OPEN|"; //UUID (Client->Server)
	public static String LITHIUM_WINDOW_CLOSE = "LITHIUM|WINDOW_CLOSE|"; //UUID (Client->Server)
	public static String LITHIUM_RECEIVE_WINDOW = "LITHIUM|RECEIVE_WINDOW|"; //OBJECT SERIALIZED WITH BASE64 (Server->Client)
	//End Window Section

	//Start Action Section
	public static String LITHIUM_CONTROL_CHANGED = "LITHIUM|CONTROL_CHANGED|"; //OBJECT SERIALIZED WITH BASE64 (Server->Client)
	public static String LITHIUM_BUTTON_ACTION = "LITHIUM|BUTTON_ACTION|"; //UUID (Client->Server)
	public static String LITHIUM_TEXTBOX_TEXT_CHANGED = "LITHIUM|TEXTBOX_CHANGED|"; //UUID|TEXT (Client->Server)
	public static String LITHIUM_SLIDER_VALUE_CHANGED = "LITHIUM|SLIDER_CHANGED|"; //UUID|VALUE (Client->Server)
	public static String LITHIUM_CLOSE_WINDOW = "LITHIUM|CLOSE_WINDOW"; // (Server->Client)

	public static String LITHIUM_TOGGLE_ACTION = "LITHIUM|TOGGLE_ACTION|"; //UUID (Client->Server)


	public static String LITHIUM_ADD_TO_CONTAINER = "LITHIUM|ADD_TO_CONTAINER|"; //CONTAINER UUID|OBJECT SERIALIZED WITH BASE64 (Server->Client)
	public static String LITHIUM_REMOVE_FROM_CONTAINER = "LITHIUM|REMOVE_FROM_CONTAINER|"; //CONTAINER UUID|CONTROL UUID (Server->Client)


	//End Action Section

	//Start Event Section
	public static LithiumRefreshControlHandler onRefresh = null;
	public static LithiumCloseWindowHandler onClose = null;
	public static LithiumRuntimeControlHandler onControlRuntime = null;
	//End Event Section


	//Start Overlay Section
	public static String LITHIUM_SHOW_OVERLAY = "LITHIUM|SHOW_OVERLAY|"; //OBJECT SERIALIZED WITH BASE64 (Server->Client)
	public static String LITHIUM_REMOVE_OVERLAY = "LITHIUM|REMOVE_OVERLAY"; // (Server->Client)
	//End  Overlay Section
	public static int CENTERED_CONSTANT = -2; //LEGACY
}
