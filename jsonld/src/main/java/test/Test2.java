package test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


import com.github.jsonldjava.jena.JenaJSONLD;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.github.jsonldjava.core.JsonLdError;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.jena.JenaRDFParser;
import com.github.jsonldjava.utils.Obj;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class Test2 {

  static {
		JenaJSONLD.init();
  }

  public static void main(String[] args) throws Exception {
                final String turtle = "@prefix const: <http://foo.com/> .\n"
                + "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n"
                + "<http://localhost:8080/foo1> const:code \"123\" .\n"
                + "<http://localhost:8080/foo2> const:code \"ABC\"^^xsd:string .\n";
        final Model modelResult = ModelFactory.createDefaultModel().read(
                new ByteArrayInputStream(turtle.getBytes()), "", "TURTLE");
        final JenaRDFParser parser = new JenaRDFParser();
        final Object json = JsonLdProcessor.fromRDF(modelResult, parser);
        System.out.println(json) ;
  }

}
