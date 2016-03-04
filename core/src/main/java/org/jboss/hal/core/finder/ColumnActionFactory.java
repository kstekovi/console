/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.hal.core.finder;

import elemental.dom.Element;
import org.jboss.gwt.elemento.core.Elements;
import org.jboss.hal.resources.CSS;

import static org.jboss.hal.resources.CSS.fontAwesome;
import static org.jboss.hal.resources.CSS.pfIcon;

/**
 * @author Harald Pehl
 */
public class ColumnActionFactory {

    public <T> ColumnAction<T> add(String id) {
        return add(id, null);
    }

    public <T> ColumnAction<T> add(String id, ColumnActionHandler<T> action) {
        Element element = new Elements.Builder().span().css(pfIcon("add-circle-o")).end().build();
        return new ColumnAction<>(id, element, action);
    }

    public <T> ColumnAction<T> refresh(String id) {
        return refresh(id, null);
    }

    public <T> ColumnAction<T> refresh(String id, ColumnActionHandler<T> action) {
        Element element = new Elements.Builder().span().css(fontAwesome(CSS.refresh)).end().build();
        return new ColumnAction<>(id, element, action);
    }
}
