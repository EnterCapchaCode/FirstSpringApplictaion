package org.first.spring.application;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    @Override
    public String getSong() { return "Antonio Vivaldi - Winter"; }

    public void initMethod(){
        System.out.println("Initialization complete!");
    }

    public void destroyMethod(){
        System.out.println("Destroy complete!");
    }
}
