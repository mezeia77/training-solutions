package week13d04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMergerTest {



    @Test
    void MergeTest(){
        TemplateMerger templateMerger = new TemplateMerger();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 1980));
        employees.add(new Employee("Jack Doe", 1990));
        System.out.println(templateMerger.merge(Path.of("src\\main\\resources\\week13d04\\template.txt"), employees));
    }

    @Test
    void MergeTest2(){
        TemplateMerger2 templateMerger2 = new TemplateMerger2();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 1980));
        employees.add(new Employee("Jack Doe", 1990));
        System.out.println(templateMerger2.merge(Path.of("src\\main\\resources\\week13d04\\template.txt"), employees));
    }

}