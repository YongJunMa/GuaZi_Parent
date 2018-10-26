package com.qfedu.gz.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *@Author feri
 *@Date Created in 2018/10/26 10:34
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    //整个接口网页的基本信息设置
    private ApiInfo apiInfo(){
        Contact contact=new Contact("Feri","http://10000phone.com","it_feri@163.com");
       return new ApiInfoBuilder().version("1.0.0").contact(contact).title("瓜子二手车数据接口在线文档").
                description("呱呱呱").build();
    }
    @Bean
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).
                forCodeGeneration(true).select().apis(RequestHandlerSelectors.any()).
                paths(PathSelectors.any()).build();
    }


}
