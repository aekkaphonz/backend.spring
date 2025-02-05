package backend.test.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI myCustomOpenAPI() {
        return new OpenAPI().info(new Info().title("apitest").version("1.0"));
    }
}
