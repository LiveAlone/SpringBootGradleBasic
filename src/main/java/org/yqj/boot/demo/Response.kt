package org.yqj.boot.demo

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/9/14
 * Email: yaoqijunmail@foxmail.com
 */
data class BaseResponse<T>(val success: Boolean, val code: Int, val data: T) {
    companion object {
        fun <T> successResponse(data: T): BaseResponse<T> {
            return BaseResponse(true, 0, data)
        }
    }
}

data class AddressResponse(val hostname: String, val hostAddress: String)


