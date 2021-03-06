package org.lucas.scheduling.aspectj;

@Configuration
@Role(BeanDefinition.ROLE_INFRASTRUCTURE)
public class AspectJAsyncConfiguration extends AbstractAsyncConfiguration {

    @Bean(name = TaskManagementConfigUtils.ASYNC_EXECUTION_ASPECT_BEAN_NAME)
    @Role(BeanDefinition.ROLE_INFRASTRUCTURE)
    public AnnotationAsyncExecutionAspect asyncAdvisor() {
        AnnotationAsyncExecutionAspect asyncAspect = AnnotationAsyncExecutionAspect.aspectOf();
        asyncAspect.configure(this.executor, this.exceptionHandler);
        return asyncAspect;
    }

}
