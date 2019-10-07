/*
 * Copyright (c) 2010-2015 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 */
package org.eclipsescout.demo.bahbah.shared.services.custom.security;

import org.eclipse.scout.rt.security.AbstractAccessControlService;
import org.eclipse.scout.rt.security.IAccessControlService;
import org.eclipse.scout.rt.security.IPermissionCollection;
import org.eclipse.scout.rt.shared.ISession;
import org.eclipse.scout.rt.shared.session.Sessions;

/**
 * {@link IAccessControlService} service that uses {@link ISession#getUserId()} as internal cache key required by
 * {@link AbstractAccessControlService} implementation.
 * <p>
 * Replace this service at server side to load permission collection. It is <b>not</b> required to implement
 * {@link #execLoadPermissions(String)} at client side.
 */
public class AccessControlService extends AbstractAccessControlService<String> {

  @Override
  protected String getCurrentUserCacheKey() {
    return Sessions.getCurrentUserId();
  }

  @Override
  protected IPermissionCollection execLoadPermissions(String userId) {
    return null;
  }
}
