package com.springinaction.springidol.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Strummed {
}
/*Чтобы обеспечить дополнительную квалификацию класса Guitar,
можно определить еще одну аннотацию с именем @Strummed

Теперь аннотацию @Strummed можно добавить к свойству instrument,
чтобы ограничить выбор щипковыми струнными инструментами*/
