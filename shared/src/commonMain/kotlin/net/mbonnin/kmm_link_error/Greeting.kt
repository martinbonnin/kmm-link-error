package net.mbonnin.kmm_link_error

import com.apollographql.apollo3.cache.normalized.sql.SqlNormalizedCacheFactory

class Greeting {
    fun greeting(): String {
        return "Hello, ${SqlNormalizedCacheFactory::class.simpleName}!"
    }
}