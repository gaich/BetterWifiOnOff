/*
 * Copyright (C) 2012 asksven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.asksven.betterwifionoff.utils;

import android.content.Context;
import android.net.wifi.WifiManager;

/**
 * @author sven
 *
 */
public class WifiControl
{
	/**
	 * Returns whether wifi is on or not
	 * @param ctx
	 * @return true if wifi is on
	 */
	public static final boolean isWifiOn(Context ctx)
	{
		WifiManager wifiManager = (WifiManager) ctx.getSystemService(Context.WIFI_SERVICE);
		
		return wifiManager.isWifiEnabled();
	}
	
	public static final void setWifi(Context ctx, boolean state)
	{
		WifiManager wifiManager = (WifiManager) ctx.getSystemService(Context.WIFI_SERVICE);
		
		if ( (state && !isWifiOn(ctx)) || (!state && isWifiOn(ctx)) )
		{
			wifiManager.setWifiEnabled(state);
		}
	}


}