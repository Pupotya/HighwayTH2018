package HighwayTH2018;

import Lesson16.MyStorage;
import Lesson16.SerializeWorker;
import org.testng.annotations.Test;

public class TestSerialization {

    @Test
    public void serializeTest(){
        MyStorage myStorage = new MyStorage();
        myStorage.name = "Jack";
        myStorage.age = 15;
        SerializeWorker.serializeStorage(myStorage,"storage");
    }

    @Test
    public void deserializeTest(){
        MyStorage myStorage = (MyStorage) SerializeWorker.deserialzeStorage("storage");
        System.out.println(myStorage.name);
    }


}
