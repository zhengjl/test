/* Copyright (C) 2003 Vladimir Roubtsov. All rights reserved.
 *
 * This program and the accompanying materials are made available under
 * the terms of the Common Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/cpl-v10.html
 *
 * $Id: Emma.java,v 1.3 2008-02-29 18:23:31 kohsuke Exp $
 */
package com.sun.xml.ws.test.emma;

import org.apache.tools.ant.loader.AntClassLoader2;

import java.io.File;
import java.io.IOException;

/**
 * Hides details of the emma and provide convenient API for the rest of the harness.
 *
 * @author Kohsuke Kawaguchi
 */
public class Emma {
    public Emma() {
    }


    public AntClassLoader2 createInstrumentingClassLoader() {
        return new AntClassLoader2();
    }

    /**
     * Writes the coverate report as a data file.
     */
    public void write(File output) throws IOException {
    }
}
