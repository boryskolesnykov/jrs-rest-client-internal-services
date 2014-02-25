/*
 * Copyright (C) 2005 - 2014 Jaspersoft Corporation. All rights  reserved.
 * http://www.jaspersoft.com.
 *
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License  as
 * published by the Free Software Foundation, either version 3 of  the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero  General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public  License
 * along with this program.&nbsp; If not, see <http://www.gnu.org/licenses/>.
 */

package com.jaspersoft.jasperserver.jaxrs.client.apiadapters.bundles;

import com.jaspersoft.jasperserver.jaxrs.client.apiadapters.AbstractAdapter;
import com.jaspersoft.jasperserver.jaxrs.client.core.JerseyRequestBuilder;
import com.jaspersoft.jasperserver.jaxrs.client.core.SessionStorage;
import com.jaspersoft.jasperserver.jaxrs.client.core.operationresult.OperationResult;

import java.util.List;
import java.util.Map;

public class BundlesService extends AbstractAdapter {

    public BundlesService(SessionStorage sessionStorage) {
        super(sessionStorage);
    }

    public OperationResult<List<String>> bundles(){
        Class clazz = List.class;
        Class<List<String>> clazz_t = clazz;
        return JerseyRequestBuilder.buildRequest(sessionStorage, clazz_t, new String[]{"/bundles"}).get();
    }

    public OperationResult<Map<String, String>> bundle(String name){
        Class clazz = Map.class;
        Class<Map<String, String>> clazz_t = clazz;
        return JerseyRequestBuilder.buildRequest(sessionStorage, clazz_t, new String[]{"/bundles", name}).get();
    }
}
