package com.pdk.dicoding.kade.utils


/**
 * Created by Budi Ardianata on 27/06/2020.
 * Project: BFFAdicoding
 * Email: budiardianata@windowslive.com
 */
class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T): Resource<T> =
            Resource(status = Status.SUCCESS, data = data, message = null)

        fun <T> error(data: T?, message: String): Resource<T> =
            Resource(status = Status.ERROR, data = data, message = message)

        fun <T> loading(data: T?): Resource<T> =
            Resource(status = Status.LOADING, data = data, message = null)
    }
}