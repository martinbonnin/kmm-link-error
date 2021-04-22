package net.mbonnin.kmm_link_error

import com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCacheFactory
import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String
    get() {
        val cache = SqlNormalizedCacheFactory("testDb")
        cache.create()
        return UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    }
}