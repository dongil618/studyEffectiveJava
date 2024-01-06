package StudyEffectiveJava8.chapter2.item3.inflearn;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Slf4j
public class ElvisReflection {

    public static void main(String[] args) {
        try {
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            Elvis elvis1 = defaultConstructor.newInstance();
            Elvis elvis2 = defaultConstructor.newInstance();
            log.info("elvis1 == elvis2 : {}", elvis1 == elvis2);
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            log.error("Error={}", e.getMessage());
        }
    }
}

// e.printStackTrace();
// java.lang.IllegalAccessException: Class StudyEffectiveJava8.chapter2.item3.inflearn.ElvisReflection can not access a member of class StudyEffectiveJava8.chapter2.item3.inflearn.Elvis with modifiers "private"
//        at sun.reflect.Reflection.ensureMemberAccess(Reflection.java:102)
//        at java.lang.reflect.AccessibleObject.slowCheckMemberAccess(AccessibleObject.java:296)
//        at java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:288)
//        at java.lang.reflect.Constructor.newInstance(Constructor.java:413)
//        at StudyEffectiveJava8.chapter2.item3.inflearn.ElvisReflection.main(ElvisReflection.java:15)

// log.error
// 21:07:07.338 [main] ERROR StudyEffectiveJava8.chapter2.item3.inflearn.ElvisReflection - Error=Class StudyEffectiveJava8.chapter2.item3.inflearn.ElvisReflection can not access a member of class StudyEffectiveJava8.chapter2.item3.inflearn.Elvis with modifiers "private"