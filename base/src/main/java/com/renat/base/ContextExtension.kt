package com.renat.base

import android.content.Context

val Context?.isTablet: Boolean get() = this?.resources?.getBoolean(R.bool.isTablet) ?: false