package net.refractored.bossesExtension

import com.willfp.eco.core.EcoPlugin
import com.willfp.eco.core.extensions.Extension

class BossesExtension(
    plugin: EcoPlugin,
) : Extension(plugin) {
    override fun onEnable() {
        instance = this
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    companion object {
        lateinit var instance: BossesExtension
            private set
    }
}
