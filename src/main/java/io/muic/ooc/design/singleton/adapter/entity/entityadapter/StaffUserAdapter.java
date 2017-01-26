/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.singleton.adapter.entity.entityadapter;

import io.muic.ooc.design.singleton.adapter.User;
import io.muic.ooc.design.singleton.adapter.entity.Staff;

/**
 *
 * @author gigadot
 */
public class StaffUserAdapter implements User {

    private final Staff staff;

    public StaffUserAdapter(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String getDisplayName() {
        return "Staff: " + staff.getNickname();
    }

}
