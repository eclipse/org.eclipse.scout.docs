/*******************************************************************************
 * Copyright (c) 2015 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.widgets.client.ui.desktop;

import org.eclipse.scout.rt.client.ui.form.IForm;

/**
 * Provides a form instance which is displayed when Desktop is in bench-only mode.
 */
public interface IBenchFormProvider {

  IForm provideForm();

}
