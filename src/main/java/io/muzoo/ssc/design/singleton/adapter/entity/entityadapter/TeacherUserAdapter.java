/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.singleton.adapter.entity.entityadapter;

import io.muzoo.ssc.design.singleton.adapter.User;
import io.muzoo.ssc.design.singleton.adapter.entity.Teacher;

/**
 *
 * @author gigadot
 */
public class TeacherUserAdapter implements User {

    private final Teacher teacher;

    public TeacherUserAdapter(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String getDisplayName() {
        return "Teacher: " + teacher.getFirstName() + " " + teacher.getLastName()
                + " [" + teacher.getTeacherId() + "]";
    }

}
