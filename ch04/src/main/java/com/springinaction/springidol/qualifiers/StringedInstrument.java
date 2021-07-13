package com.springinaction.springidol.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface StringedInstrument {
}
/*Когда фреймворк попытается выполнить автоматическое связывание
свойства instrument, его выбор сузится от всех компонентов типа Instrument
до тех из них, что отмечены аннотацией @StringedInstrument.

Пока в приложении остается единственный компонент с аннотацией
@StringedInstrument, он будет внедрен в свойство instrument.

Когда появятся несколько компонентов с аннотацией @StringedInstrument,
потребуется добавить дополнительное уточнение, которое сузит выбор до одного компонента.

Например, представьте, что помимо компонента Guitar имеется еще компонент HammeredDulcimer,
так же отмеченный аннотацией @StringedInstrument.*/
