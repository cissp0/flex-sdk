/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package flex2.compiler.mxml.dom;

import flex2.compiler.util.QName;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents an &lt;request&gt; tag in the MXML language namespace.
 *
 * @author Clement Wong
 */
public class RequestNode extends Node
{
	public static final Set<QName> attributes;

	static
	{
		attributes = new HashSet<QName>();
		attributes.add(new QName("", "format"));
	}

	RequestNode(String uri, String localName, int size)
	{
		super(uri, localName, size);
	}

	public void analyze(Analyzer analyzer)
	{
		analyzer.prepare(this);
		analyzer.analyze(this);
	}
}
