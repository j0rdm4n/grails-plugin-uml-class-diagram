/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nafiux.grails.classdomainuml;

/**
 *
 * @author nafiux
 */
public interface URLEncoder {

        String encode(byte data[]);

        byte[] decode(String s);

}