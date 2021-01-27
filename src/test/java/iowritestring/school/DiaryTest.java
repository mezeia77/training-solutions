package iowritestring.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @Test
    void newMarkTest(){
        Diary diary = new Diary();
        diary.newMark("John_Doe", 5);
    }

    @Test
    void averageTest(){
        Diary diary = new Diary();
        diary.average("John_Doe");
    }

}