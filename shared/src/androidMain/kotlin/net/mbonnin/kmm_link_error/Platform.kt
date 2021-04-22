package net.mbonnin.kmm_link_error

import android.content.Context
import com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCacheFactory

actual class Platform actual constructor() {
    actual val platform: String
    get() {
        val context: Context? = null
        val cache = SqlNormalizedCacheFactory(context!!)
        cache.create()
        return "Android ${android.os.Build.VERSION.SDK_INT}"
    }
}