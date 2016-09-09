package com.company;

/**
 * Created by Taras on 05.09.2016.
 */
public class Pet {
            int age;
            float weight;
            float height;
            String color;

            public void sleep() {
                System.out.println("Sleep");
            }

            public void eat() {
                System.out.println("Eat");
            }

            public String say(String aWord) {
                String answer = "Ny" + aWord;
                return answer;
            }

        }
