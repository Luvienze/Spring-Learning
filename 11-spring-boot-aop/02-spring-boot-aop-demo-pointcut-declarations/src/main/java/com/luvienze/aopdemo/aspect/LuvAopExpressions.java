package com.luvienze.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class LuvAopExpressions {

    @Pointcut("execution(* com.luvienze.aopdemo.dao.*.*(..))")
    public void forDAOPackage(){}

    // create a pointcut for getter methods
    @Pointcut("execution(* com.luvienze.aopdemo.dao.*.get*(..))")
    public void getter(){}

    // create a pointcut for setter methods
    @Pointcut("execution(* com.luvienze.aopdemo.dao.*.set*(..))")
    public void setter(){}

    // create pointcut: include package ... exclude getter/setter
    @Pointcut("forDAOPackage() && !(getter()  || setter() )")
    public void forDAOPackageNoGetterSetter(){}

}
