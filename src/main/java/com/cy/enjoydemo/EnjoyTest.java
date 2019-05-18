package com.cy.enjoydemo;

import com.jfinal.kit.Kv;
import com.jfinal.template.Engine;

public class EnjoyTest {
    public static void main(String[] args) {
        String result = Engine.use().getTemplate("resources/enjoy_templete.txt").renderToString(Kv.by("k", "v"));
        System.out.println(result);
    }
}
