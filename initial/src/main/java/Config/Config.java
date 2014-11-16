package Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by apple eaten on 16/11/2014.
 */
@Configuration
@EnableJpaRepositories(basePackages = "dz.sonelgaz.repositories")
public class Config {

}
