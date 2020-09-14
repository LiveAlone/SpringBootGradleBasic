package org.yqj.boot.demo

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/9/14
 * Email: yaoqijunmail@foxmail.com
 */
@RestController
class HealthController {

    @RequestMapping(value = ["/health"], method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun health(): BaseResponse<String> {
        return BaseResponse.successResponse("health");
    }

    @RequestMapping(value = ["/address"], method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun address(): BaseResponse<AddressResponse> {
        return BaseResponse.successResponse(AddressResponse(InetAddress.getLocalHost().getHostName(), InetAddress.getLocalHost().getHostAddress()));
    }
}