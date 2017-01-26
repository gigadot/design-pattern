/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.singleton.adapter;

import io.muic.ooc.design.singleton.adapter.entity.Staff;
import io.muic.ooc.design.singleton.adapter.entity.Student;
import io.muic.ooc.design.singleton.adapter.entity.Teacher;
import io.muic.ooc.design.singleton.adapter.entity.entityadapter.StaffUserAdapter;
import io.muic.ooc.design.singleton.adapter.entity.entityadapter.StudentUserAdapter;
import io.muic.ooc.design.singleton.adapter.entity.entityadapter.TeacherUserAdapter;

/**
 *
 * @author gigadot
 */
public class UserMain {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Weerapong");
        teacher1.setLastName("Phadungsukanan");
        teacher1.setTeacherId(0);

        Student student1 = new Student();
        student1.setFirstName("Super");
        student1.setLastName("Man");
        student1.setId(1000);

        Staff staff1 = new Staff();
        staff1.setNickname("Ironman");

        User u1 = new TeacherUserAdapter(teacher1);
        User u2 = new StudentUserAdapter(student1);
        User u3 = new StaffUserAdapter(staff1);

        System.out.println(u1.getDisplayName());
        System.out.println(u2.getDisplayName());
        System.out.println(u3.getDisplayName());
    }
}
