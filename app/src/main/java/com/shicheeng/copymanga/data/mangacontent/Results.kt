package com.shicheeng.copymanga.data.mangacontent


import com.squareup.moshi.Json
import androidx.annotation.Keep
import com.squareup.moshi.JsonClass

@Keep
@JsonClass(generateAdapter = true)
data class Results(
    @Json(name = "chapter")
    val chapter: Chapter,
    @Json(name = "comic")
    val comic: Comic,
    @Json(name = "is_lock")
    val isLock: Boolean,
    @Json(name = "is_login")
    val isLogin: Boolean,
    @Json(name = "is_mobile_bind")
    val isMobileBind: Boolean,
    @Json(name = "is_vip")
    val isVip: Boolean,
    @Json(name = "show_app")
    val showApp: Boolean
)