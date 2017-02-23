/*
 * (C) Copyright 2016 Nuxeo SA (http://nuxeo.com/) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     vdutat
 *
 */
package org.nuxeo.pathsegment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.nuxeo.ecm.core.api.pathsegment.PathSegmentServiceDefault;

public class CustomPathSegmentService extends PathSegmentServiceDefault {

    protected static final Log log = LogFactory.getLog(CustomPathSegmentService.class);

	@Override
	public String generatePathSegment(String s) {
		s = super.generatePathSegment(s);
		s = s.replace(';', '-');
		log.warn("<generatePathSegment> segment: " + s);
		return s;
	}

}
