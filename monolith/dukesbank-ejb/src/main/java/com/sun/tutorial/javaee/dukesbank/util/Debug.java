/*
 * Copyright 2007 Sun Microsystems, Inc.
 * All rights reserved.  You may not modify, use,
 * reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://developer.sun.com/berkeley_license.html
 */
package com.sun.tutorial.javaee.dukesbank.util;

import weblogic.i18n.logging.NonCatalogLogger;

/**
 * This class makes it easier to print out debug statements.
 * The Debug.print statements are printed to System.err
 * if debuggingOn = true.
 */
public final class Debug {
    public static final boolean debuggingOn = true;

    private static NonCatalogLogger logger = new NonCatalogLogger(Debug.class.getName());

    public static final void print(String msg) {
        if (debuggingOn) {
            logger.debug("Debug: " + msg);
        }
    }

    public static final void print(
        String msg,
        Object object) {
        if (debuggingOn) {
            logger.debug("Debug: " + msg);
            logger.debug("       " + object.getClass().getName());
        }
    }
}
