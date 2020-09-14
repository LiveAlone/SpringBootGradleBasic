package org.yqj.boot.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/9/14
 * Email: yaoqijunmail@foxmail.com
 */

@SpringBootApplication
class BootDemoApplication

fun main(args: Array<String>) {
    runApplication<BootDemoApplication>(*args)
}
