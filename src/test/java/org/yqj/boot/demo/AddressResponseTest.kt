package org.yqj.boot.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/9/17
 * Email: yaoqijunmail@foxmail.com
 */
class AddressResponseTest {

    @Test
    fun addressResponseTest() {
        val resp = AddressResponse("localhost", "127.0.0.1")
        Assertions.assertEquals("localhost", resp.hostname)
        Assertions.assertEquals("127.0.0.1", resp.hostAddress)
    }

}
