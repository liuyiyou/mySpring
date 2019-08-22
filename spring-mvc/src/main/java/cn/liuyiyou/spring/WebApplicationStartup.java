package cn.liuyiyou.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author: liuyiyou.cn
 * @date: 2019/3/26
 * @version: V1.0
 */
public class WebApplicationStartup extends AbstractAnnotationConfigDispatcherServletInitializer {

    //=== start extends  AbstractAnnotationConfigDispatcherServletInitializer
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{MvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }
    //=== end extends  AbstractAnnotationConfigDispatcherServletInitializer

    //start AbstractDispatcherServletInitializer
/*    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(MvcConfig.class);
        return annotationConfigWebApplicationContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};

    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(AppConfig.class);
        return annotationConfigWebApplicationContext;
    }*/

    //end AbstractDispatcherServletInitializer


//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
//        annotationConfigWebApplicationContext.register(MvcConfig.class);
//
//        annotationConfigWebApplicationContext.register(DispatcherServlet.class);
//
//        return annotationConfigWebApplicationContext;
//    }


//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//
//    }
}
