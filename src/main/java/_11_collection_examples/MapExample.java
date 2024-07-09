package _11_collection_examples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Student> studentHashMap
                = new HashMap<>();

        studentHashMap.put("student2", new Student("bryce"));
        studentHashMap.put("student1", new Student("cindy"));
        studentHashMap.put("student3", new Student("david"));
        studentHashMap.put("student3", new Student("david2"));
        studentHashMap.put(null, new Student("david"));
        studentHashMap.put(null, new Student("david"));

        Student student3 = studentHashMap.get("student3");
        System.out.println(student3);

        studentHashMap.put("student3", new Student("Susan"));
        student3 = studentHashMap.get("student3");
        System.out.println(student3);

        boolean isStudent2Exist = studentHashMap.containsKey("student2");
        System.out.println(isStudent2Exist);

        System.out.println(studentHashMap.size());

        for (var studentEntry :
                studentHashMap.entrySet()) {
            String key = studentEntry.getKey();
            Student value = studentEntry.getValue();
            System.out.println(key + " " + value);
        }

    }
}

class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
