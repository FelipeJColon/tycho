/*******************************************************************************
 * Copyright (c) 2010, 2011 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.test.tycho503;

import org.apache.maven.it.Verifier;
import org.eclipse.tycho.test.AbstractTychoIntegrationTest;
import org.junit.Test;

public class TYCHO503DoubleEncodedUrlTest extends AbstractTychoIntegrationTest {

    @Test
    public void testEclipseRepositoryModuleWithSpacesInPath() throws Exception {
        Verifier verifier = getVerifier("/TYCHO503Path With Spaces", false);
        verifier.executeGoal("install");
        verifier.verifyErrorFreeLog();
    }

}
