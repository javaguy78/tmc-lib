/*
 * Copyright 2013 Topher Donovan (themaskedcrusader.com)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.themaskedcrusader.bukkit.config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

// This is a special static version of SaveFile. If changes are made to SaveFile, they must be made here too!
public class Messages {
    private static ConfigAccessor messages;
    private static final String file = "messages.yml";

    private Messages() {}

    public static void init(JavaPlugin plugin) {
        messages = new ConfigAccessor(plugin, file);
        messages.reloadConfig();
        messages.saveDefaultConfig();
    }

    public static FileConfiguration getConfig() {
        return messages.getConfig();
    }

    public static ConfigAccessor get() {
        return messages;
    }
}

