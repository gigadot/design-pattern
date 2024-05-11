package io.muic.ooc.design.proxy;

import io.muic.ooc.design.singleton.adapter.entity.Staff;

/**
 * Created by gigadot on 26-Jan-17.
 */
public class StaffProxy extends Staff {
    private Staff staff;
    public StaffProxy(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String getNickname() {
        // fetch anme from database
        // return  the name form database
        return staff.getNickname();
    }

}
