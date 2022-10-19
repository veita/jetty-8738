

package test;


import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;

import junit.framework.TestCase;


public final class Jetty8738TestCase extends TestCase
{
	public void test() throws Exception
	{
		final DocumentBuilderFactory factory;

		factory = DocumentBuilderFactory.newInstance();

		factory.newDocumentBuilder().parse(new File("src/test/resources/jetty.xml"));
	}
}
