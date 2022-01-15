package pers.su.springaopannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("pers.su")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}
