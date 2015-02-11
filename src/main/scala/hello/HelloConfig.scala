package hello

import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot;
import.java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.stereotype.Controller;

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author divanshu
 * @since 1.0
 */

@RestController
@Configuration
@EnableAutoConfiguration
@ComponentScan
class HelloConfig {

  @RequestMapping(value=Array("/"))
  def controller() :String = {
    return "Hello World!"
  }
}