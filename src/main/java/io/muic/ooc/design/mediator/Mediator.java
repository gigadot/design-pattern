/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.mediator;

//Abstract Mediator

interface Mediator {

    void book();

    void view();

    void search();

    void registerView(BtnView v);

    void registerSearch(BtnSearch s);

    void registerBook(BtnBook b);

    void registerDisplay(LblDisplay d);
    
}
