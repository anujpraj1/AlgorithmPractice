package com.test.miscelleneous;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class ReflectionEasy {

    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.toString());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }

        for (int i = 0; i<4; i++) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            Date date = new Date();
            System.out.println("OOOOOOOO"+sdf.format(date));
        }
    }
    class Student {
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
