/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast;

import net.sourceforge.pmd.lang.symboltable.Scope;

/**
 * @author Clément Fournier
 */
public final class InternalApiBridge {

    private InternalApiBridge() {

    }


    public static void setScope(JavaNode node, Scope scope) {
        ((AbstractJavaNode) node).setScope(scope);
    }

    public static void setComment(JavaNode node, Comment comment) {
        ((AbstractJavaNode) node).comment(comment);
    }

    public static void setModifier(AccessNode node, int modifier) {
        ((AbstractJavaAccessNode) node).setModifier(true, modifier);
    }

}
