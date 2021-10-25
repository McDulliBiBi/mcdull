package com.demo.parampassing;

/**
 * java参数传递有两种类型：
 * 值传递：基本类型及其包装类型，包括int, long, double, boolean, char
 * 引用传递： 包括类，接口，对象，集合
 */
public class ParamPassingTest {
    public static void main(String[] args) {
        String age = "10";
        changeAge(age);
        System.out.println("basic type, age after changeAge() :" + age);

        User user = new User();
        user.setAge(30);
        changeAge(user);
        System.out.println("special type, age after changeAge() :" + user.getAge());
    }

    public static void changeAge(String age) {
        age = "20";
    }

    public static void changeAge(User user) {
        user.setAge(40);
    }

    static class User {
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
