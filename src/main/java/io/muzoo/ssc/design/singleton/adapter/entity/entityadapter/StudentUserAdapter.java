/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.singleton.adapter.entity.entityadapter;

import io.muzoo.ssc.design.singleton.adapter.User;
import io.muzoo.ssc.design.singleton.adapter.entity.Student;

/**
 *
 * @author gigadot
 */
public class StudentUserAdapter implements User {

    private final Student student;

    public StudentUserAdapter(Student student) {
        this.student = student;
    }

    @Override
    public String getDisplayName() {
        return "Student: " + student.getFirstName() + " " + student.getLastName()
                + " [" + student.getId() + "]";
    }

}
