package com.spring.jdbc;

import javax.sound.midi.Soundbank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao res = context.getBean("studentjdbc",StudentDao.class);
        
        //insert
//        Student student=new Student();
//        student.setId(998);
//        student.setName("Mahmud Jahid");
//        student.setCity("kuril");
//        int insertRes = res.insert(student);
//        
//        System.out.println(insertRes);
        //manual insert
//        JdbcTemplate jdbc = context.getBean("jdbc",JdbcTemplate.class);
//        
//        String query="insert into student(id,name,city) values(?,?,?)";
//        
//        int result = jdbc.update(query,25,"khan3","Manikgonj");
//        System.out.println("result : "+result);
        
        //update
//        Student student=new Student();
//        student.setId(11);
//        student.setName("mishu");
//        student.setCity("dhankora");
//        int upRes = res.update(student);
//        System.out.println(upRes);
        Student student = res.getStudent(11);
        System.out.println(student);
    }
}
