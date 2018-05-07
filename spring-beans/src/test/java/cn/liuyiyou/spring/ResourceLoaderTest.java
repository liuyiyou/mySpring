package cn.liuyiyou.spring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

public class ResourceLoaderTest {

    @Test
    public void testResourceLoader() {

        ResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("classpath:resource.xml");
        Assert.assertEquals(ClassPathResource.class, resource.getClass());
//        Resource  resource2  = loader.getResource("flie:/src/main/resources/arrayDi.xml");
//        Assert.assertEquals(ClassPathResource.class,resource2.getClass());
        Resource resource3 = loader.getResource("resource.xml");
        Assert.assertTrue(resource3 instanceof ClassPathResource);


    }
}
