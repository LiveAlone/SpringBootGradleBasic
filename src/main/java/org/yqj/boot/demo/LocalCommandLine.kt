package org.yqj.boot.demo

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2020/9/14
 * Email: yaoqijunmail@foxmail.com
 */
@Component
class LocalCommandLine: CommandLineRunner{

    val log = LoggerFactory.getLogger(LocalCommandLine::class.java)

    override fun run(vararg args: String?) {
        log.info("local command line runner starting ... ")
    }

}