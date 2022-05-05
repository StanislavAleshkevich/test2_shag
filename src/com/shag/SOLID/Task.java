package com.shag.SOLID;

public class Task {
    public static void testSOLID() {
        //Используя солид принципы, добавте в модель поле lastName и добавте этот lastName в эту модель не сломав
        //имеющийся код
        TestModel testModel = new TestModel(13, "Stas");
        System.out.println(testModel.toString());
    }


}
