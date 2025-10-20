package Challanges;

import java.util.PriorityQueue;
import java.util.Comparator;

class StudentPriorityQueue {
    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + "(" + grade + ")";
        }
    }

    public static void main(String[] args) {
        // Comparator: smaller grade letter (A < B < C) has higher priority
        PriorityQueue<Student> queue = new PriorityQueue<>(
                Comparator.comparing(Student::getGrade)
        );

        queue.offer(new Student("Vedant", 'B'));
        queue.offer(new Student("Ram", 'A'));
        queue.offer(new Student("Shyam", 'C'));
        queue.offer(new Student("Mohan", 'A'));

        System.out.println("Students in priority order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll().getName() + " - " + queue.poll().getGrade());
        }
    }
}
