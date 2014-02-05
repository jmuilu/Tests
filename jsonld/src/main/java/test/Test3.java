package test;

import java.io.StringReader;

import org.openrdf.rio.Rio;
import org.openrdf.rio.RDFFormat;

public class Test3 {

	public static void main(String[] args) throws Exception {
		final String turtle = "@prefix const: <http://foo.com/> .\n"
				+ "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n"
				+ "<http://localhost:8080/foo1> const:code \"123\" .\n"
				+ "<http://localhost:8080/foo2> const:code \"ABC\"^^xsd:string .\n";
		Rio.write(Rio.parse(new StringReader(turtle), "", RDFFormat.TURTLE), System.out, RDFFormat.JSONLD);
    }
}
