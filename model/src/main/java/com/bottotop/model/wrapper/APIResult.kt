package com.bottotop.model.wrapper

import com.bottotop.model.APIError

/**
 * A generic class that holds a value with its loading status.
 * @param <T>
 */
sealed class APIResult {
    object Success : APIResult()
    data class Error(val error: APIError) : APIResult()
}